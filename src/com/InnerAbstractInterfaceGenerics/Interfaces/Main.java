package com.InnerAbstractInterfaceGenerics.Interfaces;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player rohan = new Player("Rohan",5,100);
        System.out.println(rohan.toString());
        saveObject(rohan);

        rohan.setHitpoints(90);
        System.out.println(rohan);
        rohan.setWeapon("Lightsaber");
        saveObject(rohan);

        //loadObject(rohan);
        System.out.println(rohan);

        ISaveable warewolf = new Monster("warewolf", 10,60);
        System.out.println(warewolf);
        saveObject(warewolf);
    }

    public static ArrayList<String> readValues(){

        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        int index = 0;

        System.out.println("Choose \n "+
                "1 to enter string"+
                "0 to quit");

        while (!quit){
            System.out.println("Choose an option:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave){

        for (int i=0; i<objectToSave.write().size(); i++){
            System.out.println("Saving "+objectToSave.write().get(i)+
                    " to Storage Device");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
