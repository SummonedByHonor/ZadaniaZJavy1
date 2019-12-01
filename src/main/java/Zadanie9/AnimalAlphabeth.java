package Zadanie9;

import java.util.Scanner;

public class AnimalAlphabeth {
    public static void tellAnimalBasedOnLetter(){
        System.out.println("Podaj literkę:");
        Scanner scanner = new Scanner(System.in);
        char letterForAnimal = scanner.next().charAt(0);
        switch (letterForAnimal){
            case 'a': {
                System.out.println("A jak anakonda");}
            case 'b': {
                System.out.println("B jak bóbr");
            }
            case 'f': {
                System.out.println("F jak Fretka");
            }
            default:{
                System.out.println("Nie znam zwierzaka na tą literę!");
            }
        }
    }
}
