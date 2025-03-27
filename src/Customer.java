import java.util.ArrayList;

class Customer {
    public void searchCar(ArrayList<Car> cars, String model, String rang) {
        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(model) && car.getRang().equalsIgnoreCase(rang) && !car.isSotilgan()) {
                System.out.println("Topilgan avtomobil: " + car);
            }
        }
    }

    public void buyCar(ArrayList<Car> cars, String model) {
        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(model) && !car.isSotilgan()) {
                car.setSotilgan(true);
                System.out.println(model + " modeli sotib olindi!");
                return;
            }
        }
        System.out.println(model + " modeli mavjud emas yoki sotilgan.");
    }
}
