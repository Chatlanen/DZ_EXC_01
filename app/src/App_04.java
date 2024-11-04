/*
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных
 * массива и возвращающий новый массив, каждый элемент которого равен
 * частному элементов двух входящих массивов в той же ячейке. Если длины
 * массивов не равны, необходимо как-то оповестить пользователя.
 * Важно: При выполнении метода единственное исключение, которое
 * пользователь может увидеть - RuntimeException, т.е. ваше
 * 
 */

import java.util.Arrays;

public class App_04 {
    public static void main(String[] args) {
        try {
            int[] arr_1 = {10, 20, 30};
            int[] arr_2 = {2, 4, 0};
            
            int[] result = divideArrays(arr_1, arr_2);
            System.out.println(Arrays.toString(result));
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }

    public static int[] divideArrays(int[] arr_1, int[] arr_2) {
        // Проверяем длину массивов
        if (arr_1.length != arr_2.length) {
            throw new RuntimeException("Массивы не одинаковыми!");
        }

        // Создаем результирующий массив такой же длины
        int[] res_arr = new int[arr_1.length];

        // Заполняем результирующий массив частными от деления элементов
        for (int i = 0; i < arr_1.length; i++) {
            // Проверяем делитель на 0
            if (arr_2[i] == 0){
                throw new RuntimeException("Деление на 0!");
            } else {
                res_arr[i] = arr_1[i] / arr_2[i];
            }
        }

        return res_arr;
    }

}
