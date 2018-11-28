package data.flower;
import data.base.Color;
import data.base.Country;

import java.util.Random;

public abstract class Flower {
    Color color;
    int length;
    float price;
    Country country;

    static Random random = new Random();

    Flower(Color color, int length,Country country, float price){
        this.color = color;
        this.length = length;
        this.country = country;
        this.price = price;
    }
    public Color getColor() {
        return color;
    }
    public float getPrice() {
        return price;
    }
    public int getLength() {
        return length;
    }
    public Country getCountry(){return country; }

    public static Color getRandomColor(){
        switch (random.nextInt(4)) {
            case 0: return Color.RED;
            case 1: return Color.GREEN;
            case 2: return Color.BLUE;
        }
        return Color.RED;
    }

    public static Country getRandomCountry(){
        switch (random.nextInt(4)) {
            case 0: return Country.NETHERLANDS;
            case 1: return Country.TURKEY;
            case 2: return Country.ECUADORA;
            case 3: return Country.COLOMBIA;
        }
        return Country.ETHIOPIA;
    }



    public static float getRandomPrice() {return 3 + random.nextFloat() * 10;}
    public static int getRandomLength() {return (4+random.nextInt(5))*10;}

}