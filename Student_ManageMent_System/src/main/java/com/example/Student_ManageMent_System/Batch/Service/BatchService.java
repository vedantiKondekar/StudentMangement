package com.example.Student_ManageMent_System.Batch.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student_ManageMent_System.Batch.Entity.Batch;
import com.example.Student_ManageMent_System.Batch.Repository.BatchRepository;

@Service
public class BatchService {

	@Autowired
	BatchRepository batchrepository;
	public Batch createBatch(Batch batch) {
		
		return batchrepository.save(batch);
	}

}
