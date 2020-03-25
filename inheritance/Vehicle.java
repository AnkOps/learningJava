package com.ankit;

public class Vehicle {
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;
    public Vehicle(String name, String size){
        this.name=name;
        this.size=size;
        this.currentDirection=0;
        this.currentVelocity=0;
    }
    public void steer(int direction){
        currentDirection+= direction;
        System.out.println("Vehicle.steer(): Steering at: " + currentDirection +"degrees");

    }
    public void move(int speed, int direction){
        currentDirection=direction;
        currentVelocity=speed;
        System.out.println("Vehicle.move(): Vehicle is moving in " +currentDirection +"degrees at a speed of: " + currentVelocity);
    }


    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
