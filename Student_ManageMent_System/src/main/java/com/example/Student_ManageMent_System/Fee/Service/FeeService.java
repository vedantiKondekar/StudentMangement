package com.example.Student_ManageMent_System.Fee.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Student_ManageMent_System.Fee.Entity.Fee;
import com.example.Student_ManageMent_System.Fee.Repository.FeeRepository;



public class FeeService {

	

	@Autowired
	FeeRepository feerepository;
	
			private static long calculateRemainingFee(long Totalfee, long Total_paid_fee)
			{
				long remaining_fees=Totalfee-Total_paid_fee;
				return remaining_fees;
			}
 
	 
	    public Fee createfee(Fee fee) {
		long totalfee=40000l;
		System.out.println(fee.getTotal_paid_fee());
		long remaining_fees  =  calculateRemainingFee(totalfee,fee.getTotal_paid_fee());
		if(remaining_fees>0)
		{
			fee.setTotalfee(totalfee);
			long total_paid_fee=fee.getTotal_paid_fee();
		    fee.setTotal_paid_fee( total_paid_fee);
			fee.setRemanining_fees(remaining_fees);
			
			
		}
		

		      return feerepository.save(fee);
	       }
	    
	    
	public String deletefeetarnsaction(Long transactionid) {
		Optional<Fee> dofee=feerepository.findById(transactionid);
		
		if(dofee.isPresent())
		{
			feerepository.deleteById(transactionid);
			return "Record successfully deleted";
		}
		else {
		return "Record is not present in database.. or deleted before";
		}
		
		
		
	}

	public Optional<Fee> getFeeDetailsById(Long transactionid) {
		
		return feerepository.findById(transactionid);
	}
	
	
}
