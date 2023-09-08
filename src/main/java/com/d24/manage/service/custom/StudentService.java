package com.d24.manage.service.custom;



import com.d24.manage.dto.StudentDto;
import com.d24.manage.service.SuperService;

import java.util.List;

public interface StudentService extends SuperService<StudentDto,String> {
    List<StudentDto> studentSearchByText(String text);
    int getStudentCount();
}
