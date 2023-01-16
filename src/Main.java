import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Class class1 = new Class(5,"Nurisa", new int[]{2,4,5,6,7});

        System.out.println("Number: " +class1.getNumber());
        System.out.println("Word: " +class1.getWord());

//        int[] array = class1.getArray();
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }

        System.out.println(Arrays.toString(class1.getArray()));



    }
}