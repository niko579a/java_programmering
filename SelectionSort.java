import java.util.*;

public class SelectionSort{
  public static void main(String[] args){
    //int[] talArray = {5, 4, 11, 7, 6, 9, 1, 8, 14, 10, 15, 20, 16, 25, 12, 22, 19, 21, 2, 3, 13, 23, 18, 24, 17};
    //sort(talArray);
  }
  public static void sort(int[] array){
    int index = 0;
    int pladsHolder = 0;
    int cardsCheck = 0;

    while(cardsCheck != array.length - 2) {
      if(index == array.length - 1){
        if(array[index] < array[index - 1]){
          pladsHolder = array[index];
          array[index] = array[index - 1];
          array[index - 1] = pladsHolder;
          cardsCheck = 0;
        }
      } else {
        if(array[index] > array[index + 1]){
          pladsHolder = array[index];
          array[index] = array[index + 1];
          array[index + 1] = pladsHolder;
          cardsCheck = 0;
        } else {
          cardsCheck++;
        }
      }

      if(index == array.length - 1){
        index = 0;
      } else {
        index++;
      }
    }

    System.out.println(Arrays.toString(array));
  }
}
