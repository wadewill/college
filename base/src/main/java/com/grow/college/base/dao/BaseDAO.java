package com.grow.college.base.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * Created by chenzhengwei on 2017/4/23.
 */
@NoRepositoryBean
public interface BaseDAO<T, ID extends Serializable> extends JpaRepository<T,ID>{

    T findById(ID id);
}
