package com.kiyafet.dukkanback.service.courier;


import com.kiyafet.dukkanback.model.courier.CourierInitModel;
import com.kiyafet.dukkanback.model.courier.CourierLogin;
import com.kiyafet.dukkanback.repository.CourierMapper;
import lombok.AllArgsConstructor;
import org.springframework.boot.actuate.cache.NonUniqueCacheException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CourierServiceImp implements CourierService {

    private final CourierMapper userMapper;

    @Override
    public CourierInitModel beLogin( CourierLogin courierLogin ) {

        Optional<CourierInitModel> user = userMapper.findUser(courierLogin);
        return  user.orElseThrow( NullPointerException::new );
    }
}
