package gates;

public class Inverter extends Gate {

    public Inverter(int A) {
        super(A);
        this.f = this.a == 1 ? 0 : 1;
    }
}
