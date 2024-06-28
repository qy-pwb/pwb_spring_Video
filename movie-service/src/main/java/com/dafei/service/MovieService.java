package com.dafei.service;

import com.dafei.domain.Movie;

import java.util.List;

public interface MovieService {


    // 查询 影视列表
    public List<Movie> findAll();

    // 根据id 去查询一个影视信息
    public Movie findMovieById(String id);

    // 修改
    public void updateMovieById(Movie movie);

    // 添加
    public void addMovie(Movie movie);

    // 删除
    public void deleteById(String id);

    //////////////////////

    void save(Movie movie);

    Movie findById(Integer id);

    void update(Movie movie);

    List<Movie> findByCid(Integer cid);

    Integer deleteBatchIds(List<Integer> ids);
}
