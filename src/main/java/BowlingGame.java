import java.util.Arrays;

public class BowlingGame {
    public int countSource(int[] numberOfDown) {
        int source = (int) Arrays.stream(numberOfDown).sum();

        return source;
    }
}
