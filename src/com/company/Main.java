package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String pattern = "$$$$ $$$$";
        String tempAnswerPattern = "";
        StringBuilder temp = new StringBuilder();

        int input = 2;

        int powserResult = (int) Math.pow(3, input);
        int powerPreviousResult = (int) Math.pow(3, input - 1);


        int x = 0;
        for (int i = 0; i < 3; i++) {
            x = i * powerPreviousResult;
            for (int j = 0; j < powerPreviousResult; j++) {
                temp.append(pattern.charAt(x));
                x = (x + 1) % ((i * powerPreviousResult) + powerPreviousResult);
            }

            for (int j = 0; j < 3; j++) {

            }
        }


        for (int i = 0; i < powserResult; i++) {
            for (int j = 0; j < powserResult; j++) {
                System.out.print(temp.charAt(j));
            }
            System.out.println();
        }
    }
}
