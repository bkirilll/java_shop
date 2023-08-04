package model;

public class Toy implements Comparable<Toy>{

    private int id;
    private String name;
    private int quantity;
    private int frequency;
    private static int idCount = 1;

    public Toy(String name, int quantity, int frequency) {
        this.id = idCount++;
        this.name = name;
        this.quantity = quantity;
        this.frequency = frequency;

    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Toy o) {
        if (this.frequency < o.frequency) return 1;
        else if (this.frequency > o.frequency) return -1;
        else return 0;
    }
}
