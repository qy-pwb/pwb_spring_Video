package com.dafei.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dafei.domain.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryMapper extends BaseMapper<Category> {

    List<Category> findAll();
}
