
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("BEM-VINDO AO SISTEMA DE BANCO");
        System.out.println("Nome: ");
        String nome = scan.nextLine();
        System.out.println("Agência: ");
        String agencia = scan.nextLine();
        System.out.println("Número: ");
        String numero = scan.nextLine();
        System.out.println("Saldo: ");
        double saldo = scan.nextDouble();

        System.out.println("Olá " + nome +  ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta "+ numero +" e seu saldo " + saldo +" já está disponível para saque");
    }
}
