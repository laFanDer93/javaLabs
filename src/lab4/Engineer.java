package lab4;

public class Engineer extends Employee implements Project,WorkTime {
    public Engineer(int id, String name, int workTime,int base, String projectName, int budget, double part) {
        super(id, name, workTime);
        this.payment=payment(workTime,base)+(int)project(budget,part);
    }

    @Override
    public double project(int budget, double part) {
        return budget*part;
    }

    @Override
    public int payment(int workTime, int base) {
        return workTime*base;
    }
}


