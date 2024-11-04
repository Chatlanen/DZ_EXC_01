

/*
 *  Реализуйте метод, принимающий в качестве аргументов два целочисленных
 * массива и возвращающий новый массив, каждый элемент которого равен
 * разности элементов двух входящих массивов в той же ячейке.
 * Если длины массивов не равны, необходимо как-то оповестить
 * пользователя.
 */

import java.util.Arrays;

public class App_03 {
    public static void main(String[] args) {
        int[] a = new int[] {1,2,3,4};
        int[] b = new int[] {1,2,3,4};

        System.out.println(Arrays.toString(diff_arr(a,b)));
    }

    public static int[] diff_arr(int[] arr_1, int [] arr_2){
        if (arr_1.length != arr_2.length) {
            System.out.println("Массивы не равны!");
            return new int[]{0};
        }
        int[] res_arr = new int[arr_1.length];
        for (int i = 0; i < arr_1.length; i++) {
            res_arr[i] = arr_1[i] - arr_2[i];
        }   
        return res_arr;  
    }

}
