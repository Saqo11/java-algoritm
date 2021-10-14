package Acallectiosnsss;

import java.util.ArrayList;
import java.util.List;

public class Cxnd9 {
    public static void main(String[] args) {
        List<String> copy = new ArrayList<>();
        copy.add("A");
        copy.add("B");
        copy.add("C");
        copy.add("D");
        System.out.println(copy.contains("A"));
        System.out.println(copy.contains("Z"));

        List<String> past = new ArrayList<>(copy);
        past.add("E");
        System.out.println(past);




    }
}
