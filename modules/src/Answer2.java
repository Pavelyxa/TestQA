import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {
        System.out.println("Введите имя:");
        Scanner in = new Scanner(System.in);
        String value = in.nextLine();
        if(value.equals("Вячеслав")){
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
