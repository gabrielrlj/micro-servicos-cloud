package br.jardim.hrpayroll.feignclients;

import br.jardim.hrpayroll.entity.Worker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "hr-worker", path = "/workers")
public interface WorkerFeignClient {
    //assinatura do método igual no Resource do Hr-worker
    @GetMapping(value="/{id}")
    ResponseEntity<Worker> findById(@PathVariable Long id);
}
