/** 
 * Developed By Chintan_Panhcal
 */
package OOP_PracticalApp.Core;

import java.util.*;

//Lan_Manuals Practicals
import OOP_PracticalApp.Practical_1.Prac_1;
import OOP_PracticalApp.Practical_2.Prac_2_Meeter_Into_Feet;
import OOP_PracticalApp.Practical_3.Prac_3_CheckVowel;
import OOP_PracticalApp.Practical_4.Prac_4_Reverse_Num;
//Extra Practicals
import OOP_PracticalApp.Extra_Practicals.Extra_Practical_1.Ex_Prac_1_Arithematic_Op;;;

public class Core {

    public static void main(String[] args) {
        char Practical_Type;
        int Practical_No;
        Scanner sc = new Scanner(System.in);
        System.out.println("**********Which Type Of Practicals You Want To  Explore.***********");
        System.out.println("\"L For Lab_manuals Practicals \" \" E For Extra Practicals\"");
        Practical_Type = sc.next().charAt(0);

        if (Character.toUpperCase(Practical_Type) == 'L') {
            System.out.println("1 - Hello_World \" Practical-1 \"");
            System.out.println("2 - Meter-INto_Feet \" Practical-2 \"");
            System.out.println("3 - Check_Vowel_OR_Not \" Practical-3 \"");
            System.out.println("4 - Enter 10 Numbers And Print Them In Revese Order \" Practical-4 \"");
            Practical_No = sc.nextInt();
            if (Practical_No == 1) {
                Prac_1 P1Obj = new Prac_1();
                P1Obj.Perform_Prac_1();
            } else if (Practical_No == 2) {
                Prac_2_Meeter_Into_Feet P2Obj = new Prac_2_Meeter_Into_Feet();
                P2Obj.Perform_Prac_2();
            } else if (Practical_No == 3) {
                Prac_3_CheckVowel P3Obj = new Prac_3_CheckVowel();
                P3Obj.Perform_Prac_3();
            } else if (Practical_No == 4) {
                Prac_4_Reverse_Num P4Obj = new Prac_4_Reverse_Num();
                P4Obj.Perform_Prac_4();
            } else {
                System.out.println("Please Entre Choice From Given Menu.");
            }
            sc.close();
        }
        // @nd Condition For Extra Practicals
        else if (Character.toUpperCase(Practical_Type) == 'E') {
            System.out.println("1 - Perform All Arithmetic \" Operations Extra_Practical-1 \" ");
            System.out.println("2 - Practice Of Loops \" Operations Extra_Practical-2 \" ");
            Practical_No = sc.nextInt();
            if (Practical_No == 1) { // for extra-practical-1
                Ex_Prac_1_Arithematic_Op EX_P1_Obj = new Ex_Prac_1_Arithematic_Op();
                EX_P1_Obj.Perform_Ex_Prac_1();
            } else {
                System.out.println("Please Entre Choice From Given Menu.");
            }
        } 
        else {
            System.out.println("Please Enter Choice From Given Option.");
        }
        sc.close();
    }

    public static void Continue() {
        char Continue_Pro;
        Scanner sc = new Scanner(System.in);
        System.out.println("You Want To Explore More:- \" Y \" OR \" N \" ");
        Continue_Pro = sc.next().charAt(0);
        if (Character.toUpperCase(Continue_Pro) == 'Y') {
            main(null);
        } else {
            System.exit(0);
        }
        sc.close();
    }
}