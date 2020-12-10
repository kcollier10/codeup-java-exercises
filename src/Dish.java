import java.util.Locale;

public class Dish {

    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public void printSummary() {
        System.out.printf("Cost: %d\nName: %s\nRecommended: %s", costInCents / 100, nameOfDish, wouldRecommend);
    }

    public int getCost(){
        return this.costInCents;
    }

    public void setCost(int newCost){
        this.costInCents = newCost;
    }

    public String getNameOfDish(){
        return this.nameOfDish;
    }

    public void setNewName(String newName){
        this.nameOfDish = newName;
    }

    public boolean getRecommend(){
        return this.wouldRecommend;
    }
    public void setWouldRecommend(boolean newRecommend){
        this.wouldRecommend = newRecommend;
    }





}
