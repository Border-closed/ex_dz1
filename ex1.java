import java.util.Arrays;

//1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
//Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
//2. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
//и возвращающий новый массив, каждый элемент которого равен разности элементов двух 
//входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то 
//оповестить пользователя.
//3.* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
//и возвращающий новый массив, каждый элемент которого равен частному элементов двух 
//входящих массивов в той же ячейке. Если длины массивов не равны, необходимо 
//как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, 
//которое пользователь может увидеть - RuntimeException, т.е. ваше.

public class ex1{
    public static void main(String[] args) {
        // 1 Исключение / by zero
        //devide(111, 0); 
        
        // 2 Исключение Index 4 out of bounds for length 3
        //String[] caNatmes = {"Васька", "Барсик", "Мурзик"};
        //System.out.println(caNatmes[4]); 

        // 3 Исключение The literal 78000000000 of type int is out of range 
        //int value = 78000000000;
        //System.out.println(value*value);

        int []massiv1 = {1,2,7};
        int []massiv2 = {2,4,5};
        if (massiv1.length != massiv2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }
        else {
        System.out.println(Arrays.toString(delta(massiv1,massiv2)));
        }
    }

    public static int devide(int a, int b){
        return a/b;
    }

    public static int[] delta(int[] massiv1, int[] massiv2){
        int[] massiv3 = new int[Math.min(massiv1.length,massiv2.length)];
        for (int i = 0; i < massiv3.length; i++) {
            massiv3[i]=massiv1[i]-massiv2[i];
        }
        return massiv3;
    }
}