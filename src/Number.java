import java.util.*;
import java.lang.*;

public class Number {
    private int[] masNumber = new int[4];
    private int rand;

    private Number () {
        Random random = new Random(System.currentTimeMillis());
        rand = random.nextInt(9876 - 1023) + 1023;
        new Number(rand);
    }

    private Number (int number) {
        for(int i = 0, j = masNumber.length; i < masNumber.length; i++, j = masNumber.length - i) {
            masNumber[i] = (number % (int) Math.pow(10, j) - number % (int) Math.pow(10, j - 1)) / (int) Math.pow(10, j - 1);
        }
    }

    public static void main(String[] args) {
        Number number;
        for(;;) {
            number = new Number();
            if(number.masNumber[0] == 2) break;
            number = null;
            System.gc();
            System.out.println("fuck!");
        }
        System.out.println("Готово! " + number.rand);
    }
}