package introduction.oop;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Parrot extends Bird {

    public Parrot(String name, String colour) {
        super(name, colour);
    }

    private static void treeBuilder() {
        int treeSize = 8;

        for (int i = 1; i <= treeSize; i++) {
            for (int j = i; j <= treeSize - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("MERRY CHRISTMAS");
    }

    private String parrotize(String inputStr) {
        String whatTheParrotSays = "";

        if (inputStr == null || inputStr.length() < 2) {
            whatTheParrotSays = "EEKPPY CRISTSHMASH BY PARRY";
        } else if (inputStr.equalsIgnoreCase("easteregg")) {
            treeBuilder();

        } else if (inputStr.indexOf(' ') > -1) {
            whatTheParrotSays = "I RIIPIT GUD, " + inputStr.substring(0, inputStr.indexOf(" ")).concat(" EEKKKKK ")
                    .concat(inputStr.substring(inputStr.indexOf(" "))).concat(", DO I?");
        } else {

            whatTheParrotSays = inputStr
                    .concat(" EEKPPY CRISTSHMASH 2U ");

        }
        return whatTheParrotSays;
    }

    @Override
    public void speak() {
        System.out.print("I AM PARRY, U SPIK I RIIPIIT ! (write something and press enter)");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String inputs = br.readLine();
            System.out.println(parrotize(inputs));
        } catch (IOException ioe) {
            ioe.printStackTrace();

        }

    }

}
