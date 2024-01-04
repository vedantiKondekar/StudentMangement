package com.example.Student_ManageMent_System.Fee.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Student_ManageMent_System.Fee.Entity.Fee;
import com.example.Student_ManageMent_System.Fee.Service.FeeService;



public class FeeController {

	@Autowired
	FeeService feeservice;
	
	
	@PostMapping("/fee")
	public Fee createfee(@RequestBody Fee fee)
	{
		return  feeservice.createfee(fee);
		
	}
	
	
	@DeleteMapping("/delete/{transactionid}")
	public String deleteFeeTransaction(@PathVariable Long transactionid)
	{
		return feeservice.deletefeetarnsaction(transactionid);
	}
	
	@GetMapping("FeeTransaction/get/{transactionid}")
	public Optional<Fee> getFeeDeatailsById(@PathVariable Long transactionid)
	{
		return feeservice.getFeeDetailsById(transactionid);
		
	}
	
	
}
