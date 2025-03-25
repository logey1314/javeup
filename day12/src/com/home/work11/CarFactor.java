package com.home.work11;

public class CarFactor {

    public  Car creatCar(String car){
        if(car.equals("Bmw")){
            return new Bmw();
        }
        else if(car.equals("Benz")){
            return new Bmw();
        }
        return null;
    }
}
