package com.grow.college.base.service;

import com.grow.college.base.dao.BaseDAO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 *
 * Service基类
 * 1.传入实体类  2 传入实体类DAO 3传入实体类主键类型 一般Integer/Long
 * Created by chenzhengwei on 2017/4/23.
 */
public abstract class AbstractBaseDataService<T, DAO extends BaseDAO<T, ID>, ID extends Serializable> implements BaseService{

    public abstract DAO getEntityDao();

    public List<T> findAll() {
        return getEntityDao().findAll();
    }

    public T save(T o) {
        o = getEntityDao().save(o);
        getEntityDao().flush();
        return o;
    }

    /*public void delete(T o) {
        getEntityDao().delete(o);
    }*/

    public T findById(ID id){
        return getEntityDao().findById(id);
    }

    public void delete(ID id) {
        getEntityDao().delete(id);
    }

    public void delete(Collection<T> entities) {
        getEntityDao().delete(entities);
    }

    public Page<T> findPage(Pageable pageable){
        return getEntityDao().findAll(pageable);
    }




}
