import java.util.Arrays;

public class BowlingGame {
    public int countSource(int[] numberOfDown) {
        int source = 0;

        for (int i = 0; i < numberOfDown.length; i += 2) {
            source += (numberOfDown[i] + numberOfDown[i + 1]);
            if (numberOfDown[i] + numberOfDown[i + 1] >= 10) {
                source += numberOfDown[i + 2];
            }
        }

        return source;
    }
}
