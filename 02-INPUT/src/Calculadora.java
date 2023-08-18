import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        double num1;
        double num2;
        String op;
        double resultado = 0;
        String fim = "0";
        
        

        System.out.println("Digite o primeiro numero: ");
        num1 = leitor.nextDouble();

      
            
        
        while (fim.equals("0")){

              System.out.print("Digite o operador (+, -, *, /): ");
            char operator = leitor.next().charAt(0);
        
             System.out.println("Digite o segundo numero: ");
             num2 = leitor.nextDouble();
            switch (operator) {

                case '+':
                    resultado = num1 + num2;
                    System.out.println(resultado);
                    break;

                case '-':
                    resultado = num1 - num2;
                    System.out.println(resultado);
                        break;

                case '*':
                        resultado = num1 * num2;
                        System.out.println(resultado);
                        break;

                case '/':

                    if (num2 == 0) {

                System.out.println("Divisão por zero!");
                resultado = 0;
                    }   else { resultado = num1/num2;
                    System.out.println(resultado);
                    break;
                }
                }

            System.out.println("Para limpar a memoria (0), para escolher uma nova operação (1), ou para sair (2)");

                op = leitor.next();

            if  (op.equals("0")) {
                    System.out.println("Digite o novo primeiro numero: ");
                    num1 = leitor.nextDouble();
                    continue;
                } 
            if (op.equals("1")){

                num1 = resultado;
                    continue;
                }
            if (op.equals("2")){
                
                    System.out.print("Obrigado!");
                    break;
                }
                 
            
                

    }leitor.close();
}
}

