package com.ohgiraffers.employee.mapper;

import com.ohgiraffers.employee.common.EmployeeAndJobAndDepartmentDTO;

import java.util.List;

public interface EmployeeMapper {
    List<EmployeeAndJobAndDepartmentDTO> selectAllEmployee();
}
