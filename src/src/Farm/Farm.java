package Farm;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Farm {
    protected String name;
    protected ArrayList<Orchard> orchardList;

    public Farm(final String newName) {
        if (newName == null || newName.isEmpty()) {
            throw new IllegalArgumentException("Farms must have names!");
        } else {
            name = newName;
        }
        orchardList = new ArrayList<>(); // check how to initialize ArrayList
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
