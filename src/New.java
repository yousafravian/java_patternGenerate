import java.awt.font.NumericShaper;
import java.io.*;
import java.util.Scanner;

public class New {


    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a power of 3 such as(3,9,27,.....):");
        FileWriter writer = new FileWriter(new File("FileWriter.txt"));


        String temp;
        String previousString = "$$$$ $$$$";
        int input = 2;
        double target = 0;
        try {
            target = (Math.log(scanner.nextInt())/Math.log(3));
        }
        catch (Exception e){
            try {
                System.out.println("Enter Integers only......Try Again:");
                scanner.nextLine();
                target = (Math.log(scanner.nextInt())/Math.log(3));
            }catch (Exception ex){
                System.out.println("yayway");
            }
        }

        while(target - (int)target > 0){
            System.out.println("Wrong Input....Not power of 3 Try Again:");
            target = (Math.log(scanner.nextInt())/Math.log(3));
        }


        if (target == 0) {
            System.out.println("$");
            System.exit(0);
        }

        StringBuilder tempPattern = new StringBuilder("");


        while (input <= target && target >= 2) {
            tempPattern = new StringBuilder("");
            int previousPower = (int) Math.pow(3, input - 1); //3
            int inputPower = (int) Math.pow(3, input); //9

            for (int x = 0; x < 3; x++) {

                for (int i = 0; i < (inputPower / 3); i++) {

                    for (int j = 0; j < 3; j++) {
                        if (x == 1 && j == 1) {
                            for (int k = 0; k < previousPower; k++) {
                                //    System.out.print(" ");
                                tempPattern.append(" ");
                                //     writer.append(" ");
                            }
                            continue;
                        }
                        //     writer.append(previousString.substring(i*previousPower,(i*previousPower + previousPower)));
                        //     System.out.print(previousString.substring(i*previousPower,(i*previousPower + previousPower)));
                        tempPattern.append(previousString.substring(i * previousPower, (i * previousPower + previousPower)));
                    }

                    //     System.out.println();

                }

            }
            input++;
            previousString = tempPattern.toString();
        }

//        writer.close();
        for (int i = 0; i < Math.pow(3, target); i++) {
            for (int j = 0; j < Math.pow(3, target); j++) {
                writer.append(previousString.charAt((int) ((i * Math.pow(3, target)) + j)));
                System.out.print(previousString.charAt((int) ((i * Math.pow(3, target)) + j)));
            }
            writer.append("\n");
            System.out.println();
        }
        writer.close();
    }

}
