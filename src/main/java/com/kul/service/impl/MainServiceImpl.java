package com.kul.service.impl;

import com.kul.service.IMainService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@Slf4j
public class MainServiceImpl implements IMainService {
    @Override
    public String uploadVideo(MultipartFile file, String fileName) {
        if (file.getSize() > 30 * 1024 * 1024) {
            log.error("当前文件大小已经超出30M");
        }
        return "/" + fileName;
    }
}
