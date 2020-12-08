package com.ssdp.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssdp.dto.PaymentMethodDTO;
import com.ssdp.entity.PaymentMethod;
import com.ssdp.mapper.PaymentMethodMapper;
import com.ssdp.repository.PaymentMethodRepo;

@Service
public class PaymentService {
	@Autowired
	PaymentMethodRepo paymentMethodRepo;
	
	public PaymentMethod addPaymentMethod(PaymentMethodDTO paymentMethodDTO){
		PaymentMethodMapper mapper = Mappers.getMapper(PaymentMethodMapper.class);
		PaymentMethod paymentMethod = mapper.dtoToEntity(paymentMethodDTO);
		return paymentMethodRepo.save(paymentMethod);
		
	}
	
	
	public  void deletePaymentMethod(int id) {
		
		 paymentMethodRepo.deleteById(id);
		
	}
	
	public List<PaymentMethod> getAllPaymentMethods(){
		List<PaymentMethod> list = new ArrayList<>();
		 paymentMethodRepo.findAll().forEach(l->list.add(l));
		 return list;
		
	}
	
	public Optional<PaymentMethod> getPaymentMethodById(int id) {
		return paymentMethodRepo.findById(id);
	}

}
