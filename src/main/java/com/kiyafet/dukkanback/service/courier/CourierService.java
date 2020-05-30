package com.kiyafet.dukkanback.service.courier;

import com.kiyafet.dukkanback.model.courier.CourierInitModel;
import com.kiyafet.dukkanback.model.courier.CourierLogin;

public interface CourierService {

    public CourierInitModel beLogin( CourierLogin courierLogin );
}
