import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    @Test
    void should_return_0_when_all_down_of_bowling_are_0() {
        BowlingGame bowlingGame = new BowlingGame();
        int[] numberOfDown = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        int result = bowlingGame.countSource(numberOfDown);
        int expect = 0;
        assertEquals(expect, result);
    }

    @Test
    void should_return_sum_source_when_no_strike_or_spare() {
        BowlingGame bowlingGame = new BowlingGame();
        int[] numberOfDown = {1, 2, 3, 2, 1, 2, 3, 2, 4, 3, 2, 3, 1, 3, 2, 1, 3, 4, 2, 1};

        int result = bowlingGame.countSource(numberOfDown);
        int expect = Arrays.stream(numberOfDown).sum();
        assertEquals(expect, result);
    }

    @Test
    void should_right_when_have_spare_but_no_strike_and_10th_no_strike_and_no_spare() {
        BowlingGame bowlingGame = new BowlingGame();
        int[] numberOfDown = {1, 2, 5, 6, 1, 2, 3, 2, 4, 3, 2, 3, 1, 3, 2, 1, 3, 4, 2, 1};

        int result = bowlingGame.countSource(numberOfDown);
        int expect = 51;
        assertEquals(expect, result);
    }

    @Test
    void should_right_when_have_spare_and_10th_have_spare_but_no_strike() {
        BowlingGame bowlingGame = new BowlingGame();
        int[] numberOfDown = {1, 2, 5, 5, 1, 2, 3, 2, 4, 3, 2, 3, 1, 3, 2, 1, 3, 4, 7, 7, 1};

        int result = bowlingGame.countSource(numberOfDown);
        int expect = 59;
        assertEquals(expect, result);
    }

    @Test
    void should_right_when_only_have_strike_and_10th_not_strike() {
        BowlingGame bowlingGame = new BowlingGame();
        int[] numberOfDown = {1, 2, 10, 1, 2, 3, 2, 4, 3, 2, 3, 1, 3, 2, 1, 3, 4, 7, 1};

        int result = bowlingGame.countSource(numberOfDown);
        int expect = 58;
        assertEquals(expect, result);
    }

    @Test
    void should_right_when_have_strike_and_10th_is_strike() {
        BowlingGame bowlingGame = new BowlingGame();
        int[] numberOfDown = {1, 2, 10, 1, 2, 3, 2, 4, 3, 2, 3, 1, 3, 2, 1, 3, 4, 10, 4, 5};

        int result = bowlingGame.countSource(numberOfDown);
        int expect = 69;
        assertEquals(expect, result);
    }

    @Test
    void should_right_when_have_both_strike_and_spare_but_not_10th() {
        BowlingGame bowlingGame = new BowlingGame();
        int[] numberOfDown = {1, 2, 10, 6, 9, 3, 2, 4, 3, 2, 3, 1, 3, 2, 1, 3, 4, 3, 4};

        int result = bowlingGame.countSource(numberOfDown);
        int expect = 79;
        assertEquals(expect, result);
    }

    @Test
    void should_right_when_all_condition_in_middle_and_spare_at_10th() {
        BowlingGame bowlingGame = new BowlingGame();
        int[] numberOfDown = {1, 2, 10, 6, 9, 3, 2, 4, 3, 2, 3, 1, 3, 2, 1, 3, 4, 7, 4, 5};

        int result = bowlingGame.countSource(numberOfDown);
        int expect = 87;
        assertEquals(expect, result);
    }
}
