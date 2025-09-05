package com.atiff.servlet;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-api")
public class CustomerOperationsController {
	
	@GetMapping("/report")
	public ResponseEntity<String> showCustomerReport() {
		System.out.println("CustomerOperationsController.showCustomerReport()");
		return new ResponseEntity<String>("Report Operation", HttpStatus.OK);
	}
	
	@PostMapping("/register")
	public ResponseEntity<String> registerCustomer() {
		System.out.println("CustomerOperationsController.registerCustomer()");
		return new ResponseEntity<String>("Customer Registration Operation", HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateCustomer() {
		System.out.println("CustomerOperationsController.updateCustomer()");
		return new ResponseEntity<String>("customer update operation", HttpStatus.OK);
	}
	
	@PatchMapping("/pupdate")
	public ResponseEntity<String> updateCustomerEmail() {
		System.out.println("CustomerOperationsController.updateCustomerEmail()");
		return new ResponseEntity<String>("customer email update operation",HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteCustomer() {
		System.out.println("CustomerOperationsController.deleteCustomer()");
		return new ResponseEntity<String>("Customer delete operation",HttpStatus.OK);
	}
	
	

}
