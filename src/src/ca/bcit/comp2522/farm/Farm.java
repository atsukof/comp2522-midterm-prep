package ca.bcit.comp2522.farm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public abstract class Farm {
    protected String name;
    protected final ArrayList<Orchard> orchardList;

    public Farm(final String newName) {
        if (newName == null || newName.trim().isEmpty()) {
            throw new IllegalArgumentException("Farms must have names!");
        } else {
            setName(newName);
        }
        orchardList = new ArrayList<>(); // check how to initialize ArrayList
    }

    public String getName() {
        return name;
    }

    public ArrayList<Orchard> getOrchardList() {
        return orchardList;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public abstract void plantSomeOrchards(int numberOfOrchards, int treesPerOrchard);

    public int gatherHarvest() {
        Iterator<Orchard> iterator = orchardList.iterator();
        int harvestCount = 0;
        while (iterator.hasNext()) {
            int newHarvest = iterator.next().harvest();
            harvestCount += newHarvest;
        }
        return harvestCount;
    }

    @Override
    public String toString() {
            int getClassName = 6;
        return getClass().toString().substring(getClassName)
                + "{"
                + "name='" + name + '\''
                +  ", orchardList=" + orchardList
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Farm farm = (Farm) o;
        return Objects.equals(getName(), farm.getName()) && Objects.equals(getOrchardList(), farm.getOrchardList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getOrchardList());
    }
}
