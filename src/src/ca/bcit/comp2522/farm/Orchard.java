package ca.bcit.comp2522.farm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public abstract class Orchard {
    protected String name;
    protected final ArrayList<Tree> treeList;

    public Orchard() {
        treeList = new ArrayList<>();
    }

    public Orchard(final String newName) {
        if (newName == null || newName.trim().isEmpty()) { // avoid only whitespace
            throw new IllegalArgumentException("Orchards must have names!");
        } else {
            setName(newName);
        }
        treeList = new ArrayList<>(); // initialize an ArrayList
    }

    public String getName() {
        return name;
    }

    public ArrayList<Tree> getTreeList() {
        return treeList;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public abstract void plantSomeTrees(int quantity);
    public  int harvest() {
        Iterator<Tree> iterator = treeList.iterator();
        int harvestCount = 0;
        while (iterator.hasNext()) {
            int newHarvest = iterator.next().harvest();
            harvestCount += newHarvest;
        }
        return harvestCount;
    }

    @Override
    public String toString() {
        return "Orchard{" +
                "name='" + name + '\'' +
                ", treeList=" + treeList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orchard orchard = (Orchard) o;
        return Objects.equals(getName(), orchard.getName()) && Objects.equals(getTreeList(), orchard.getTreeList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getTreeList());
    }
}
