import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        int numeroConta;
        String agenciaBanco;
        String nomeCliente;
        String sobrenomeCliente;
        float saldoBanco;

        Scanner entraInformacoes = new Scanner(System.in);

        System.out.println("Olá, cliente. Para sua identificação digite seu primeiro nome: ");
        nomeCliente = entraInformacoes.nextLine();

        System.out.println("Digite seu sobrenome: ");
        sobrenomeCliente = entraInformacoes.nextLine();

        System.out.println("Por gentileza, inserir número da conta (formato xxxx): ");
        numeroConta = entraInformacoes.nextInt();
        entraInformacoes.nextLine();

        System.out.println("Por gentileza, inserir agência (formato xxx-x): ");
        agenciaBanco = entraInformacoes.nextLine();

        System.out.println("Por gentileza, inserir saldo em conta: ");
        saldoBanco = entraInformacoes.nextFloat();

        System.out.println("------------------------------------");

        System.out.println("Bem-vindo(a), " + nomeCliente + " " + sobrenomeCliente
                + ". Obrigado por criar uma conta em nosso banco!");
        System.out.println("------------------------------------");
        System.out.println("Suas informações:  ");
        System.out.println("AGÊNCIA: " + agenciaBanco);
        System.out.println("NÚMERO DA CONTA: " + numeroConta);
        System.out.println("SALDO DISPONIVEL PARA USO: " + saldoBanco);

        entraInformacoes.close();

    }

}
