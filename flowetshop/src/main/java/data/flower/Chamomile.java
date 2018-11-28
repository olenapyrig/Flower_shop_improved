package data.flower;
import data.base.Color;
import data.base.Country;


public class Chamomile extends Flower{
    public Chamomile(Color color, int length, Country country, float price) {
        super(color, length, country, price);
    }
    public static Chamomile getRandomChamomile(){
        return new Chamomile(getRandomColor(), getRandomLength(),  getRandomCountry(), getRandomPrice());
    }
    @Override
    public String toString() {
        return "Chamomile{" +
                "color=" + color +
                ", length=" + length +
                ", country=" + country+
                ", price=" + price +
                '}';
    }
}