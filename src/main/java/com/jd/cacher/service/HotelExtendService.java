package com.jd.cacher.service;

import com.jd.cacher.entity.HotelExtendInfo;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by yangyuan on 16-5-26.
 */
public interface HotelExtendService {


    HotelExtendInfo getHotelExtendInfoById(Integer id);
}
