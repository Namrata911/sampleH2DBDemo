package com.ssdp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor
public class PaymentMethod {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	int id;
	String method;

}
