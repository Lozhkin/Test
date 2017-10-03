import java.io.*;
import java.util.*;

public class Question {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        for(;;){
            if(bR.readLine().equals(" ")) break; //почему срабатывает только со второго раза?
            list.add(bR.readLine());
        }
        int max = list.get(0).length();
        for(String s: list) {
            if(s.length() > max) max = s.length();
        }
        for (String s: list) {
            if(max == s.length()) System.out.println(s); //почему при нескольких элементах одной длины выводятся не все эти элементы?
        }
    }
}