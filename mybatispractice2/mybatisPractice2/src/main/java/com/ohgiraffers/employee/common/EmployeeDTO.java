package com.ohgiraffers.employee.common;

public class EmployeeDTO {
    private String empid;
    private String empname;
    private String empno;
    private String email;
    private String phone;
    private String deptcode;
    private String jobcode;
    private String sallevel;
    private int salary;
    private double bonus;
    private String managerid;
    private String hiredate;
    private String entdate;
    private String entyn;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String empid, String empname, String empno, String email, String phone, String deptcode, String jobcode, String sallevel, int salary, double bonus, String managerid, String hiredate, String entdate, String entyn) {
        this.empid = empid;
        this.empname = empname;
        this.empno = empno;
        this.email = email;
        this.phone = phone;
        this.deptcode = deptcode;
        this.jobcode = jobcode;
        this.sallevel = sallevel;
        this.salary = salary;
        this.bonus = bonus;
        this.managerid = managerid;
        this.hiredate = hiredate;
        this.entdate = entdate;
        this.entyn = entyn;
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

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getSallevel() {
        return sallevel;
    }

    public void setSallevel(String sallevel) {
        this.sallevel = sallevel;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getManagerid() {
        return managerid;
    }

    public void setManagerid(String managerid) {
        this.managerid = managerid;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public String getEntdate() {
        return entdate;
    }

    public void setEntdate(String entdate) {
        this.entdate = entdate;
    }

    public String getEntyn() {
        return entyn;
    }

    public void setEntyn(String entyn) {
        this.entyn = entyn;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "empid='" + empid + '\'' +
                ", empname='" + empname + '\'' +
                ", empno='" + empno + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", deptcode='" + deptcode + '\'' +
                ", jobcode='" + jobcode + '\'' +
                ", sallevel='" + sallevel + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", managerid='" + managerid + '\'' +
                ", hiredate='" + hiredate + '\'' +
                ", entdate='" + entdate + '\'' +
                ", entyn='" + entyn + '\'' +
                '}';
    }
}

