package br.jardim.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    /*
    * Anotação Bean no método permite instanciar um objeto SIngleton para termos
    * disponível para injecao na aplicacao
    * */
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
