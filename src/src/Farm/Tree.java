package Farm;

public abstract class Tree {
    protected int yield;

    public int getYield() {
        return yield;
    }

    public void setYield(int yield) {
        this.yield = yield;
    }

    public Tree(final int newYield) {
        if (newYield < 0) {
            throw new IllegalArgumentException("Yield must be non-negative!");
        } else {
            yield = newYield;
        }
    }

    public abstract int harvest();
}
