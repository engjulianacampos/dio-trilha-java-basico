import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception{

        //TODO: conhecer e importar a classe Scanner
        //Exibir as mensagens para o usuario
        //obter pela scanner os valores digitados no terminal
        //exibir a mensagem conta criada
    Scanner scanner=new Scanner(System.in);

    String nomecliente="mario andrade";
    double saldo=237.48;

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia=scanner.nextLine();
        System.out.println("Por favor, digite o número da Conta: ");
        Integer conta=scanner.nextInt();

        System.out.println("Olá "+ nomecliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo "+saldo+" já está disponível para saque.");
        scanner.close();

}
}