package Singleton;

import Singleton.Cars.Car;
import Singleton.Cars.Logan;

public class CarService {

    private boolean empty;

    private static CarService uniqueInstance;

    // private static CarService uniqueInstance = new CarService();

    private CarService() {
        this.empty = true;
    }

    public static CarService getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new CarService();
        }
        return uniqueInstance;
    }


    public boolean isEmpty() {
        return empty;
    }

    public void repair(Car car){
        if(!car.isRepaired() && empty){
            empty = false;
            car.setRepaired(true);
        }
    }

    public void empty(Car car){
        if(car.isRepaired() && !empty){
            empty = true;
        }
    }

}
