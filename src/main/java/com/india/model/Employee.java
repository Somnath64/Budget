package main.java.com.india.model;

public class Employee {
    private String employeeId;

    private String employeeName;

    private int salaryPerHour;

    private int noOfLeavingDay;

    private int noOfTravelDay;

    public Employee() {
    }

    public Employee(String employeeId, String employeeName, int salaryPerHour, int noOfLeavingDay, int noOfTravelDay) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salaryPerHour = salaryPerHour;
        this.noOfLeavingDay = noOfLeavingDay;
        this.noOfTravelDay = noOfTravelDay;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", salaryPerHour=" + salaryPerHour +
                ", noOfLeavingDay=" + noOfLeavingDay +
                ", noOfTravelDay=" + noOfTravelDay +
                '}';
    }
}
