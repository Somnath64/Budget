package main.java.com.india.model;

import java.util.Date;
import java.util.List;

public class Project {

    private String projectId;

    private Date startDate;

    private Date endDate;

    private List<Employee> Employee;

    public Project(){

    }

    public Project(String projectId, Date startDate, Date endDate, List<main.java.com.india.model.Employee> employee) {
        this.projectId = projectId;
        this.startDate = startDate;
        this.endDate = endDate;
        Employee = employee;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId='" + projectId + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", Employee=" + Employee +
                '}';
    }
}
