package lab4;

public abstract class Personal extends Employee implements WorkTime {

    public Personal(int id, String name, int workTime,int base ) {
        super(id, name, workTime);
        payment=payment(workTime,base);
    }

    @Override
    public int payment(int workTime, int base) {
        return workTime*base;
    }
}
