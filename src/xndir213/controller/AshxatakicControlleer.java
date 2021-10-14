package xndir213.controller;

import xndir213.model.AshxatakicModell;

import java.util.Scanner;

public class AshxatakicControlleer {
    public void mijin(int countt) {
        AshxatakicModell[] ashxatakicModells = new AshxatakicModell[countt];
        for (int i = 0; i < ashxatakicModells.length; i++) {

            Scanner in = new Scanner(System.in);

            System.out.println(" greq azganun");
            String azganun = in.nextLine();

            System.out.println(" greq andamneri qanak");

            int qanak = in.nextInt();

            System.out.println("ashxatavardz");

            int ashxatavardz = in.nextInt();

            AshxatakicModell ashxatakicModell = new AshxatakicModell();
            ashxatakicModell.setAzganun(azganun);
            ashxatakicModell.setAndamneriQanak(qanak);
            ashxatakicModell.setAshxatavardz(ashxatavardz);

            ashxatakicModells[i] = ashxatakicModell;

        }
        gAsh(ashxatakicModells);
    }

    private void gAsh(AshxatakicModell[] data) {

        int mijin = 0;
        for (int i = 0; i < data.length; i++) {
            mijin = data[i].getAshxatavardz() / data[i].getAndamneriQanak();
            if (mijin < data[i].getG()) {
                System.out.println(data[i].getAzganun());
            }
        }


    }
}
