//package com.account.proxy.model;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.account.proxy.proxy.AccountProxy;
//
//@RestController
//public class CustomerProxyController {
//	
//	@Autowired
//	AccountProxy accountProxy;
//	
//	@GetMapping(path="/customer/proxy/id/{id}")
//	public Customer findById(@PathVariable int id) {
//		return accountProxy.findById(id);
//		
//	}
//
//}
