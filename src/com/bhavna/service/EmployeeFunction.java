package com.bhavna.service;

import com.bhavna.bean.EmployeeLogIn;

import java.io.*;
import java.util.*;

public class EmployeeFunction {
    Map<String, ArrayList<EmployeeLogIn>> map = new HashMap<>();

//    public void doLogin() {
//        final String outputFilePath
//                = "C:\\Users\\Saumya.Prabhakar\\Documents\\Folder\\a.txt";
//
//        EmployeeLogIn obj = new EmployeeLogIn("Mehneen", "01/29 3:00PM");
//        EmployeeLogIn obj1 = new EmployeeLogIn("Rahul", "01/29 3:10PM");
//        EmployeeLogIn obj2 = new EmployeeLogIn("Mehneen", "01/29 3:25PM");
//
//        Map<Integer, EmployeeLogIn> map = new HashMap<>();
//        map.put(901, obj);
//        map.put(902, obj1);
//        map.put(901, obj2);
//
//        File file = new File(outputFilePath);
//
//        BufferedWriter bf = null;
//
//        try {
//
//            bf = new BufferedWriter(new FileWriter(file));
//
//            for (Map.Entry<Integer, EmployeeLogIn> entry :
//                    map.entrySet()) {
//
//                bf.write(entry.getKey() + ":"
//                        + entry.getValue());
//
//                bf.newLine();
//
//            }
//            System.out.println("Success");
//
//            bf.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//
//            try {
//                bf.close();
//            } catch (Exception e) {
//            }
//        }
//
//
//    }

    public void readFile() {
        Scanner sc = null;
        try {
            File read = new File("C:\\Users\\Saumya.Prabhakar\\Desktop\\micro\\ExceptionHandling\\src\\a.txt");
            sc = new Scanner(read);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                String[] array = data.split("   ");

                EmployeeLogIn login = new EmployeeLogIn(array[0], array[1]);
                EmployeeFunction function = new EmployeeFunction();
                function.readLoginData(login.getName(), login);
                function.display();


            }
        } catch (Exception e) {
            System.out.println("Failure");
            e.printStackTrace();
        } finally {

            try {
                sc.close();
            } catch (Exception ignored) {

            }
        }

    }

    public void readLoginData(String name, EmployeeLogIn data) {

        if (map.containsKey(name)) {
            map.get(name).add(data);
        } else {
            map.put(name, new ArrayList<>());
            map.get(name).add(data);
        }

    }

    public void display() {
//        for (Map.Entry<String, ArrayList<EmployeeLogIn>> entry :
//                    map.entrySet()){
//            System.out.println(entry.getKey()+" "+entry.getValue());
        //       }
        map.forEach((key, values) -> System.out.println(key + ":" + values));
    }


}
