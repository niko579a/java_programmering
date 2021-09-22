import java.util.Arrays;

public class SelectionSortTest{
  public static void main(String[] args){
    SelectionSort voresAlgoritme = new SelectionSort();

    int[][] alleArrays = {
      {42, 18, 6, 22, 45, 27, 32, 47, 2, 35, 3, 38, 29, 33, 36, 10, 43, 25, 49, 34, 26, 1, 9, 40, 31, 16, 19, 13, 5, 17, 8, 4, 7, 37, 12, 20, 24, 46, 11, 28, 14, 39, 41, 23, 50, 21, 44, 15, 48, 30},
      {31, 9, 36, 5, 27, 44, 11, 29, 2, 6, 45, 12, 19, 15, 28, 32, 39, 7, 8, 3, 42, 21, 25, 10, 50, 26, 33, 18, 22, 49, 34, 30, 24, 35, 46, 14, 16, 40, 37, 17, 13, 38, 43, 41, 48, 20, 23, 4, 47, 1},
      {33, 13, 36, 14, 26, 28, 25, 22, 8, 17, 20, 32, 42, 21, 49, 4, 1, 9, 5, 27, 29, 47, 46, 31, 44, 11, 48, 10, 50, 7, 12, 41, 30, 38, 40, 24, 37, 2, 19, 6, 15, 45, 3, 39, 35, 34, 23, 16, 43, 18},
      {32, 9, 3, 8, 16, 37, 13, 49, 23, 50, 48, 34, 46, 36, 35, 47, 42, 6, 22, 10, 1, 18, 24, 2, 27, 26, 30, 44, 43, 25, 17, 33, 31, 28, 20, 4, 41, 21, 14, 11, 15, 7, 12, 45, 29, 39, 5, 38, 19, 40},
      {25, 46, 43, 41, 2, 26, 3, 31, 20, 49, 4, 21, 18, 37, 38, 39, 15, 42, 35, 27, 29, 14, 12, 22, 24, 32, 33, 9, 30, 23, 36, 34, 8, 48, 6, 1, 19, 50, 40, 28, 45, 16, 7, 5, 47, 10, 44, 11, 17, 13}
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
