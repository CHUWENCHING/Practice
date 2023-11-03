package com.ohgiraffers.employee.common;

public class EmployeeAndJobAndDepartmentDTO {

    private String empid;
    private String empname;
    private DepartmentDTO department;
    private JobDTO job;
    private String phone;
    private String deptcode;
    private String jobcode;
    private String empno;

    public EmployeeAndJobAndDepartmentDTO() {
    }

    public EmployeeAndJobAndDepartmentDTO(String empid, String empname, DepartmentDTO department, JobDTO job, String phone, String deptcode, String jobcode, String empno) {
        this.empid = empid;
        this.empname = empname;
        this.department = department;
        this.job = job;
        this.phone = phone;
        this.deptcode = deptcode;
        this.jobcode = jobcode;
        this.empno = empno;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public DepartmentDTO getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDTO department) {
        this.department = department;
    }

    public JobDTO getJob() {
        return job;
    }

    public void setJob(JobDTO job) {
        this.job = job;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    public String getJobcode() {
        return jobcode;
    }

    public void setJobcode(String jobcode) {
        this.jobcode = jobcode;
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    @Override
    public String toString() {
        return "EmployeeAndJobAndDepartmentDTO{" +
                "empid='" + empid + '\'' +
                ", empname='" + empname + '\'' +
                ", department=" + department +
                ", job=" + job +
                ", phone='" + phone + '\'' +
                ", deptcode='" + deptcode + '\'' +
                ", jobcode='" + jobcode + '\'' +
                ", empno='" + empno + '\'' +
                '}';
    }
}
