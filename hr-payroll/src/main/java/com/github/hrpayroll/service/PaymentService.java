package com.github.hrpayroll.service;

import org.springframework.stereotype.Service;

import com.github.hrpayroll.entity.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Lucas", 200.0, days);
	}
}
