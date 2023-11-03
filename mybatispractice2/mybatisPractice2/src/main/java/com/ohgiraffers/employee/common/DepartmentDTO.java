package com.ohgiraffers.employee.common;

public class DepartmentDTO {
    private String deptid;
    private String depttitle;
    private String locationid;

    public DepartmentDTO() {
    }

    public DepartmentDTO(String deptid, String depttitle, String locationid) {
        this.deptid = deptid;
        this.depttitle = depttitle;
        this.locationid = locationid;
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public String getDepttitle() {
        return depttitle;
    }

    public void setDepttitle(String depttitle) {
        this.depttitle = depttitle;
    }

    public String getLocationid() {
        return locationid;
    }

    public void setLocationid(String locationid) {
        this.locationid = locationid;
    }

    @Override
    public String toString() {
        return "DepartmentDTO{" +
                "deptid='" + deptid + '\'' +
                ", depttitle='" + depttitle + '\'' +
                ", locationid='" + locationid + '\'' +
                '}';
    }
}
