public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[]={"felipe","jonas","julia","marcos"};

        for(int x=0;x<alunos.length;x++){
            System.out.println("O aluno no indice x="+x+" é "+alunos[x]);
        }
        for(String aluno:alunos){
            System.out.println("Nome do aluno é " + aluno);
        }
    }
}
