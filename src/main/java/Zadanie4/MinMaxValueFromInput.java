package Zadanie4;

import java.util.Scanner;

public class MinMaxValueFromInput {
    int max = 0;
    int min = 0;
    Scanner scanner = new Scanner(System.in);
    public void minMaxCompareFromLoop(Scanner scanner){
    int liczbaInput = 0;
    while (true){
        liczbaInput = Integer.parseInt(scanner.nextLine());
        if (liczbaInput != -1){
            if(max < liczbaInput){
                max = liczbaInput;
            }
            if (liczbaInput < min && min != 0){
                min = liczbaInput;
            } else min = max;
        } else break;
    }
    }
}
