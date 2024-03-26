package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int massive[][] = {{3,45,6,6,7},{3,64,7,89,2},{23,5,8,4,98},{43,5,8,23,7},{24,5,8,2,8}};
        List<Integer> list = new ArrayList<>();
        int n = 0;
        for (int i = 0; i < massive.length; i++){
            for (int j = 0; j < massive.length; j++){
                System.out.print(massive[i][j] + " ");
                if (list.size() == 0){
                    n = 1;
                }
                if (massive.length - j == n){
                    list.add(massive[i][j]);
                    n++;
                }
            }
            System.out.println();
        }

        list.remove((list.size() - 1)/2);
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++){
            if (list.get(i) < min){
                min = list.get(i);
            }
        }
        System.out.println("Минимальный элемент диагонали массива не включая пересечения: " +  min);
    }
}