package com.dafei.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dafei.domain.Movie;
import com.dafei.mapper.MovieMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class MovieServiceImpl implements MovieService {

    // 引入 mapper
    @Autowired
    private MovieMapper movieMapper;

    @Override
    public List<Movie> findAll() {
        List<Movie> movieList = this.movieMapper.selectList(null);
        return movieList;
    }

    @Override
    public Movie findMovieById(String id) {
        Movie movie = this.movieMapper.selectById(id);
        return movie;
    }

    @Override
    public void updateMovieById(Movie movie) {
        this.movieMapper.updateById(movie);
    }

    @Override
    public void addMovie(Movie movie) {
        this.movieMapper.insert(movie);
    }
    @Override
    public void deleteById(String id) {
        this.movieMapper.deleteById(id);
    }

    @Override
    public void save(Movie movie) {

    }

   @Override
    public Movie findById(Integer id) {
        return movieMapper.selectById(id);
    }

    @Override
    public void update(Movie movie) {

    }

    @Override
    public List<Movie> findByCid(Integer cid) {
        QueryWrapper<Movie> queryWrapper = new QueryWrapper<Movie>();
        queryWrapper.eq("cid",cid);
        List<Movie> movies = this.movieMapper.selectList(queryWrapper);
        return movies;
    }

    @Override
    public Integer deleteBatchIds(List<Integer> ids) {
        return this.movieMapper.deleteBatchIds(ids);
    }


}
