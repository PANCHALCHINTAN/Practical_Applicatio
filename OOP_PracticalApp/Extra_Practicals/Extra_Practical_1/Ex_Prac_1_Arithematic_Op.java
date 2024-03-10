package OOP_PracticalApp.Extra_Practicals.Extra_Practical_1;
import java.util.Scanner;

import OOP_PracticalApp.Core.Core;
public class Ex_Prac_1_Arithematic_Op {

    public void Perform_Ex_Prac_1() {
        int n1, n2, Choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:- ");
        n1 = sc.nextInt();

        System.out.println("Enter Second Number:- ");
        n2 = sc.nextInt();

        System.out.println("1 For Addition");
        System.out.println("2 For Subtraction");
        System.out.println("3 For Multiplication");
        System.out.println("4 For Divisuon");
        System.out.println("What Is Want to perform");
        Choice = sc.nextInt();
        switch (Choice) {
            case (1):
                System.out.println("**************Outputs***********");
                System.out.println("Addition  Of " + n1 + " and " + n2 + " is :-" + (n1 + n2));
                Core.Continue();
                break;
            case (2):
                System.out.println("**************Outputs***********");
                System.out.println("Subtraction  Of " + n1 + " and " + n2 + " is :-" + (n1 - n2));
                Core.Continue();
                break;
            case (3):
                System.out.println("**************Outputs***********");
                System.out.println("Multiplication  Of " + n1 + " and " + n2 + " is :-" + (n1 * n2));
                Core.Continue();
                break;
            case (4):
                System.out.println("**************Outputs***********");
                System.out.println("Division  Of " + n1 + " and " + n2 + " is :-" + (n1 / n2));
                Core.Continue();
                break;
            default:
                System.out.println("Enter Value For Given Choice...");
                Core.Continue();
                break;
        }
        sc.close();
    }
}