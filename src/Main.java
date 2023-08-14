/*
Question : Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
__________________________________________________________________________________________________________________
Note: can you take care of the duplicates without using any additional Data Structure?
__________________________________________________________________________________________________
Example 1:
Input:
n1 = 6; A = {1, 5, 10, 20, 40, 80}
n2 = 5; B = {6, 7, 20, 80, 100}
n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20 80
____________________________________________________
Explanation: 20 and 80 are the only
common elements in A, B and C.
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void Common_Element(int[] array1, int[] array2, int[] array3){
        ArrayList<Integer> duplicate = new ArrayList<>();
        int length = array1.length;
        int second_length = array2.length;
        int third_length = array3.length;
        int start = 0,second_start = 0,third_start = 0;

        while (start < length && second_start < second_length && third_start < third_length){
            if (array1[start] < array2[second_start]) start++;
            else if (array2[second_start] < array1[start])second_start++;
            else {
                if (start > 0 && array1[start] == array1[start + 1]) {
                    start++;
                    continue;
                }
            }
            while (third_start < third_length  && array3[third_start] < array2[second_start]){
                third_start++;
                if (third_start < third_length  && array3[third_start] == array2[second_start]){
                    duplicate.add(array3[third_start]);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int length = input.nextInt();
        System.out.println("Enter the element inside array :");
        int[] array = new int[length];
        for (int start = 0; start < array.length; start++){
            array[start] = input.nextInt();
        }
        System.out.println("Printing the result :");
    }
}