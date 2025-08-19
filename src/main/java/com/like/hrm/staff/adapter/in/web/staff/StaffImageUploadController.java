package com.like.hrm.staff.adapter.in.web.staff;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.like.hrm.staff.adapter.out.file.StaffImageUploader;
import com.like.hrm.staff.application.port.in.staff.StaffImageUploadUseCase;

@Controller
public class StaffImageUploadController {
	
	StaffImageUploadUseCase useCase;
	StaffImageUploader uploader;	
			
	public StaffImageUploadController(StaffImageUploadUseCase useCase, StaffImageUploader uploader) {
		this.useCase = useCase;
		this.uploader = uploader;
	}

	@PostMapping("/api/hrm/staff/changeimage")
	public ResponseEntity<?> changeStaffImage(@RequestPart MultipartFile file
											 ,String companyCode
											 ,String staffNo) throws Exception {				
		
		File uploadedFile = uploader.uploadFile(companyCode, staffNo, file);
		
		String fileName = useCase.saveUploadImagePath(companyCode, staffNo, uploadedFile);
							
		return new ResponseEntity<Map<String,Object>>(setUploadResponseBody(fileName), setUploadResponseHeader(), HttpStatus.OK);
	}
	
	
	private Map<String, Object> setUploadResponseBody(String fileName) {		
		Map<String, Object> response = new HashMap<>();
		response.put("data", fileName);
		response.put("status", "done");
				
		return response;
	}
	
	private HttpHeaders setUploadResponseHeader() {
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.setContentType(MediaType.APPLICATION_JSON);
		return responseHeaders;		
	}
}
