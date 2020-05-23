package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SimpleOperations {
    private int [] numbers = {2, 3, 4, 5, 4, 9, 15, -25, 10, 24, 65, 0};

    public int getMaxValue(){
    return Arrays.stream(numbers)
            //.sorted((num1, num2) -> num2.compareTo(num1))
            .max().getAsInt();
    }

    public int getMinValue(){
        return Arrays.stream(numbers)
                //.sorted((num1, num2) -> num2.compareTo(num1))
                .min().getAsInt();
    }
    public double getAvg(){
        return Arrays.stream(numbers)
                .average().getAsDouble();
    }

    //wypisac elementy tablicy wieksze od sedniej

    public void getElementGreaterThanAvg() {

        System.out.println(Arrays.stream(numbers)
                .filter(number -> number > getAvg())
                .sorted()
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" , ")));


    }

        public static void main(String[] args){
        SimpleOperations so = new SimpleOperations();
        System.out.println("MAX: " + so.getMaxValue());
        System.out.println("MIN: " + so.getMinValue());
        System.out.println("AVG:" + so.getAvg());
        so.getElementGreaterThanAvg();

    }
}