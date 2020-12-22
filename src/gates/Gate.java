package gates;

public abstract class Gate {
    int a, b, c;
    public int f;

    public Gate(int A, int B, int C) {
        this.a = A;
        this.b = B;
        this.c = C;
    }

    public Gate(int A, int B) {
        this.a = A;
        this.b = B;
    }

    public Gate(int A) {
        this.a = A;
    }
}