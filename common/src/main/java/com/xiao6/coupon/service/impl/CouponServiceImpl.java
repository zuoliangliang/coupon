package com.xiao6.coupon.service.impl;

import com.xiao6.coupon.mapper.CouponMapper;
import com.xiao6.coupon.mapper.model.Coupon;
import com.xiao6.coupon.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouponServiceImpl implements CouponService{

    @Autowired
    private CouponMapper couponMapper;

    @Override
    public void save(Coupon coupon){
        couponMapper.save(coupon);
    }
}
