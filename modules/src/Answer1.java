import java.util.Scanner;

public class Answer1 {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        if(value>7){
            System.out.println("Привет");
        }
    }
}
