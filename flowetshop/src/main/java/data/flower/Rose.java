package data.flower;
import data.base.Color;
import data.base.Country;


public class Rose extends Flower{
    public Rose(Color color, int length, Country country, float price) {
        super(color, length, country, price);
    }
    public static Rose getRandomRose(){
        return new Rose(getRandomColor(), getRandomLength(),  getRandomCountry(), getRandomPrice());
    }
    @Override
    public String toString() {
        return "Rose{" +
                "color=" + color +
                ", length=" + length +
                ", country=" + country+
                ", price=" + price +
                '}';
    }
}