package Shop;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // ассортимент цветов поставщика
        Flowers flower1 = new Flowers(100, "Roses");
        Flowers flower2 = new Flowers(20, "Peonies");
        Flowers flower3 = new Flowers(40, "Tulips");
        Flowers flower4 = new Flowers(80, "Lilies");
        System.out.println("Supplier's flowers choice: ");
        flower1.nameFlowers();
        flower2.nameFlowers();
        flower3.nameFlowers();
        flower4.nameFlowers();
        System.out.print("__________________________\n");

        // список поставляемых цветов в магазин
        List<String> flowersInShop = new ArrayList<>();
        flowersInShop.add("Roses");
        flowersInShop.add("Peonies");
        flowersInShop.add("Tulips");
        flowersInShop.add("Lilies");
        flowersInShop.add("Roses");
        flowersInShop.add("Lilies");
        System.out.println("To the store by March 8th implemented " + "\n"
                + flowersInShop.size() + " deliveries flowers: " + flowersInShop);
        System.out.print("__________________________\n");

        // ассортимент цветов в магазине
        Set<String> choice = new HashSet<>(flowersInShop);
        System.out.println("By March 8th in the store " + "\n"
                + choice.size() + " types of flowers: " + choice);
        System.out.print("__________________________\n");

        // лучше всего продавались цветы по 80 и 40 грн
        Map<Integer, String> better = new HashMap<>();
        better.put(20, "Peonies");
        better.put(40, "Tulips");
        better.put(100, "Roses");
        better.put(80, "Lilies");
        System.out.println("Best selling flowers for March 8th: " + "\n"
                + better.get(80) + " and " + better.get(40));
    }
}
