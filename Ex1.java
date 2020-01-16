package AllHomeworks.HomeworksJava;

import java.util.Random;

public class Ex1 {
    public static Random random = new Random();
    //public static Scanner in = new Scanner(System.in); commenting that cuz I got random now :D
    public static final int dim = 10;
    public static int[] array = new int[dim];
    public static void displayMessage(String Message){ System.out.print(Message); }
    public static int[] generateVector(int[] vector){
        for (int i = 0; i < vector.length ; i++) {
            vector[i] = random.nextInt(30 + 30) - 30;
        }
        return vector;
    }
    public static void afisareVector(int[] vector){
        for (int l : vector) {
            displayMessage(l + " ");
        }
        displayMessage("\n");
    }
    public static int[] rearrangeArray(int[] array){
        int j, key;
        for (int i = 1; i < array.length ; i++) {
            key = array[i];
            if(key<0)
                continue;
            j=i-1;
            while(j>=0 && array[j]<0){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
        return array;
    }
    public static void main(String[] args) {
        afisareVector(generateVector(array));
        afisareVector(rearrangeArray(array));
    }
}
