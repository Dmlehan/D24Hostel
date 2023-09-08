package com.d24.manage.dao.custom;


import com.d24.manage.dao.CrudDao;
import com.d24.manage.entity.Reservation;
import org.hibernate.Session;

import java.util.List;

public interface ReservationDao extends CrudDao<Reservation,String> {
    public List<Reservation> reservationSearchByText(String text, Session session);
    List<Reservation> getNotPaidKeyMoney(Session session);
}
