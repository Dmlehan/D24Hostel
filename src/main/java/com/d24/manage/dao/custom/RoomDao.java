package com.d24.manage.dao.custom;

import com.d24.manage.dao.CrudDao;
import com.d24.manage.entity.Room;
import org.hibernate.Session;

import java.util.List;

public interface RoomDao extends CrudDao<Room,String> {
    boolean save(Room room, Session session);

    boolean update(Room room, Session session);

    boolean delete(Room room, Session session);

    Room search(String id, Session session);

    List<Room> getAll(Session session);

    String getLastId(Session session);

    List<Room> roomSearchByText(String text, Session session);

    int getRoomCount(Session session);
}
