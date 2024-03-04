package com.cydeo.review;


import lombok.*;

@AllArgsConstructor
//@NoArgsConstructor
//@RequiredArgsConstructor
//@ToString(exclude = "topSpeed")
//@Getter
//@Setter
//@EqualsAndHashCode
@Data

public class Car {

    private String make;
    private int topSpeed;
   private final int year;
    public String getMake() {
        return make;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }



    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", topSpeed=" + topSpeed +
                ", year=" + year +
                '}';
    }


}
