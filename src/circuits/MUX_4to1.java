package circuits;

public class MUX_4to1 {
    int i[], s[];
    public int f;

    public MUX_4to1(int i[], int s[]) {
        this.i = i;
        this.s = s;
        this.f = new gates.Or(
                new gates.Or(new gates.And(i[0], new gates.Inverter(s[1]).f, new gates.Inverter(s[0]).f).f,
                        new gates.And(i[1], new gates.Inverter(s[1]).f, s[0]).f).f,
                new gates.Or(new gates.And(i[2], s[1], new gates.Inverter(s[0]).f).f,
                        new gates.And(i[3], s[1], s[0]).f).f).f;
    }
}