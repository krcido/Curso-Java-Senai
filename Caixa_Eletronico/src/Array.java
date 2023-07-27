public class Array {
    public static void main(String[] args) {
        // formato for 1
        String alunos[] = {"Vinicius", "Ana", "Leticia", "Rafael"};

        for(int i = 0; i < alunos.length; i++){
            System.out.println("O aluno no índice i = " + i + " é " + alunos[i]);
        }

        System.out.println("------------------------------------------------");

        //formato for 2
        for(String aluno : alunos){
            System.out.println("O aluno no índice é " + aluno);
        }
    }
}