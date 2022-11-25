package com.bhavna;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class EmployeeFunction {

    public void doLogin() {
        final String outputFilePath
                = "C:\\Users\\Saumya.Prabhakar\\Documents\\Folder\\a.txt";

        EmployeeLogIn obj = new EmployeeLogIn("Mehneen", "01/29 3:00PM");
        EmployeeLogIn obj1 = new EmployeeLogIn("Rahul", "01/29 3:10PM");
        EmployeeLogIn obj2 = new EmployeeLogIn("Mehneen", "01/29 3:25PM");

        Map<Integer, EmployeeLogIn> map = new HashMap<>();
        map.put(901, obj);
        map.put(902, obj1);
        map.put(901, obj2);

        File file = new File(outputFilePath);

        BufferedWriter bf = null;

        try {

            bf = new BufferedWriter(new FileWriter(file));

            for (Map.Entry<Integer, EmployeeLogIn> entry :
                    map.entrySet()) {

                bf.write(entry.getKey() + ":"
                        + entry.getValue());

                bf.newLine();

            }
            System.out.println("Success");

            bf.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                bf.close();
            } catch (Exception e) {
            }
        }


    }


}
