//codechef Challenge -- https://www.codechef.com/JAN21C/problems/DECODEIT

package com.company.DivyamSavsaviya;

import java.util.Scanner;

public class DECODEIT {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        char[] chars = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'};
        int t = scanner.nextInt();
        while (t-- >0){
            // Split string in every 4 character and store them in array
            int length = scanner.nextInt();
            scanner.nextLine();
            String[] strings = scanner.nextLine().split("(?<=\\G.{4})");
            // decimal value of encode string is the index of  chars array
            for (String s : strings){
                System.out.print(chars[Integer.parseInt(s , 2)]);
            }
            System.out.println();
        }
    }
}
