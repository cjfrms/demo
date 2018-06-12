package com.geuni.demo.service;

import com.geuni.demo.common.persistence.SqlManager;
import com.geuni.demo.mapper.SampleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class SampleService {

    @Autowired
    private SampleMapper sampleMapper;
    @Autowired
    private SqlManager sqlManager;

    public List<HashMap> getAll(){
        return sqlManager.getList("com.geuni.demo.mapper.SampleMapper.getAll");
        //return sampleMapper.getAll();
    }
}
