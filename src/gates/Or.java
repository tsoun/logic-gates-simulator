package gates;

public class Or extends Gate {

    public Or(int A, int B) {
        super(A, B);
        this.f = this.a == 1 || this.b == 1 ? 1 : 0;
    }
}
