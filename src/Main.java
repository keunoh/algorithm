// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int[] arr = {1, 2, 3, 4, 5};

       int tmp;
       tmp = arr[1];
       arr[1] = arr[3];
       arr[3] = tmp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}