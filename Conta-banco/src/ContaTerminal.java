import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
        System.out.println("Por favor, \u001b[1m digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println("Por favor, \u001b[1m digite o número da Conta !");
        int conta = scanner.nextInt();

        System.out.println("Por favor, \u001b[1m digite o nome do titular da Conta !");
        String nomeTitular = scanner.next();
        
        System.out.println("Por favor, \u001b[1m digite o saldo inicial da Conta !");
        Double saldo = scanner.nextDouble(); 
        

        System.out.println("Olá,"+ nomeTitular + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
       
    }
}
