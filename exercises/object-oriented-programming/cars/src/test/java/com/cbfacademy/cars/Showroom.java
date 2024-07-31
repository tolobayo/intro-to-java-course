package com.cbfacademy.cars;

import java.util.ArrayList;
import java.util.List;

public class Showroom {
    public List<Car> getCars() {
        Car volvo = new Car("Volvo", "V40", "blue", 2012);
        Car porsche = new Car("Porsche", "Panamera", "red", 2009);
        Car audi = new Car("Audi", "A3", "grey", 2018);
        List<Car> cars = new ArrayList<Car>();
        cars.add(volvo);
        cars.add(porsche);
        cars.add(audi);
        return cars;
    }
    
}
