package com.ssdp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssdp.entity.PaymentMethod;
import com.ssdp.service.PaymentService;

@RequestMapping("/paymentMethods")
@RestController
public class PaymentMethodController {
	@Autowired
	PaymentService paymentMethodService;
	
	@GetMapping
	List<PaymentMethod> getAllPaymentMethods(){
		return paymentMethodService.getAllPaymentMethods();
	}
	

}
