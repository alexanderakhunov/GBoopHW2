import java.awt.event.WindowStateListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Laptop laptop1 = new GameLaptop(32, 1000, "Windows11", "Red");
        Laptop laptop2 = new GameLaptop(32, 2000, "Windows11", "Blue");
        Laptop laptop3 = new GameLaptop(32, 3000, "Windows11", "Yellow");
        Laptop laptop4 = new OfficeLaptop(16, 500, "AstraLinux", "Black");
        Laptop laptop5 = new OfficeLaptop(8, 450, "Ubuntu", "Green");
        Laptop laptop6 = new OfficeLaptop(4, 250, "KaliLinux", "White");
        List<Laptop> laptopes = new ArrayList<>();
        laptopes.add(laptop1);
        laptopes.add(laptop2);
        laptopes.add(laptop3);
        laptopes.add(laptop4);
        laptopes.add(laptop5);
        laptopes.add(laptop6);
        shop.addInShop(laptopes);
        shop.getFromShop(laptopes);

    }
}
