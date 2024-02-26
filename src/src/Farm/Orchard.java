package Farm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class Orchard {
    protected String name;
    protected ArrayList<Tree> treeList;

    public Orchard() {}

    public Orchard(final String newName) {
        if (newName == null || newName.trim().isEmpty()) { // avoid only whitespace
            throw new IllegalArgumentException("Orchards must have names!");
        } else {
            name = newName;
        }
        treeList = new ArrayList<>(); // initialize an ArrayList
    }

    public String getName() {
        return name;
    }

    public ArrayList<Tree> getTreeList() {
        return treeList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTreeList(ArrayList<Tree> treeList) {
        this.treeList = treeList;
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
