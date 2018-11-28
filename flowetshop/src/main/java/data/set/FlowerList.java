package data.set;

import java.util.LinkedList;

import data.flower.Flower;

import java.util.List;
import java.util.Random;

public abstract class FlowerList {

    protected List<Flower> flowers;
    protected static Random random = new Random();

    public FlowerList() {
        flowers = new LinkedList<>();
    }

    public FlowerList(List<Flower> initialFlowers) {
        flowers = new LinkedList<>();
        flowers.addAll(initialFlowers);
    }


    private void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public int getCount() {
        return flowers.size();
    }

    public float getOveralPrice() {
        float sum = 0;
        for (Flower flower : flowers) {
            sum += flower.getPrice();
        }

        return sum;
    }
}