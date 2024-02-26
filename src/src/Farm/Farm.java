package Farm;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Farm {
    protected String name;
    protected ArrayList<Orchard> orchardList;

    public Farm(final String newName) {
        if (newName == null || newName.trim().isEmpty()) {
            throw new IllegalArgumentException("Farms must have names!");
        } else {
            name = newName;
        }
        orchardList = new ArrayList<>(); // check how to initialize ArrayList
    }

    public String getName() {
        return name;
    }

    public ArrayList<Orchard> getOrchardList() {
        return orchardList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrchardList(ArrayList<Orchard> orchardList) {
        this.orchardList = orchardList;
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
}
