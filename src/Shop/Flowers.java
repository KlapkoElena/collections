package Shop;

public class Flowers extends Plants implements Show {
    int price;

    public Flowers(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Flowers{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void nameFlowers() {
        System.out.println(name);
    }
}
