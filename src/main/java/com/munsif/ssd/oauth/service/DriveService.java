package com.munsif.ssd.oauth.service;

import org.springframework.web.multipart.MultipartFile;

public interface DriveService {

	void uploadFile(MultipartFile multipartFile) throws Exception;

	void downloadFile() throws Exception;
}
