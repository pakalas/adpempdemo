package com.spakala.springboot.empsalarydemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
	
	List<Payment> allPayments = new ArrayList(Arrays.asList(
			new Payment(1, "Alice", 2000, 0, "Jan1"),
			new Payment(2, "Bob", 3000, 0, "Jan1"),
			new Payment(3, "Charan", 4000, 0, "Jan1"),
			new Payment(1, "Alice", 2000, 0, "Jan15"),
			new Payment(2, "Bob", 3000, 0, "Jan15"),
			new Payment(3, "Charan", 4000, 0, "Jan15"),
			new Payment(1, "Alice", 2000, 0, "Feb1"),
			new Payment(2, "Bob", 3000, 0, "Feb1"),
			new Payment(3, "Charan", 4000, 0, "Feb1"),
			new Payment(1, "Alice", 2000, 0,"Feb15"),
			new Payment(2, "Bob", 3000, 0,"Feb15"),
			new Payment(3, "Charan", 4000, 0,"Feb15"),
			new Payment(1, "Alice", 2000, 0, "Mar1"),
			new Payment(2, "Bob", 3000, 0,"Mar1"),
			new Payment(3, "Charan", 4000, 0,"Mar1"),
			new Payment(1, "Alice", 2000, 1000, "Mar15"),
			new Payment(2, "Bob", 3000, 1500, "Mar15"),
			new Payment(3, "Charan", 4000, 2000, "Mar15")
			));
	
	@RequestMapping("/payments")
	public List<Payment> getAllPayments() {
		return allPayments;		
	}
	
	
	@RequestMapping("/monthly")
	public Map<String, Integer> getMonthlyPayoutsPerEmployee() {
		
		Map<String, Integer> compositeKeyMap = new HashMap<>();
		
		for(Payment p : allPayments) {
		
			if(compositeKeyMap.get(String.valueOf(p.getId())+monthAcro(p.getDate())) ==null) {
				compositeKeyMap.put(String.valueOf(p.getId())+monthAcro(p.getDate()), 							
						Integer.valueOf(p.getBonus()+p.getRegularSalary())
						);
			}
			else {
				compositeKeyMap.put(String.valueOf(p.getId())+monthAcro(p.getDate()), 							
						compositeKeyMap.get(String.valueOf(p.getId())+monthAcro(p.getDate()))
						+Integer.valueOf(p.getBonus()+p.getRegularSalary())
						);			
		
			}
		}
		return compositeKeyMap;
		
	}
	
	private String monthAcro(String date) {
		return org.apache.commons.lang3.StringUtils.left(date, 3);
	}
}
