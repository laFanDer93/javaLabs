package lab4;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader extends Programmer implements Heading {
    public TeamLeader(int id, String name, int workTime, int base, String projectName, int budget, double part, List<Programmer> programmers) {
        super(id, name, workTime, base, projectName, budget, part);
        this.payment = payForSubjects(programmers.size())+(int)project(budget,part)+payment(workTime,base);
    }

    @Override
    public double project(int budget, double part) {
        return super.project(budget, part);
    }

    @Override
    public int payment(int workTime, int base) {
        return super.payment(workTime, base);
    }

    @Override
    public String toString() {
        return "TeamLeader{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", workTime=" + workTime +
                ", payment=" + payment +
                '}';
    }

    @Override
    public int payForSubjects(int countOfSubject) {
        return countOfSubject*1000;
    }
}