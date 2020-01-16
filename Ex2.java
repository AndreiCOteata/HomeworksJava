package HomeworksJava;

import java.util.Random;

public class Ex2 {
    public static Random random = new Random();
    public static final int dim = 10;
    public static int[] array = new int[dim];
    public static void displayMessage(String Message){ System.out.print(Message); }
    public static int[] generateVector(int[] vector){
        for (int i = 0; i < vector.length ; i++) {
            vector[i] = random.nextInt(30 + 30) - 30;
        }
        return vector;
    }
    public static int[] rearrangeArray1PositionR(int[] array){
        int aux;
        for (int i = array.length-1; i > 0 ; i--) {
            aux = array[i];
            array[i] = array[i-1];
            array[i-1] = aux;
        }
        return array;
    }
    public static void afisareVector(int[] vector){
        for (int l : vector) {
            displayMessage(l + " ");
        }
        displayMessage("\n");
    }
    public static void main(String[] args) {
        afisareVector(generateVector(array));
        afisareVector(rearrangeArray1PositionR(array));
    }
}
