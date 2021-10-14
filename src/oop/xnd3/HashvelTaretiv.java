package oop.xnd3;

import java.time.LocalDate;
import java.util.Calendar;

public class HashvelTaretiv  extends  ApranqTaretiv{

    void  taretviHashvark(){
        int year = Calendar.getInstance().get(Calendar.YEAR) ;

        System.out.println(year-taretiv);

    }



    public static void main(String[] args) {
        HashvelTaretiv hashvelTaretiv = new HashvelTaretiv();
        hashvelTaretiv.taretviHashvark();
}
}
