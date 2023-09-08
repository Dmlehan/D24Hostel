package com.d24.manage.service.custom;



import com.d24.manage.dto.RoomDto;
import com.d24.manage.service.SuperService;

import java.util.List;

public interface RoomService extends SuperService<RoomDto,String> {
    List<RoomDto> roomSearchByText(String text);
    int getRoomCount();
}
