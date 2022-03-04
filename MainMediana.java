import java.util.Arrays;

public class MainMediana {
    public static void main(String[] args) {

        int mediana;
        int[] array = { 9, 2, 1, 4, 6, 10, 9, 15, 8 };
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int metade = array.length / 2;

        if (array.length % 2 == 0) {
            mediana = (array[metade - 1] + array[metade]) / 2;
        } else {
            mediana = array[metade];
        }

        System.out.println(mediana);

    }

}