public class Cliente {
    public static void main(String[] args) throws Exception{
        ContaTerminal contaTerminal=new ContaTerminal();

        System.out.println("Por favor, digite o número da Agência: "+contaTerminal.agencia);
        
        System.out.println("Olá "+ contaTerminal.nomecliente+", obrigado por criar uma conta em nosso banco, sua agência é "+contaTerminal.agencia+", conta "+contaTerminal.numero+" e seu saldo "+contaTerminal.saldo+" já está disponível para saque.");
    }
}