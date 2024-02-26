package Farm;

public abstract class Tree {
    protected int yield;

    public Tree(final int newYield) {
        if (newYield < 0) {
            throw new IllegalArgumentException("Yield must be non-negative!");
        } else {
            yield = newYield;
        }
    }

    public abstract int harvest();
}
