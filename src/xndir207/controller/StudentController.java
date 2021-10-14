package xndir207.controller;

import xndir207.model.StudentModel;

import java.util.Scanner;

public class StudentController {
    public void studCount(int qanak) {

        StudentModel[] usanoxZang = new StudentModel[qanak];

        for (int i = 0; i < usanoxZang.length; i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("Greq Usanoxi Anuny");
            String name = in.nextLine();

            System.out.println("Greq Azganuny");
            in = new Scanner(System.in);
            String surname = in.nextLine();

            System.out.println("Greq Gnahatakany");
            in = new Scanner(System.in);
            int rating = in.nextInt();

            //sarqum enq mi hat usanox u ira tvyalnery

            StudentModel studentModel = new StudentModel();
            studentModel.setName(name);
            studentModel.setSurname(surname);
            studentModel.setRating(rating);
            //miacnum enq mer zanvacin

            usanoxZang[i] = studentModel;
        }

        mijGnahat(usanoxZang);


    }

    private void mijGnahat(StudentModel[] tvyal) {
        int gnahatGumar = 0;
        int mijin = 0;
        for (int i = 0; i < tvyal.length; i++) {
            gnahatGumar += tvyal[i].getRating();
            mijin = gnahatGumar / tvyal.length;

        }

        for (int i = 0; i < tvyal.length; i++) {
            if (tvyal[i].getRating() > mijin) {
                System.out.println(tvyal[i].toString());
            }
        }


    }
}

