package gates;

public class Xor extends Gate {

    public Xor(int A, int B) {
        super(A, B);
        this.f = (this.a == 1 && this.b == 0) || (this.a == 0 && this.b == 1) ? 1 : 0;
    }
}
