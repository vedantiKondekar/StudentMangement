package com.example.Student_ManageMent_System.Batch.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student_ManageMent_System.Batch.Entity.Batch;
import com.example.Student_ManageMent_System.Batch.Service.BatchService;


@RestController
public class BatchController {
	@Autowired
	BatchService  batchservice;
	
	@PostMapping("/batch")
	public Batch createBatch(@RequestBody Batch batch)
	{
		return batchservice.createBatch(batch);
	}
	
}
