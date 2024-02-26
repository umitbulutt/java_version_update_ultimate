package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {


        //Zero Argument Constructor
        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel());

        Supplier<Car> c2 = Car :: new;

        // One Argument Constructor
        Function<Integer,Car> f1 = model -> new Car(model);
        Function<Integer,Car> f2 = Car ::new;

        //Two Argument Constructor
        BiFunction<String,Integer,Car> a1 = (make, model) -> new Car("Tesla",2022);
        BiFunction<String,Integer,Car> f4 = Car::new;
        Car honda = f4.apply("Honda",2020);
        System.out.println(honda.getMake() + "  " + honda.getModel());


    }
}
