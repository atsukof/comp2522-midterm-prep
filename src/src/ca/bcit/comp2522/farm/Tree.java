package ca.bcit.comp2522.farm;

import java.util.Objects;

public abstract class Tree {
    protected int yield;

    public int getYield() {
        return yield;
    }


    public Tree(final int newYield) {
        if (newYield < 0) {
            throw new IllegalArgumentException("Yield must be non-negative!");
        } else {
            yield = newYield;
        }
    }

    public abstract int harvest();

    @Override
    public String toString() {
        return "Tree{" +
                "yield=" + yield +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tree tree = (Tree) o;
        return getYield() == tree.getYield();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getYield());
    }
}
