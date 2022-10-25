import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] mas = {1, 5, 653, 21, 23, 32};
        System.out.println(Arrays.toString(method(mas)));
        System.out.println("hello world ");


    }

    public static int[] method(int[] array) {
        Arrays.sort(array);
        int[] newArr = new int[array.length];
        for (int i = 0; i < array.length - array.length; i++) {


            newArr[i] = array[i];

        }
        return newArr;

    }

    }



































