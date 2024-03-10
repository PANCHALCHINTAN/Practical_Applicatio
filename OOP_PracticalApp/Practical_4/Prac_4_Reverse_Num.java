package OOP_PracticalApp.Practical_4;
import java.util.Scanner;

import OOP_PracticalApp.Core.Core;

public class Prac_4_Reverse_Num {
    public void Perform_Prac_4() {
        int[] Num = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 Integer Numbers:- ");
        for (int i = 0; i < Num.length; i++) {
            Num[i] = sc.nextInt();
        }
        System.out.println("***********Reverse*************");
        for (int j = (Num.length - 1); j >= 0; --j) {
            System.out.println("Positions" + " " + j + " and Value is :- " + Num[j]);
        }
        sc.close();
        Core.Continue();
    }
}
