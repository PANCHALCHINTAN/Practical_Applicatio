//write a java programs that reads a number in meters converts it to feet and displays the result.
package OOP_PracticalApp.Practical_2;

import java.util.Scanner;

import OOP_PracticalApp.Core.Core;

public class Prac_2_Meeter_Into_Feet {
    public void Perform_Prac_2() {
        double D;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number:-");
        D = sc.nextInt();
        System.out.println("Amswere is :- " + (D / 0.30));
        sc.close();
        Core.Continue();
    }
}