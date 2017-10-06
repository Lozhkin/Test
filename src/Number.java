import java.util.*;
import java.lang.*;

public class Number {
    private int[] masNumber = new int[4];
    private int rand, lng = 4;

    private Number () {
       this((int)(Math.random() * Math.pow(10, 4)));
    }

    private Number (int number) {
        for(int i = 0, j = masNumber.length; i < masNumber.length; i++, j = masNumber.length - i) {
            masNumber[i] = (number % (int) Math.pow(10, j) - number % (int) Math.pow(10, j - 1)) / (int) Math.pow(10, j - 1);
        }
    }

    public static void main(String[] args) {
        Number number = new Number();
        System.out.println("Готово! " + number.rand + " " + number.masNumber[0]);
    }
}