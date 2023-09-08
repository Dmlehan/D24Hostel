package com.d24.manage.dao.custom;


import com.d24.manage.dao.CrudDao;
import com.d24.manage.entity.Student;
import org.hibernate.Session;

import java.util.List;

public interface StudentDao extends CrudDao<Student,String> {
    boolean save(Student student, Session session);

    boolean update(Student student, Session session);

    boolean delete(Student student, Session session);

    Student search(String id, Session session);

    List<Student> getAll(Session session);

    String getLastId(Session session);

    List<Student> studentSearchByText(String text, Session session);
    int getStudentCount(Session session);
}
