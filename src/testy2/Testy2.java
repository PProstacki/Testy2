package testy2;

public class Testy2 {

    public static void main(String[] args) {       
       TableSort sort = new TableSort();
       sort.fillTable();
       sort.quicksort(sort.randomNumbers, 0, 9999999);
    }
    
}
