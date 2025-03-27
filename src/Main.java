import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        Customer customer = new Customer();
        System.out.println("Assalomu alaykum☺\uFE0F! AvtoSalonimizga Xush Kelibsiz\uD83D\uDC4C!");

        while (true) {
            System.out.println("1. Avtomobil qo‘shish\n2. Avtomobil o‘chirish\n3. Avtomobil yangilash\n4. Avtomobillarni ko‘rish\n5. Sotilgan avtomobillar\n6. Mijoz avtomobil qidirish\n7. Mijoz avtomobil sotib olish\n8. Chiqish");
            int tanlov = scanner.nextInt();
            scanner.nextLine();

            if (tanlov == 1) {
                System.out.println("Marka, Model, Rang, Yil, Narx kiriting:");
                String marka = scanner.nextLine();
                String model = scanner.nextLine();
                String rang = scanner.nextLine();
                int yil = scanner.nextInt();
                double narx = scanner.nextDouble();
                scanner.nextLine();
                admin.addCar(new Car(marka, model, rang, yil, narx));
                System.out.println("====================================================================");
            } else if (tanlov == 2) {
                System.out.println("O‘chirmoqchi bo‘lgan model nomini kiriting:");
                String model = scanner.nextLine();
                admin.removeCar(model);
                System.out.println("====================================================================");
            } else if (tanlov == 3) {
                System.out.println("Yangilamoqchi bo‘lgan model va yangi narxni kiriting:");
                String model = scanner.nextLine();
                double narx = scanner.nextDouble();
                scanner.nextLine();
                admin.updateCar(model, narx);
                System.out.println("=======================================================================");
            } else if (tanlov == 4) {
                admin.showCars();
                System.out.println("=======================================================================");
            } else if (tanlov == 5) {
                admin.showSoldCars();
                System.out.println("========================================================================");
            } else if (tanlov == 6) {
                System.out.println("Qidirilayotgan model va rangni kiriting:");
                String model = scanner.nextLine();
                String rang = scanner.nextLine();
                customer.searchCar(admin.getCars(), model, rang);
                System.out.println("=========================================================================");
            } else if (tanlov == 7) {
                System.out.println("Sotib olmoqchi bo‘lgan model nomini kiriting:");
                String model = scanner.nextLine();
                customer.buyCar(admin.getCars(), model);
                System.out.println("==========================================================================");
            } else if (tanlov == 8) {
                break;

            } else {
                System.out.println("Noto‘g‘ri tanlov!");
            }
        }
        scanner.close();
    }
}