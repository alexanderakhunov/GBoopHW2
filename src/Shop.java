import java.util.List;
import java.util.Scanner;

public class Shop implements Console {
    private List<Laptop> laptops;

    public void addInShop(List<Laptop> item) {
        this.laptops = item;
    }

    public void getFromShop(List<Laptop> laptops) {
        Scanner sc1 = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Choose number \n 1- RAM \n 2- HD \n 3- OS \n 4- Color \n 5- Exit");
            int numbConsole = sc1.nextInt();
            int String;
            if (numbConsole <= 5) {
                switch (numbConsole) {
                    case (1):
                        System.out.println("Введите объем RAM: \n 4 GB \n 8 GB \n 16 GB \n 32 GB");
                        int capacityRAM = sc1.nextInt();
                        laptops.removeIf(laptop -> capacityRAM != laptop.getRAM());
                        break;
                    case (2):
                        System.out.println("Введите объем HD: \n 250 GB \n 450 GB \n 500 GB \n 2000 GB \n 3000 GB  ");
                        int capacityHD = sc1.nextInt();
                        laptops.removeIf(laptop -> capacityHD != laptop.getCapacityHardDisk());
                        break;
                    case (3):
                        System.out.println("Введие операционную систему: \n Windows11 \n AstraLinux \n Ubuntu \n KaliLinux ");
                        sc1.nextLine();
                        String os = sc1.nextLine();
                        laptops.removeIf(laptop -> (!(os.equals(laptop.getColor()))));
                        break;
                    case (4):
                        System.out.println("Введите цвет: \n Black \n White \n Red \n Green \n Yellow");
                        sc1.nextLine();
                        String color = sc1.nextLine();
                        laptops.removeIf(laptop -> (!(color.equals(laptop.getColor()))));
                        break;
                    case (5):
                        work = false;
                }
            }
        }
        if(laptops.size()>0){
            for(Laptop laptop:laptops){
                System.out.println(laptop);
            }
        }
    }
}

