import java.util.Arrays;

public class BowlingGame {
    public int countSource(int[] numberOfDown) {
        int source = 0;
        int round = 0;

        for (int i = 0; round < 10;) {
            if (numberOfDown[i] == 10) {
                source += (numberOfDown[i + 1] + numberOfDown[i + 2] + 10);
                i++;
                round++;
            }
            else {
                if (numberOfDown[i] + numberOfDown[i + 1] >= 10) {
                    source += (numberOfDown[i + 2] + 10);
                } else {
                    source += ((numberOfDown[i] + numberOfDown[i + 1]));
                }
                i+=2;
                round++;
            }
        }
        return source;
    }
}
