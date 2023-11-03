package com.ohgiraffers.employee.service;

import com.ohgiraffers.employee.common.EmployeeAndJobAndDepartmentDTO;
import com.ohgiraffers.employee.common.EmployeeDTO;
import com.ohgiraffers.employee.mapper.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.employee.common.Template.getSqlSession;

public class EmployeeService {
    private EmployeeMapper mapper;

    public void selectAllEmployee() {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(EmployeeMapper.class);
        List<EmployeeAndJobAndDepartmentDTO> employeeList = mapper.selectAllEmployee();

        for(EmployeeAndJobAndDepartmentDTO employee : employeeList){
            System.out.println(employee);
        }

        sqlSession.close();

    }

    public void selectEmployeeByName() {
        SqlSession sqlSession =getSqlSession();

    }
}
