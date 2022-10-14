package com.siit.course;

public class Course03 {
    static int x = 0;

    public static void main(String[] args) {
        int y = 1;
        String name = " Carmen";
        float a = 100.4f;
        double b = 100.4;

        boolean myBool = true;

        System.out.println("Hello curs 3 !!! Yupii !!");
        System.out.println(name);
        System.out.println("My name is" + name);
        System.out.println(args[0] + args[1]);
        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));

        if (x > 5) {
            System.out.println("NUmber is greater than 5");
        }
        if (y < 5) {
            System.out.println("NUmber is....");
        } else {
            System.out.println("Number exceeds....");
        }

        int index = 0;
        while (myBool) {
            System.out.println("Infinit loop !!! " + index);
            if (index > 10) {
                myBool = false;
            }
            index++;
        }

        for (index = 0; index <= 10; index++) {
            System.out.println("Infinit loop !!! " + index);
        }

//        for (index = 0; index < args.length; index++);
//        {
//            System.out.println(args[index]);
//        }

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("Suma este" + sum);

        final int MAX_NUMBER = 1000000;
        for (int i = 0; i < MAX_NUMBER; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("Number " + i + "iis prime");
            }
        }
    }
}
