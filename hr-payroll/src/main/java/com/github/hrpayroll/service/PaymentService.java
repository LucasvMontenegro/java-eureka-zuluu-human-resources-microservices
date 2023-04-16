package com.github.hrpayroll.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.hrpayroll.entity.Payment;
import com.github.hrpayroll.entity.Worker;
import com.github.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {	
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerId, int days) {
		Worker worker = workerFeignClient.findByID(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
