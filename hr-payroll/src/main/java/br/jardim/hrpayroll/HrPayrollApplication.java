package br.jardim.hrpayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


//Eureka ja possui balanceamento de carga acoplado, nao precisa do Ribbon
@EnableEurekaClient
//HR Payroll será um cliente Ribbon que ira utilizar o balanceamento de carga para fazer requisicoes para Worker
//Para habilitar o uso do Feign (comunicação entre MS)
//@RibbonClient(name = "hr-worker")
@EnableFeignClients
@SpringBootApplication
public class HrPayrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrPayrollApplication.class, args);
	}

}
