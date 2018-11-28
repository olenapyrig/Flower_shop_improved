package data.flower;
import data.base.Color;
import data.base.Country;


public class Tulip extends Flower{
    public Tulip (Color color, int length, Country country, float price) {
        super(color, length, country, price);
    }
    public static Tulip getRandomTulip(){
        return new Tulip(getRandomColor(), getRandomLength(),  getRandomCountry(), getRandomPrice());
    }
    @Override
    public String toString() {
        return "Tulip{" +
                "color=" + color +
                ", length=" + length +
                ", country=" + country+
                ", price=" + price +
                '}';
    }
}