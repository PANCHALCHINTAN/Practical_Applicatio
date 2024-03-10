package OOP_PracticalApp.Practical_3;

import java.util.Scanner;

//Write a java program to define given alphabrt is vowel or consonents.
import OOP_PracticalApp.Core.Core;

public class Prac_3_CheckVowel {
    public void Perform_Prac_3() {
        char ch, UpperChar;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Alphabet:-");
        ch = sc.next().charAt(0);
        if (Character.isAlphabetic(ch)) {
            UpperChar = Character.toUpperCase(ch);
            switch (UpperChar) {
                case 'A':
                    System.out.println("" + (char) UpperChar + " is a Vowel.");
                    Core.Continue();
                    break;
                case 'E':
                    System.out.println("" + (char) UpperChar + " is a Vowel.");
                    Core.Continue();
                    break;
                case 'I':
                    System.out.println("" + (char) UpperChar + " It is a Vowel.");
                    Core.Continue();
                    break;
                case 'O':
                    System.out.println("" + (char) UpperChar + " is a Vowel.");
                    Core.Continue();
                    break;
                case 'U':
                    System.out.println("" + (char) UpperChar + " is a Vowel.");
                    Core.Continue();
                    break;
                default:
                    System.out.println("" + (char) UpperChar + " Is a Consonent:- ");
                    Core.Continue();
                    break;
            }
        } else if (Character.isDigit(ch)) {
            System.out.println("You Entered Digits \" " + ch + " \" Please Enter only Characters....");
            Core.Continue();
        } else if (Character.isSpaceChar(ch)) {
            System.out.println("You Entered Special Characters \" " + ch + " \" Please Enter only Characters....");
            Core.Continue();
        } else {
            System.out.println("You Entered Something Wrong \" " + ch + " \" Please Enter only Characters....");
            Core.Continue();
        }
        sc.close();
    }
}