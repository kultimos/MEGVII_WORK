package com.kul.controller;

import com.kul.service.IMainService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/main")
@RequiredArgsConstructor
public class MainController {

    @Autowired
    private IMainService service;

    /**
     * 上传测试视频文件
     */
    @PostMapping(value = "/video/upload", consumes = "multipart/form-data")
    public String uploadVideo(@RequestParam(value = "file") MultipartFile file, @RequestParam(value = "fileName") String fileName) {
        return this.service.uploadVideo(file, fileName);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
