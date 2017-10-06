package ru.unlamzg;

import java.io.*;
import java.lang.*;
import java.util.*;

public class BullsNumber {
    private int number, lng = 4;  //число и его длина
    private Integer[] masNumber = new Integer[lng]; //массив цифр числа

    @Override
    public String toString() {
        return number + " " + Arrays.deepToString(masNumber);
    }

    //метод заполняет массив цифрами числа
    private void separator(int number){
        for(int i = 0, j = masNumber.length; i < masNumber.length; i++, j = masNumber.length - i) {
            masNumber[i] = (number % (int) Math.pow(10, j) - number % (int) Math.pow(10, j - 1)) / (int) Math.pow(10, j - 1);
        }
    }

    //конструктор для загадывания числа
    private BullsNumber () {
        createRand:
        for(;;){
            number = (int)(Math.random() * Math.pow(10, lng));
            this.separator(number);
            if(masNumber[0] != 0){
                for(int i = 0; i < masNumber.length; i++){
                    for(int j = i + 1; j < masNumber.length; j++){
                        if(masNumber[i].equals(masNumber[j])) continue createRand;
                    }
                }
                break;
            }
        }
    }

    private BullsNumber (int number) {
        this.number = number;
        this.separator(this.number);
    }

    public static void main(String[] args) throws IOException {
        BullsNumber enigma = new BullsNumber();
        System.out.println(enigma);

        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bR.readLine());
        BullsNumber n = new BullsNumber(number);
        System.out.println(n);



    }

    class BullsException extends Exception{

    }
}
