package gates;

public class And extends Gate {

    public And(int A, int B) {
        super(A, B);
        this.f = this.a * this.b;
    }

    public And(int A, int B, int C) {
        super(A, B, C);
        this.f = this.a * this.b * this.c;
    }
}
