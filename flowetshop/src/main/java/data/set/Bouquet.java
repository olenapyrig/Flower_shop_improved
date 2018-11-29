package data.set;

import java.util.Random;
import data.base.Color;
import data.base.Country;
import data.flower.Chamomile;
import data.flower.Flower;
import data.flower.Tulip;
import data.flower.Rose;


import java.util.LinkedList;
import java.util.List;


public class Bouquet extends FlowerList {
    public Bouquet() {
        super();

    }

    public Bouquet(List<Flower> initialFlowers) {
        super(initialFlowers);
    }

    public static Bouquet getRandomBouquet() {
        int count = (random.nextInt(2) + 1) * 10 + 1;
        List<Flower> flowers = new LinkedList<>();
        for (int i = 0; i < count; i++) {

            int flowerType = random.nextInt(3);

            Color color = Flower.getRandomColor();
            int length = Flower.getRandomLength();
            float price = Flower.getRandomPrice();
            Country country = Flower.getRandomCountry();
            if (flowerType==0) {
                flowers.add(new Rose(color, length, country, price));
            }
            if (flowerType==1) {
                    flowers.add(new Chamomile(color, length, country, price));
            }else {
                    flowers.add(new Tulip(color, length, country, price));

            }
        }

        return new Bouquet(flowers);

    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "flowers=" + flowers +
                '}';
    }
}
