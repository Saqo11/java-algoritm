package xndir209.controller;

import xndir209.model.StudModel;

import java.util.Scanner;

public class StudentControllers {
    public void addStudent(int studentCount) {
        StudModel[] studentModels = new StudModel[studentCount];
        for (int i = 0; i < studentModels.length; i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("Azganun");
            String surname = in.nextLine();

            System.out.println("gnahatakan");
            in = new Scanner(System.in);
            int gnahatakany = in.nextInt();

            System.out.println("MatyaniHamar");
            in = new Scanner(System.in);
            int matyanaiHamary = in.nextInt();

            StudModel studentModel = new StudModel();
            studentModel.setAzganun(surname);
            studentModel.setGnahatakan(gnahatakany);
            studentModel.setMatyaniHamar(matyanaiHamary);

            studentModels[i] = studentModel;

        }
        anbavarar(studentModels);

    }

    private void anbavarar(StudModel[] data) {

        for (int i = 0; i < data.length; i++) {

            if (data[i].getGnahatakan() >= 0 && data[i].getGnahatakan() <= 9) {
                System.out.println(data[i].getAzganun() + data[i].getMatyaniHamar());
            }

        }
    }


}
