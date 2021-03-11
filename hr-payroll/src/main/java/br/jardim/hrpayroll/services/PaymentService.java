package br.jardim.hrpayroll.services;

import br.jardim.hrpayroll.entity.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days){
        return new Payment("Bob", 200.0, days);
    }
}
