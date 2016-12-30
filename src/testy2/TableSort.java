package testy2;

import java.util.Random;

public class TableSort {
    public int[] randomNumbers = new int[10000000];

    public void quicksort(int[] numbers, int start, int end) {

        int x, y, z, c;

        x = start;
        y = end;
        z = numbers[(start + end) / 2];
        do {
            while (numbers[x] < z) {
                x++;
            }
            while (z < numbers[y]) {
                y--;
            }
            if (x <= y) {
                c = numbers[x];
                numbers[x] = numbers[y];
                numbers[y] = c;
                x++;
                y--;
            }
        } while (x <= y);
        if (start < y) {
            quicksort(numbers, start, y);
        }
        if (x < end) {
            quicksort(numbers, x, end);
        }
    }
    
    public void fillTable(){
        Random random = new Random();
        for(int i = 0; i < 10000000; i++){
            randomNumbers[i] = random.nextInt();
        }
    }
}
