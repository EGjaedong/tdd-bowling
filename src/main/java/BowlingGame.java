import java.util.Arrays;

public class BowlingGame {
    private static final int ROUND = 10;

    public int countSource(int[] numberOfDown) {
        int source = 0;

        for (int i = 0; i < ROUND * 2 - 1;) {
            if (numberOfDown[i] == 10) {
                source += (numberOfDown[i + 1] + numberOfDown[i + 2] + 10);
                i++;
            }
            else {
                if (numberOfDown[i] + numberOfDown[i + 1] >= 10) {
                    source += (numberOfDown[i + 2] + 10);
                } else {
                    source += ((numberOfDown[i] + numberOfDown[i + 1]));
                }
                i+=2;
            }

        }

        return source;
    }
}
