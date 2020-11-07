package lab4;

import java.util.ArrayList;

public class ProjectManager extends Manager implements Heading {
    public ProjectManager(int id, String name, int workTime, String projectName, int budget, double part, ArrayList<Manager> managerArrayList) {
        super(id, name, workTime, projectName, budget, part);
        this.payment = (int)project(budget, part)+payForSubjects(managerArrayList.size());
    }

    @Override
    public double project(int budget, double part) {
        return super.project(budget, part);
    }

    @Override
    public int payForSubjects(int countOfSubject) {
        return countOfSubject*600;
    }
}
