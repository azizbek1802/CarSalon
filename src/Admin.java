import java.util.ArrayList;

class Admin {
    private ArrayList<Car> cars;

    public Admin() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
        System.out.println("Avtomobil qo‘shildi: " + car);
    }

    public void removeCar(String model) {
        cars.removeIf(car -> car.getModel().equalsIgnoreCase(model));
        System.out.println(model + " modeli o‘chirildi.");
    }

    public void updateCar(String model, double newPrice) {
        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(model)) {
                car = new Car(car.getModel(), car.getModel(), car.getRang(), 2022, newPrice);
                System.out.println(model + " modeli yangilandi.");
                return;
            }
        }
        System.out.println("Avtomobil topilmadi.");
    }

    public void showCars() {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public void showSoldCars() {
        for (Car car : cars) {
            if (car.isSotilgan()) {
                System.out.println(car);
            }
        }
    }

    public ArrayList<Car> getCars() {
        return cars;
    }
}
