package Farm;

public class AppleOrchard extends Orchard {
    public AppleOrchard() {}

    public AppleOrchard(String newName) {
        super(newName);
    }

    public void plantSomeTrees(int quantity){
        int counter = 0;
        while(counter < quantity) {
            Tree newTree = new AppleTree(AppleTree.MAXIMUM_APPLE);
            treeList.add(newTree);
            counter++;
        }

    }
}
