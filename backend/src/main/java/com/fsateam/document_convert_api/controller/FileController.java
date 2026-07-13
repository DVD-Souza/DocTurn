package com.fsateam.document_convert_api.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Controller
@RequestMapping(path = "/converter")
public class FileController {

    private final FileService service;


    public FileController(){
        this.service = new FileService();
    }

    @PostMapping
    public ResponseEntity<?> FileConversion(@RequestParam("File") MultipartFile file) {
       return null;
    };

}
