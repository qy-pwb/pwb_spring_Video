package com.dafei.service;

import com.dafei.domain.Category;

import java.util.List;

public interface CategoryService {
    public List<Category> findAll();
    public Category findById(Integer id);

    public Category findByCid(String id);

    void updateCategoryById(Category category);

    void addCategory(Category category);

    Integer deleteById(String id);

    Integer deleteBatchIds(List<Integer> ids);

}

