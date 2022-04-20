package com.sghatuwa.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DocumentController {

    @GetMapping("/getDocuments")
    public ResponseEntity<Void> getDocuments(){
        System.out.println("true = ");
        return ResponseEntity.ok().build();
    }
}
