package com.example.hms.dao.custom;

import com.example.hms.dao.SuperDao;
import com.example.hms.entity.SuperEntity;
import org.hibernate.Session;

import java.util.List;

public interface CrudDao<T extends SuperEntity> extends SuperDao {
    Boolean save(T entity, Session session);

    Boolean update(T entity, Session session);

    Boolean delete(String id, Session session);

    T view(String id, Session session);

    List<T> getAll(Session session);

    String getLastId(Session session);
}
