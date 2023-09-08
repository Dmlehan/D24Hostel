package com.d24.manage.service;



import com.d24.manage.dto.SuperDto;

import java.io.Serializable;
import java.util.List;

public interface SuperService <T extends SuperDto,ID extends Serializable> {
    boolean save(T dto);
    boolean update(T dto);
    boolean delete(T dto);
    T search(ID id);
    List<T> getAll();
    ID getLastId();
}
