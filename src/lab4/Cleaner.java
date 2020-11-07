package lab4;

public class Cleaner extends Personal {

    public Cleaner(int id, String name, int workTime,int base) {
        super(id, name, workTime,base);
        this.payment = payment(workTime,base);
    }

    @Override
    public String toString() {
        return "Cleaner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", payment=" + payment +
                '}';
    }

    @Override
    public int payment(int workTime, int base) {
        return super.payment(workTime, base);
    }
}
