package lab4;

import nu.xom.*;

public class Driver extends Personal {

    public Driver(int id, String name, int workTime,int base) {
        super(id, name, workTime,base);
        this.payment = payment(workTime,base);
    }

    @Override
    public int payment(int workTime, int base) {
        return super.payment(workTime, base);
    }
}
