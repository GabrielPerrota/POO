import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        String msg;
        double num1;
        int num2;

        System.out.println("informe um texto");
        msg = leitor.next();// lê entrada do usuario
        System.out.println(msg);

        System.out.println("informe um double");
        num1 = leitor.nextDouble();

        System.out.println("informe um int");
        num2 = leitor.nextInt();
        System.out.println(num1 + " " + num2);

        leitor.close();
        
    }
}