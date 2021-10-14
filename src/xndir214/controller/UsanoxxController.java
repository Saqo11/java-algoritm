package xndir214.controller;

import xndir214.model.UsanoxxModel;

import java.util.Scanner;

public class UsanoxxController {
    public void anunTarer(int count) {
        UsanoxxModel[] usanoxxModels = new UsanoxxModel[count];
        for (int i = 0; i < usanoxxModels.length; i++) {
            Scanner in = new Scanner(System.in);

            System.out.println("Azganun");
            String azganuny = in.nextLine();

            System.out.println("Anuny");
            String anuny = in.nextLine();

            System.out.println("hayranun");
            String hayranun = in.nextLine();

            UsanoxxModel usanoxxModel = new UsanoxxModel();
            usanoxxModel.setAnunn(anuny);
            usanoxxModel.setAzganun(azganuny);
            usanoxxModel.setHayranun(hayranun);
            usanoxxModels[i] = usanoxxModel;

        }
        sksNuA(usanoxxModels);


    }

    private void sksNuA(UsanoxxModel[] data) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].getAzganun().startsWith("A") && data[i].getAzganun().endsWith("n")) {
                System.out.println(data[i].toString());
            }

        }
    }

}
