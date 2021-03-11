package br.jardim.hrpayroll.services;

import br.jardim.hrpayroll.entity.Payment;
import br.jardim.hrpayroll.entity.Worker;
import br.jardim.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    /*
    //permite pegar propriedades
    @Value("${hr-worker.host}")
    private String workerHost;

    //Só podemos injetar este objeto graças ao Bean na classe AppConfig
    /*  @Autowired
    private RestTemplate restTemplate;
    ***** substituímos o rest template por open feign
    */

    @Autowired
    private WorkerFeignClient workerFeignClient;


    /* public Payment getPayment(long workerId, int days){
        //Criar "mapa" ou "dicionário de parametros"
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("id", ""+workerId);

        *
        *Para pegarmos um Worker do outro MS precisamos ter a estrutura da classe
        * precisamos tambem de um Map contendo as variaveis da URi que serao utilizadas,
        * getForObject(path da requisicao, tipo do objeto, variaveis de uri mapeadas no Map)
        *
        Worker worker = restTemplate.getForObject(
                workerHost + "/workers/{id}",
                Worker.class,
                uriVariables
        );

        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }*/

    public Payment getPayment(long workerId, int days){

        Worker worker = workerFeignClient.findById(workerId).getBody();

        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
