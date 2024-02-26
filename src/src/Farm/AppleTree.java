package Farm;

import java.util.Random;

public class AppleTree extends Tree {

    public static int MAXIMUM_APPLE = 100;
    private final Random randomNumberGenerator = new Random();

    public AppleTree(int newYield) {
        super(newYield);
    }

    public int harvest() {
        this.yield = randomNumberGenerator.nextInt(MAXIMUM_APPLE);
        return yield;
    }
}