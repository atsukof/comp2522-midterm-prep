package ca.bcit.comp2522.farm;

import java.util.Objects;
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

    @Override
    public String toString() {
        return "AppleTree{" +
                "randomNumberGenerator=" + randomNumberGenerator +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AppleTree appleTree = (AppleTree) o;
        return Objects.equals(randomNumberGenerator, appleTree.randomNumberGenerator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), randomNumberGenerator);
    }
}