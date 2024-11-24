package org.example;

public class Main {
        // პირველი დავალება
        public static void main(String[] args) {

            int[] numbers = {1, 2, 5, 7, 9, 4};
            int count = 0;
            // არის თუ არა ლუწი რიცხვები მასივში
            for (int number : numbers) {
                if (number % 2 == 0) {
                    count++;
                }
            }
            // ლუწი რიცხვების არსებობის/არ არსებობის შემთხვევბზე რეაგირება
            if (count == 0) {
                System.out.println("მასივში არ არის ლუწი რიცხვი");
            } else {
                System.out.println("მასივში არის " + count + " ლუწი რიცხვი");
            }
        }
    }