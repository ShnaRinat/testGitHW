package lesson3;

public class DZ3 {
    public static void main(String[] args ) {

        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
            if(arr1[i] == 1){
                arr1[i] = 0;
            }
            else {
                arr1[i] = 1;
            }}

        System.out.println();
        System.out.println("Замена");
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\n");

                int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
            arr2[i] = i + 1;
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }

        System.out.println("\n");

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++){
            System.out.print(arr3[i] + " ");
            if (arr3[i] < 6){
                arr3[i] *=2;
            }
        }
        System.out.println(" ");
        for (int i = 0; i < arr3.length; i++){
            System.out.print(arr3[i] + " ");
        }

        System.out.println("\n");

        int n = 6;
        int [][] arr4 = new int[n][n];
        for (int i = 0; i < n; i++) {
            arr4[i][i] = 7;
            arr4[i][n - i - 1] = 9;
        }
        for (int i = 0; i < arr4.length; i++){
            for (int j = 0; j< arr4[i].length; j++){
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int [] arr6 = {66666, 6666, 666, 6};
        int max = arr6[0];
        int min = arr6[0];
        for(int i = 0; i != arr6.length; i ++){
            if(arr6[i] > max){
                max = arr6[i];
            }
            if(arr6[i] < min){
                min = arr6[i];
            }}
        System.out.println(min + " " + max);
        System.out.println();

        arr5(3, 3);
    }

    public static int[] arr5(int len, int initialValue){
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
            System.out.println(arr[i]);
        }
        return arr;
    }}