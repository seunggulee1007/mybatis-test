package com.yeseung.mybatistest2.mapper;

import com.yeseung.mybatistest2.entity.Test;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

    Test selectTest();

    void insertTest(Long id);

}
