import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        double saldo;
        String agencia, cliente;

        System.out.println("digite seu numero ");
        numero = sc.nextInt();

        System.out.println("digite sua agencia ");
        agencia = sc.next();

        System.out.println("digite seu nome ");
        cliente = sc.next();

        System.out.println("digite seu saldo ");
        saldo = sc.nextDouble();


        System.out.println("Olá " + cliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
