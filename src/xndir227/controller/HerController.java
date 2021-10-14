package xndir227.controller;

import xndir227.model.HerModel;

import java.util.Scanner;

public class HerController {
    public void haxQanak(int count) {
        HerModel[] herModels = new HerModel[count];
        for (int i = 0; i < herModels.length; i++) {

            Scanner in = new Scanner(System.in);
            System.out.println("Vernagir");
            String vernagir = in.nextLine();

            System.out.println("jam");
            int jam = in.nextInt();

            System.out.println("rope");
            int ropen = in.nextInt();
            HerModel herModel = new HerModel();
            herModel.setVernagir(vernagir);
            herModel.setJam(jam);
            herModel.setRope(ropen);
            herModels[i] = herModel;

        }
        gtneljamy(herModels);

    }

    private void gtneljamy(HerModel[] data) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].getJam() == 18 && data[i].getRope() == 30) {
                System.out.println(data[i].getVernagir());

            }


        }

    }
}
