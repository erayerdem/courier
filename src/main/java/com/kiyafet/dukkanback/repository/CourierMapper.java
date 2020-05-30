package com.kiyafet.dukkanback.repository;


import com.kiyafet.dukkanback.model.courier.CourierInitModel;
import com.kiyafet.dukkanback.model.courier.CourierLogin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Optional;

@Mapper
public interface CourierMapper {


    @Select("select * from  client  where email =#{email}  and password = #{password}")
    public Optional<CourierInitModel> findUser( CourierLogin courierLogin );
}
