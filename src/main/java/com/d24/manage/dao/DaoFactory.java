package com.d24.manage.dao;


import com.d24.manage.dao.custom.impl.ReservationDaoImpl;
import com.d24.manage.dao.custom.impl.RoomDaoImpl;
import com.d24.manage.dao.custom.impl.StudentDaoImpl;
import com.d24.manage.dao.custom.impl.UserDaoImpl;

public class DaoFactory {

    private static DaoFactory daoFactory ;
    private DaoFactory() {}

    public static DaoFactory getInstance(){
        return daoFactory==null?(daoFactory=new DaoFactory()):daoFactory;
    }

    public <T extends SuperDao> T getDao(DaoType daoType) {
        switch (daoType){
            case STUDENT_DAO:
                return (T)new StudentDaoImpl();

            case ROOM_DAO:
                return (T)new RoomDaoImpl();

            case RESERVATION_DAO:
                return (T)new ReservationDaoImpl();

            case USER_DAO:
                return (T) new UserDaoImpl();

            default:
                return null;

        }

    }
}
