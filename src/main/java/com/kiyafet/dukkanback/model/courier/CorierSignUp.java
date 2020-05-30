package com.kiyafet.dukkanback.model.courier;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class CorierSignUp {

    private String email;
    private int phonenumber;
    private List<MultipartFile> documents;
}
