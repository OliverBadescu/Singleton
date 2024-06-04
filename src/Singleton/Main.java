package Singleton;

import Singleton.Cars.Logan;

public class Main {
    public static void main(String[] args) {

        CarService carService = CarService.getInstance();

        Logan logan = new Logan(false);

        carService.repair(logan);
        carService.empty(logan);

        if(carService.isEmpty()){
            System.out.println("Service-ul este liber");
        }else{
            System.out.println("Service-ul este ocupat");
        }

        if(logan.isRepaired()){
            System.out.println("Masina este reparata");
        }else{
            System.out.println("Masina nu este reparata");
        }


    }
}