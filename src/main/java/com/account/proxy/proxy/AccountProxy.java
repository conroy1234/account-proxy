//package com.account.proxy.proxy;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//
//import com.account.proxy.model.Customer;
//
//@FeignClient(name="persistent-service")
//public interface AccountProxy {
//	
//	@GetMapping(path="/customer-service/id/{id}")
//	public Customer findById(@PathVariable int id);
//
//}
