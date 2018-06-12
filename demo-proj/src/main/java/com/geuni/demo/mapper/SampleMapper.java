package com.geuni.demo.mapper;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface SampleMapper {

    List<HashMap> getAll();
}
