package com.kiyafet.dukkanback.model.courier;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class CourierLogin {

    @Email(message = "Email formatında olmalı")
    @NotNull(message ="Email null olamaz")
    @NotEmpty(message = "Email boş olamaz")
    private String email;

    @Size(min = 7,max = 25,message = "Parola min 7 max 25 karakter")
    @NotNull(message = "Parola null olamaz")
    private String password;

}
