import java.util.*;

public class MyHeap{

  // - size  is the number of elements in the data array.
  // - push the element at index i downward into the correct position. This will swap with the larger of the child nodes provided that child is larger. This stops when a leaf is reached, or neither child is larger. [ should be O(logn) ]
  // - precondition: index is between 0 and size-1 inclusive
  // - precondition: size is between 0 and data.length-1 inclusive.
  private static void pushDown(int[] data, int size, int index){
    boolean sorted = false;
    while(!sorted){
      int leftIndex = index * 2 + 1;//index of left child
      int rightIndex = index * 2 + 2;//index of right child

      if(leftIndex >= size && rightIndex >= size){//if no child, index will be greater than size
        sorted = true;//this will exit the while loop
      } else{//if there are children
        int max = data[index];//set the max to the parent

        if(leftIndex < size){//if there is a left child
          max = Math.max(max, data[leftIndex]); //finds max between max and left child
        }

        if(rightIndex < size){//if there is a right child
          max = Math.max(max, data[rightIndex]); //finds max between max and right child
        }

        if(max == data[index]){//if the maximum is the parent, then it's already sorted
          sorted = true;//this will exit the while loop
        } else if(leftIndex < size && max == data[leftIndex]){//if the left child is the largest
          swap(data, index, leftIndex);//swap parent and left child
          index = leftIndex;//update index to be the left child
        } else if(rightIndex < size && max == data[rightIndex]){
          swap(data, index, rightIndex);//swap parent and right child
          index = rightIndex;//update index to be the right child
        }

      }
    }

  }

  // - push the element at index i up into the correct position. This will swap it with the parent node until the parent node is larger or the root is reached. [ should be O(logn) ]
  // - precondition: index is between 0 and data.length-1 inclusive.
  private static void pushUp(int[] data, int index){

  }

  // - convert the array into a valid heap. [ should be O(n) ]
  public static void heapify(int[] data){

  }

  // - sort the array by converting it into a heap then removing the largest value n-1 times. [ should be O(nlogn) ]
  public static void heapsort(int[] data){

  }

  public static void swap(int[] data, int index1, int index2){
    int temp = data[index2];//temporarily hold the value at index2
    data[index2] = data[index1];//swap
    data[index1] = temp;//swap
  }



}
