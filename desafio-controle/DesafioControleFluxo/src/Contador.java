import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal=new Scanner(System.in);

        System.out.println("Informe o parametro 1: ");
        int parametroUm=terminal.nextInt();
        System.out.println("Informe o parametro 2: ");
        int parametroDois=terminal.nextInt();

        try{
            contar(parametroUm,parametroDois);
        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        terminal.close();
        
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm>parametroDois) {
            throw new ParametrosInvalidosException();
        }else{
        int contagem=parametroDois-parametroUm;
        System.out.println("Contagem do controle de fluxo for: ");
        for(int i=0;i<contagem;i++){
 
            System.out.println(i+1);
        }

        }
    }    
}