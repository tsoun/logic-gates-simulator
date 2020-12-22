import java.util.Arrays;

public class LogicGates {

    public static void main(String[] args) throws Exception {

        int[] i = { 1, 0, 0, 1 };
        int s[];
        s = new int[2];
        for (int j = 0; j < 2; j++) {
            for (int k = 0; k < 2; k++) {
                s[0] = k;
                s[1] = j;
                System.out.println(
                        "i=" + Arrays.toString(i) + "\ts=" + Arrays.toString(s) + "\tf=" + new circuits.MUX_4to1(i, s).f);

            }
        }

    }

}