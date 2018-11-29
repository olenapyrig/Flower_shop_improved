package data.set;

import data.base.Color;
import data.base.Country;

import data.flower.Chamomile;
import data.flower.Flower;
import data.flower.Rose;
import data.flower.Tulip;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class OwnBouquet extends FlowerList {
    public OwnBouquet() {
        super();
    }
    public OwnBouquet(List<Flower> initialFlowers) {
        super(initialFlowers);
    }

    public static OwnBouquet ownBouquet() {
        float total_price = 0;
        List<Flower> flowers = new LinkedList<>();
        System.out.println("Enter number of Rose(1, 2, ..): ");
        Scanner sc = new Scanner(System.in);
        int rose_num = sc.nextInt();
        System.out.println("Enter number of Tulip(1, 2, ..): ");
        Scanner sc1 = new Scanner(System.in);
        int tulip_num = sc1.nextInt();
        System.out.println("Enter number of Chamomile(1, 2, ..): ");
        Scanner sc2 = new Scanner(System.in);
        int chamomile_num = sc2.nextInt();

        Color color = Flower.getRandomColor();
        int length = Flower.getRandomLength();
        float price = Flower.getRandomPrice();
        Country country = Flower.getRandomCountry();
        for (int i = 0; i <= rose_num; i++) {
            flowers.add(new Rose(color, length, country, price));
        }
        for (int i = 0; i <= tulip_num; i++) {
            total_price = total_price + price * tulip_num;
            flowers.add(new Tulip(color, length, country, price));
        }
        for (int i = 0; i <= chamomile_num; i++) {
            total_price = total_price + price * chamomile_num;
            flowers.add(new Chamomile(color, length, country, price));
        }

        return new OwnBouquet(flowers);
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "flowers=" + flowers +
                '}';
    }
}
