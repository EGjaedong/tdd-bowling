import java.util.Arrays;

public class BowlingGame {
    private static final int ROUND = 10;

    public int countSource(int[] numberOfDown) {
        int source = 0;

        for (int i = 0; i < ROUND * 2; i += 2) {
            if (numberOfDown[i] + numberOfDown[i + 1] >= 10) {
                source += (numberOfDown[i + 2] + 10);
            }else {
                source += ((numberOfDown[i] + numberOfDown[i + 1]));
            }
        }

        return source;
    }
}
