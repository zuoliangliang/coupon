package com.xiao6.coupon.mapper;

import com.xiao6.coupon.mapper.model.Coupon;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CouponMapper {

    @Insert("insert into tb_coupon_card(card_num,card_pwd) values(#{cardNum},#{cardPwd})")
    void save(Coupon coupon);
}
