package com.d24.manage.service.custom;


import com.d24.manage.dto.ReservationDto;
import com.d24.manage.service.SuperService;

import java.util.List;

public interface ReservationService extends SuperService<ReservationDto,String> {
    boolean save(ReservationDto reservationDto);

    boolean update(ReservationDto reservationDto);

    boolean delete(ReservationDto reservationDto);

    ReservationDto search(String id);

    List<ReservationDto> getAll();

    String getLastId();

    List<ReservationDto> reservationSearchByText(String text);
    List<ReservationDto> getNotPaidKeyMoney();
}
