package Zadanie2;

public class NumberComparator {
    public static void compareNumbers(int numberA, int numberB){
        if (numberA > numberB){
            System.out.println(numberA + " jest większa.");
        }else System.out.println(numberB + " jest większa.");
    }

    public static void main(String[] args) {
        compareNumbers(4, 10);
    }
}
