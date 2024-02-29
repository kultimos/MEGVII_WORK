package com.kul.service;

import org.springframework.web.multipart.MultipartFile;

public interface IMainService {
    String uploadVideo(MultipartFile file, String fileName);
}
