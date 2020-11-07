package lab4;

import java.util.ArrayList;

public class SeniorManager extends ProjectManager {
    public SeniorManager(int id, String name, int workTime,
                         String projectName, int budget, double part,
                         ArrayList<Manager> managerArrayList,
                         ArrayList<ProjectManager> projectManagerArrayList) {
        super(id, name, workTime, projectName, budget, part, managerArrayList);
        this.payment = (int) project(budget, part) +
                payForSubjects(managerArrayList.size()) +
                payForSubjects(projectManagerArrayList.size());
    }

    @Override
    public double project(int budget, double part) {
        return super.project(budget, part);
    }

    @Override
    public int payForSubjects(int countOfSubject) {
        return super.payForSubjects(countOfSubject);
    }
}
