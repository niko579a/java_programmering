import java.util.Arrays;

public class SelectionSortTest{
  public static void main(String[] args){
    SelectionSort voresAlgoritme = new SelectionSort();

    int[][] alleArrays = {
     {7, 8, 1, 4, 3, 2, 6, 9, 5, 10},
     {6, 1, 2, 4, 5, 3, 10, 9, 7, 8},
     {8, 6, 5, 1, 7, 4, 2, 9, 3, 10},
     {10, 9, 1, 3, 6, 5, 2, 8, 7, 4},
     {8, 10, 3, 5, 9, 7, 2, 6, 1, 4}
   };
   for(int i = 0; i < alleArrays.length; i++){
     long startTime = System.nanoTime();
     voresAlgoritme.sort(alleArrays[i]);
     long endTime = System.nanoTime();
     long time = endTime - startTime;
     System.out.println("array " + i + " brugte: " + time + " ns");
   }
  }
}
