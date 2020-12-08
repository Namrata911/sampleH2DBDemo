package com.ssdp.mapper;

import java.io.Serializable;

import org.mapstruct.Mapper;

import com.ssdp.dto.PaymentMethodDTO;
import com.ssdp.entity.PaymentMethod;

@Mapper
public interface PaymentMethodMapper extends Serializable {
	PaymentMethodDTO entityToDto (PaymentMethod paymentMethod); 
	PaymentMethod dtoToEntity (PaymentMethodDTO paymentMethodDto); 

}
