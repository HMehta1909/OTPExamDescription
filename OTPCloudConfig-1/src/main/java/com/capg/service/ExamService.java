package com.capg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.Repo.ExamRepo;
import com.capg.model.ExamDescription;


@Service
public class ExamService {
	@Autowired
	ExamRepo examRepo;

	public ExamDescription addExamDescription(ExamDescription examdescriptionObj) {
		return examRepo.save(examdescriptionObj);
	}

//	public List<ExamDescription> queryIdByTraineeename(String traineenameObj) {
//		return examRepo.save(traineenameObj);
//	}

//	public List<ExamDescription> ScoreByTrainee(String traineeIdObj){
//		return examRepo.save(traineeIdObj);
//	}
		
		
	

	
}

