package xndir235;

import java.util.Scanner;

public class girqController {
    public void girq(int count){
        girqModel[] girqModels=new girqModel[count];
        for (int i = 0; i <girqModels.length; i++) {
            Scanner in =new Scanner(System.in);
            System.out.println("hamar");
            int hamar=in.nextInt();

            System.out.println("vernagir");
            in=new Scanner(System.in);
            String vernagir =in.nextLine();

            System.out.println(" ejeri qanak");
            int ejeriQanak =in.nextInt();

            girqModel girqModel =new girqModel();
            girqModel.setEjetiQanak(ejeriQanak);
            girqModel.setHamar(hamar);
            girqModel.setVernagir(vernagir);
            girqModels[i]=girqModel;
        }
        PPP(girqModels);
    }

    private void PPP(girqModel[] data) {
        for (int i = 0; i < data.length; i++) {

        }
    }
}
