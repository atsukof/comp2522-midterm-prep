package ca.bcit.comp2522.farm;

public class AppleFarm extends Farm{

    public AppleFarm(String newName) {
        super(newName);
    }

    public void plantSomeOrchards(int numberOfOrchards, int treesPerOrchard){
        int orchardCounter = 0;
        while(orchardCounter < numberOfOrchards) {
            Orchard newOrchard = new AppleOrchard();
            newOrchard.plantSomeTrees(treesPerOrchard);
            orchardList.add(newOrchard);
            orchardCounter++;
        }
    }

    @Override
    public String toString() {
        return "AppleFarm{}";
    }
}
