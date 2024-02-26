package Farm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class Orchard {
    protected String name;
    protected ArrayList<Tree> treeList;

    public Orchard() {}

    public Orchard(final String newName) {
        if (newName == null || newName.isEmpty()) { // only white space?
            throw new IllegalArgumentException("Orchards must have names!");
        } else {
            name = newName;
        }
        treeList = new ArrayList<>(); //?
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
}
