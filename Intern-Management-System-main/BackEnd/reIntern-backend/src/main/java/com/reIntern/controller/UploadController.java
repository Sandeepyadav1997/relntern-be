package com.reIntern.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reIntern.model.upload;
import com.reIntern.service.UploadService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class UploadController {
	
	@Autowired
    private UploadService uploadService;
	
	@PostMapping("/uploaddocument")
	public upload uploadDocument(@RequestBody upload upload) {
		return uploadService.uploadDocument(upload);
	}
	
//	@GetMapping("/getInternDocument/{id}")
//	public List<upload> getDocumentByInternId(@PathVariable int id) {
//		return uploadService.getDocumentByInternId(id);
//	}

}
