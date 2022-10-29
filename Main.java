import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        nextNum(num);


    }
    public static void nextNum (int a){
        int c = (a / 60) % 24;
        int b = a % 60;
        System.out.println( c + " " + b);
    }
}