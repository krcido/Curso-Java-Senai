import java.util.*;;


public class Excessoes {
   
        public static void main(String[] args) {
         try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            System.out.println("--------------------------------------------------------------");
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " +  sobrenome + ".");
            System.out.println("--------------------------------------------------------------");
            System.out.println("Tenho " + idade + " anos.");
            System.out.println("--------------------------------------------------------------");
            System.out.println("Minha altura é " + altura + "cm.");
            System.out.println("--------------------------------------------------------------");
            scanner.close();

        } catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos!");
        }
    }
}

    

    



