package data;

import data.discounts.Percents_10;
import data.discounts.Percets_3;
import data.payment.Payment;
import data.payment.Payment_card;
import data.set.Bouquet;
import data.set.OwnBouquet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Do you want to buy formed bouquet(1) or form your own(2)?(enter 1 or 2)");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i == 1) {
            Bouquet bouquet = Bouquet.getRandomBouquet();
            float price = bouquet.getOveralPrice();
            System.out.println("Do you have 3% discount(1), 10% discount ,don't have(3)");
            Scanner p = new Scanner(System.in);
            int pc = p.nextInt();
            if (pc == 1) {
                Percets_3 per = new Percets_3();
                price = (float) per.discount(price);
            }
            if (pc == 2) {
                Percents_10 per1 = new Percents_10();
                price = (float) per1.discount(price);
            } else {
                price = price;
            }
            System.out.println("Do you want to pay by card(1) or cash(2)):");
            Scanner c = new Scanner(System.in);
            int k = c.nextInt();
            if (k == 1) {
                Payment payment = new Payment_card();
                System.out.println(payment.pay(price));
            } else {
                Payment payment1 = new Payment_card();
                System.out.println(payment1.pay(price));
            }
            System.out.println(bouquet);


        } else {
            OwnBouquet bouquet1 = OwnBouquet.ownBouquet();
            float price1 = bouquet1.getOveralPrice();
            System.out.println("Do you have 3% discount(1), 10% discount ,don't have(3)");
            Scanner fd = new Scanner(System.in);
            int hj = fd.nextInt();
            if (hj == 1) {
                Percets_3 per = new Percets_3();
                price1 = (float) per.discount(price1);
            }
            if (hj == 2) {
                Percents_10 per1 = new Percents_10();
                price1 = (float) per1.discount(price1);
            } else {
                price1 = price1;
            }
            System.out.println("Do you want to pay by card(1) or cash(2)):");
            Scanner l = new Scanner(System.in);
            int q = l.nextInt();
            if (q == 1) {
                Payment payment1 = new Payment_card();
                System.out.println(payment1.pay(price1));
            } else {
                Payment payment2 = new Payment_card();
                System.out.println(payment2.pay(price1));
            }
            System.out.println(bouquet1);

        }

    }
}