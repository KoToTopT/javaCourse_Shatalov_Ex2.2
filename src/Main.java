
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int [][] arr = new int[3][4];
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter array: ");

            for(int i = 0; i < arr.length; i++){
                for (int j = 0; j < arr[i].length; j++){
                    arr[i][j] = scanner.nextInt();
                }
                System.out.println("--------");
            }

//        int [][] arr = {{10,10,10,10}, {11,11,11,11}, {12,12,12,12}};

        printTwoDimArray(arr);
        printString(arr);
        printString(transposeArray(arr));
        printTwoDimArray(replaceElementsInArr(arr));
        printAverageInArrayString(arr);

    }

    public static void printTwoDimArray(int[][] arr){

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println("--------------");
    }

    public static void printString(int[][] arr){

        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
            int stringNum = i + 1;
            if (arr[i].length == 4)
                System.out.println("Line: " + stringNum + " Summ: " + sum);
            else System.out.println("Column: " + stringNum + " Summ: " + sum);
        }
        System.out.println("--------------");
    }

    public static int[][] transposeArray(int[][] arr){
        int[][] transposedArray = new int[4][3];

        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                transposedArray[j][i] = arr[i][j];
            }
        }
        return transposedArray;
    }

    public static int[][] replaceElementsInArr(int[][] arr){
        int[][] transposedArray = new int[3][4];
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] % 2 == 0)
                    transposedArray[i][j] = 0;
                else transposedArray[i][j] = 1;
            }
        }
        return transposedArray;
    }

    public static void printAverageInArrayString(int[][] arr){
        for (int[] ints : arr) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            System.out.println(sum / ints.length);
        }
    }
}