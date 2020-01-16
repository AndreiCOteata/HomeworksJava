package HomeworksJava;
import java.util.Random;
public class Ex3 {
    static{
        System.out.println("Kenobi: Hello there! \nGrievous: General Kenobi, can you do some math: \nKenobi:");
    }
    public static Random random = new Random();
    public static int numar1 = random.nextInt(1000+1000)-1000;
    public static int numar2 = random.nextInt(1000+1000)-1000;
    public static void displayMessage(String Message){ System.out.print(Message); }
    public static int numberAddition(int var1, int var2){return var1+var2;}
    public static int numberSubtract(int var1, int var2){return var1-var2;}
    public static long numberMultiplication(int var1,int var2){ return (long) var1 * (long) var2; }
    public static double numberDivision(int var1, int var2){return (double) var1/(double) var2;}
    public static String numberSqrt(int var1) {
        double ans;
        if(var1<0){
            var1 = -var1;
            ans = Math.pow(var1, 0.5);
            return "SQRT of " + var1 + "is: " + ans + "i! ";
        }
        return "SQRT of " + var1 + " is: " + Math.sqrt(var1) + "! ";
    }
    public static void main(String[] args) {
        displayMessage("Numbers chosen " + numar1 +" and " +numar2 + "\n");
        displayMessage("Addition:" + numberAddition(numar1,numar2) + "\n");
        displayMessage("Subtract: " + numberSubtract(numar1, numar2) + " and " + numberSubtract(numar2,numar1) + "\n");
        displayMessage("Multiplication: " + numberMultiplication(numar2,numar2) + "\n");
        displayMessage("Division: " + numberDivision(numar1, numar2) + " and " + numberDivision(numar2,numar1) + "\n");
        displayMessage(numberSqrt(numar1)+" "+ numberSqrt(numar2));
    }
}
