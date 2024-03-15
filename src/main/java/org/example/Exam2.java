package org.example;

public class Exam2 {

    public static void main(String[] args) {
        int y = 3;
        for(int i = 1; i < y; i++) {
            for(int j = 1; j < y-1; j++) {
                System.out.println(" ");
            }
            System.out.println("*");
        }
        System.out.println();

        // 높이 : 3

        /*

         *

         ***

         *****

         */

        // 높이 : 5

        // 출력

        /*

         *

         ***

         *****

         *******

         *********

         */

        // 높이 : 7

        // 출력

        /*

         *

         ***

         *****

         *******

         *********

         ***********

         *************

         */

    }
}
