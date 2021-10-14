package Acallectiosnsss;

import java.util.ArrayList;
import java.util.List;

import static com.sun.tools.sjavac.Util.set;

public class Cxnd5 {
    public static void main(String[] args) {
        List<String> poxel = new ArrayList<>();
        poxel.add("A");
        poxel.add("B");
        poxel.add("C");
        poxel.add("D");


       poxel.set(0,"B");
        System.out.println(poxel.get(0));

    }
}
