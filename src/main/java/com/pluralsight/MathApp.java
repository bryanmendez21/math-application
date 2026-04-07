package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        //variables
        int bob_salary = 50000;
        int gary_salary = 30000;
        int highestSalary = Math.max(bob_salary, gary_salary);
        //logic
        System.out.println("the highest salary is " + highestSalary);

        //variables
        double carPrice = 20000.96;
        double truckPrice = 50000.34;
        //logic
        System.out.println("Cheapest is " + Math.min(carPrice, truckPrice));

        //variables
        double radius_of_circle = 7.25;
        double area_of_circle = Math.PI * radius_of_circle * radius_of_circle;
        //logic
        System.out.println("Area of circle is " + area_of_circle);

        //variables
        double chosen_number = 5.0;
        double square_root_of_number = Math.sqrt(5.0);
        //logic
        System.out.println("Square root of 5 is " + square_root_of_number);

        //variables
        double first_distance_point_x = 5;
        double first_distance_point_y = 10;
        double second_distance_point_x = 85;
        double second_distance_point_y = 50;
        //logic
        double distance_between_points = Math.hypot(second_distance_point_x - first_distance_point_x, second_distance_point_y - first_distance_point_y);
        System.out.println("Distance between the points is " + distance_between_points);

        //variables
        double set_number = -3.8;
        //logic
        System.out.println("Absolute value is " + Math.abs(set_number));


    }
}
