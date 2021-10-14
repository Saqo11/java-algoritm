package xndir215.controler;

import xndir215.model.UsanoxModel1;

import java.util.Scanner;

public class UsanocControler1 {
    public void usanoxneriQanaky(int qanak) {
        UsanoxModel1[] usanoxModel1s = new UsanoxModel1[qanak];


        for (int i = 0; i < usanoxModel1s.length; i++) {

            Scanner in = new Scanner(System.in);

            System.out.println("raitingMiavor");
            int raitingMiavor = in.nextInt();

            System.out.println("ezrapakicMiavor");
            int ezrapakicMiavor = in.nextInt();

            UsanoxModel1 usanoxModel1 = new UsanoxModel1();

            usanoxModel1.setRaitingMiavor(raitingMiavor);
            usanoxModel1.setEzrapakicMiavor(ezrapakicMiavor);
            usanoxModel1s[i] = usanoxModel1;
        }
        log(usanoxModel1s);
    }

    private void log(UsanoxModel1[] data) {
        int count =0;
        for (int i = 0; i < data.length; i++) {
            if (data[i].getRaitingMiavor()>=31 &&  data[i].getRaitingMiavor()<=35) {
                if (data[i].getEzrapakicMiavor()>=19 &&  data[i].getEzrapakicMiavor()<=24){
                    count++;

                }

            }

        }
        System.out.println(count);

    }

}
