package com.tangcheng.app.service.biz;

import com.tangcheng.app.dao.repository.CityRepository;
import com.tangcheng.app.domain.entity.CityDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tang.cheng on 2017/4/26.
 */
@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<CityDO> getCity(String state) {
        return cityRepository.getCity(state);
    }

    @Override
    public List<CityDO> listAll() {
        List<CityDO> cityDOList = cityRepository.listAll();
        CityDO cityDo = cityDOList.get(0);
        System.out.println(cityDo);
        return cityDOList;
    }
}
