package gates;

public class Nor extends Gate {

    public Nor(int A, int B) {
        super(A, B);
        this.f = new Inverter(new Or(this.a, this.b).f).f;
    }
}
