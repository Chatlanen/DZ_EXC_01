
/*
 *   1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
 */


public class App_01 {
    public static void main(String[] args) throws Exception {
        
        arrayOutOfBoundsException();
        numberFormatException();
        divisionByZero();
    }

    
    public static void arrayOutOfBoundsException() {
        int[] arr = {1,2,3,4,5};
        try {
            // Пытаемся обратиться к элементу массива за его пределами
            int val = arr[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: выход за пределы массива!");
        }
    }

    public static  void numberFormatException() {

        try {
            String str = "01c";
            int number = Integer.parseInt(str); // Пытаемся преобразовать строку в число
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: невозможно преобразовать строку в число!");
        }
    }

   
    public static void divisionByZero() {

       try {
        int result = 5 / 0; // Пытаемся поделить на ноль
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль!");
        }
    }
}
