package data.discounts;

public class Percets_3 implements Cards {
    public double discount(float sum){
        double dis  =  0.03;
        return sum - sum*dis;

    }


}
