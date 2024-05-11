import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
         
        System.out.println("Olá,digite seu nome ?");
        String nomeCliente = scanner.next();
        
        System.out.println("Por favor,digite seu sobrenome ?");
        String sobrenomeCliente = scanner.next();

        System.out.println("Por favor,digite o numero da Agência! Ex:000-0 ");
        String agencia = scanner.next();

        System.out.println("Por favor,digite o numero da conta! Ex:0000 ");
        int numero = scanner.nextInt();

        System.out.println("Por favor,digite o seu saldo da conta! Ex:000.00");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+nomeCliente+" "+sobrenomeCliente +",obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
    }

}
