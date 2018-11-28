package data.discounts;

public class Percents_10 implements Cards {
    public double discount(float sum){
        double dis  =  0.1;
        return sum - sum*dis;

    }


}