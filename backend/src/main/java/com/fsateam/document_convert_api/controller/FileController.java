package com.fsateam.document_convert_api.controller;


import com.fsateam.document_convert_api.service.FileService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;


@Controller
@RequestMapping(path = "/converter")
public class FileController {

    private final FileService service;


    public FileController(){
        this.service = new FileService();
    }

    @PostMapping
    public ResponseEntity<?> UploadFile(@RequestParam("File") MultipartFile file) {
       return null;

    }

}
