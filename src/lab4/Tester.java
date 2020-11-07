package lab4;

public class Tester extends Engineer {

    public Tester(int id, String name, int workTime, int base, String projectName, int budget, double part) {
        super(id, name, workTime, base, projectName, budget, part);
        this.payment = payment(workTime, base) + (int) project(budget, part);
    }

    @Override
    public double project(int budget, double part) {
        return super.project(budget, part);
    }

    @Override
    public int payment(int workTime, int base) {
        return super.payment(workTime, base);
    }
}
