package com.ohgiraffers.employee.common;

public class JobDTO {
    private String jobcode;
    private String jobname;

    public JobDTO() {
    }

    public JobDTO(String jobcode, String jobname) {
        this.jobcode = jobcode;
        this.jobname = jobname;
    }

    public String getJobcode() {
        return jobcode;
    }

    public void setJobcode(String jobcode) {
        this.jobcode = jobcode;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    @Override
    public String toString() {
        return "JobDTO{" +
                "jobcode='" + jobcode + '\'' +
                ", jobname='" + jobname + '\'' +
                '}';
    }
}
