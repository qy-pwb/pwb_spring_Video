package com.dafei.service;

import com.dafei.domain.Category;
import com.dafei.domain.Member;
import com.dafei.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public List<Category> findAll() {
        List<Category> categoryList = this.categoryMapper.selectList(null);
        return categoryList;
    }



    @Override
    public Category findById(Integer id) {
        return categoryMapper.selectById(id);
    }

    @Override
    public Category findByCid(String id) {
        return null;
    }


//    @Override
//    public List<Category> findByCid(Integer cid) {
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("cid",cid);
//        return this.categoryMapper.selectByMap(map);
//    }

    @Override
    public void updateCategoryById(Category category) {
        this.categoryMapper.updateById(category);

    }

    @Override
    public void addCategory(Category category) {
        this.categoryMapper.insert(category);
    }

    @Override
    public Integer deleteById(String id) {
        int delete = this.categoryMapper.deleteById(id);
        return delete;
    }

    @Override
    public Integer deleteBatchIds(List<Integer> ids) {
        return this.categoryMapper.deleteBatchIds(ids);
    }
    
}
