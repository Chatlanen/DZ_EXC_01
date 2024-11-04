

/*
 * 2. Посмотрите на код и подумайте сколько разных типов исключений вы тут сможете получить?
 */



public class App_02 {
    public static void main(String[] args) {
        String arr[][] = {{"1,5", "2", "3", "4"}, {"1", "2", "3", "4", "5","6"}};
        System.out.println(sum2d(arr));
 
    }

    public static int sum2d(String[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++){  // Возможно появление ошибки java.lang.ArrayIndexOutOfBoundsException (Выход за пределы индекса массива)
                int val = Integer.parseInt(arr[i][j]); // Возможно исключение  java.lang.NumberFormatException.forInputString  (Невозможно преобразовать число в Integer)
                sum += val;
            }
        }
        return sum;
    }
}
