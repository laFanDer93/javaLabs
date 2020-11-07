package lab4;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public abstract class Employee {
    protected int id;
    protected String name;
    protected int workTime;
    protected int payment;
    protected int base;
    protected String project;
    protected int budget;
    protected double part;

    @SerializedName("SkyScannner")
    @Expose
    private List<Employee> employeeList = null;

    public Employee(int id, String name, int workTime) {
        this.id = id;
        this.name = name;
        this.workTime = workTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }
}
