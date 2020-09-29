package com.java;

import java.util.*;

public class Lcm {
    public static void main(String[] args) {
        long result = 1;
        int upLimit = 10;
        Set<Integer> digits = new HashSet<Integer>();
        for (int i = 1; i <= upLimit; i++) {
            if (result % i != 0) {
                digits.add(i);
                result *= i;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0 && result % j == 0) {
                        if (digits.contains(j)) {
                            result /= j;
                            digits.remove(j);
                        }
                    }
                }
            }
        }
        System.out.println(result);
        //m1();
        m3();
    }

    public static void m1() {
        //    int a=2, b=3, max, step, lcm = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first number ::");
//        a = sc.nextInt();
//        System.out.println("Enter second number ::");
//        b = sc.nextInt();
        List<Integer> a = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int step;
        int max = step = 10;
        int lcm = 0;

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (max % i == 0) {
                    lcm = max;
                    continue;
                }
                max = max + step;
            }


        }
        System.out.println(lcm);

//        if(a > b){
//            max = step = a;
//        }
//        else{
//            max = step = b;
//        }

//        while(a!= 0) {
//            if(max % a == 0 && max % b == 0) {
//                lcm = max;
//                break;
//            }
//            max += step;
//        }
//        System.out.println("LCM of given numbers is :: "+lcm);
    }
    public  static  void m3(){
        int max=10;
        int min=1;
        int x,lcm=0;
        for(int i=1;i<=max;i++){
            x= max*i;
            if(x%min==0){
                lcm=x;
                break;
            }
        }
        System.out.println(lcm);
    }
}