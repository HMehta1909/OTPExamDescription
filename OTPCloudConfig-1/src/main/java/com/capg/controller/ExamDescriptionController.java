package com.capg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.model.ExamDescription;
import com.capg.service.ExamService;


	@RestController
	@RequestMapping("/ExamDescription")
	public class ExamDescriptionController {
		@Autowired
		ExamService examService;
		
		@PostMapping("/addExamDescription")
		public ResponseEntity<String> addExamDescriptionDetails(@Validated @RequestBody ExamDescription examdescription){
		    ExamDescription examResponse = examService.addExamDescription(examdescription);
			return new ResponseEntity<String>(examResponse.toString(), HttpStatus.OK);
		}
		
}
