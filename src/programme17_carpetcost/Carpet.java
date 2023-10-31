package programme17_carpetcost;

public class Carpet {
    double cost;

    public Carpet (double cost){
        this.cost = cost;
        if (cost<0){
            this.cost = 0;
        }else{
            this.cost = cost;
        }
    }

    public double getCost(){
        return cost;
    }
}
