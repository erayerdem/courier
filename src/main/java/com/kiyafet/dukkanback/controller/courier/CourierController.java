package com.kiyafet.dukkanback.controller.courier;


import com.kiyafet.dukkanback.model.courier.CorierSignUp;
import com.kiyafet.dukkanback.model.courier.CourierInitModel;
import com.kiyafet.dukkanback.model.courier.CourierLogin;
import com.kiyafet.dukkanback.service.courier.CourierService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


@RestController
@AllArgsConstructor
public class CourierController {

    private final CourierService courierService;

    @PostMapping
    public CourierInitModel login( @NotNull @RequestBody @Valid CourierLogin userDbModel ) {

        return courierService.beLogin( userDbModel );
    }

    @PostMapping("hellodude")
    public ResponseEntity singnup( @NotNull @RequestBody @Valid CorierSignUp corierSignUp ) {

        return new ResponseEntity( HttpStatus.CREATED );
    }
}


