package com.company.DivyamSavsaviya;
import java.util.Scanner;

public class DIVTHREE {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int t = scanner.nextInt();
        while(t-- > 0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int d = scanner.nextInt();
            int totalProblem = 0;
            for (int i = 0 ; i < n ; i++){
                totalProblem += scanner.nextInt();
            }
            //printing min value
            System.out.println(Math.min(d, totalProblem / k));
        }

    }
}
