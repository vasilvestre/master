package Dao;

import java.io.Serializable;
import java.util.List;

interface AdherentInterface<T, Id extends Serializable> {

    public void persist(T entity);

    public void update(T entity);

    public T findById(Id id);

    public void delete(T entity);

    public List<T> findAll();

    public List<T> findAllOrderBy(String field, String order);

    public void deleteAll();

}
