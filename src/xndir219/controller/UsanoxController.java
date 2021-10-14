package xndir219.controller;

import xndir219.model.UsanoxModeel;

import java.util.Scanner;

public class UsanoxController {
       public void ussData(int count){
           UsanoxModeel[] usanoxModeels=new UsanoxModeel[count];
           for (int i = 0; i < usanoxModeels.length; i++) {

               Scanner in =new Scanner(System.in);
               System.out.println("tosjaki chap");
               int toshak=in.nextInt();

               System.out.println("mijinTvabanakan");
               int mijinTvaba=in.nextInt();

               in =new Scanner(System.in);
               System.out.println("azganun");
               String azganun =in.nextLine();

               UsanoxModeel usanoxModeel=new UsanoxModeel();
               usanoxModeel.setAzganun(azganun);
               usanoxModeel.setMijinGnahatakan(mijinTvaba);
               usanoxModeel.setToshak(toshak);
               usanoxModeels[i]=usanoxModeel;
           }
           ppp(usanoxModeels);
       }

    private void ppp(UsanoxModeel[] data) {
       for (int i = 0; i < data.length; i++) {
            if (data[i].getMijinGnahatakan()>data[i].getK()){
                System.out.println(data[i].getToshak() * 2 + data[i].getAzganun());
            }

            }
        }

    }

