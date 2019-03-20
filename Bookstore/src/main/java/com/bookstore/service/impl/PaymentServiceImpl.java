package com.bookstore.service.impl;

import org.springframework.stereotype.Service;

import com.bookstore.domain.Payment;
import com.bookstore.domain.UserPayment;
import com.bookstore.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Override
	public void setByUserPayment(UserPayment userPayment, Payment payment) {
		payment.setType(userPayment.getType());
		payment.setHolderName(userPayment.getHolderName());
		payment.setCardNumber(userPayment.getCardNumber());
		payment.setExpiryMonth(userPayment.getExpiryMonth());
		payment.setExpiryYear(userPayment.getExpiryYear());
		payment.setCvc(userPayment.getCvc());
	}

}
