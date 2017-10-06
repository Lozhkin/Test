import java.io.*;
import java.util.*;

public class Question {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        for(;;){
            String str = bR.readLine();
            if(str.equals("1")) break;
            list.add(str);
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