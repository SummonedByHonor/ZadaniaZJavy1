package Zadanie3;

public class CompareNumbersInGroup {
    public static void compareManyNumbers(int numberA, int numberB, int numberC){
        int[] entryNumberTable = {numberA, numberB, numberC};
        int max = 0;
        int min = 0;
        for (int i = 0; i < entryNumberTable.length; i ++){
            if (max < entryNumberTable[i]){
                max = entryNumberTable[i];
            }
        }
        min = max;
        for (int i = 0; i < entryNumberTable.length; i ++){
            if (min > entryNumberTable[i]){
                min = entryNumberTable[i];
            }
        }

        System.out.println("liczba " + max + " jest najwyższa.");
        System.out.println("liczba " + min + " jest najniższa.");
    }

    public static void main(String[] args) {
        compareManyNumbers(3, 1, 10);
    }
}

