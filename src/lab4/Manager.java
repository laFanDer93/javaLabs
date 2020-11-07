package lab4;

public class Manager extends Employee implements Project {

    public Manager(int id, String name, int workTime,String projectName, int budget,double part) {
        super(id, name, workTime);
        this.payment = (int)project(budget, part);
    }

    @Override
    public double project(int budget, double part) {
        return budget*part;
    }
}
