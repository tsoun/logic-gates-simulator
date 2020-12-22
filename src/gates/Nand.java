package gates;

public class Nand extends Gate {

    public Nand(int A, int B) {
        super(A, B);
        this.f = new Inverter(new And(this.a, this.b).f).f;
    }
}
