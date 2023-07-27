public class resultado_escolar {
    public static void main(String[] args) {
        double nota = 6.9;
        // operador tenário (substitui o if-then-else)
        String resultado = nota < 5? "Reprovado" : nota < 7 ?"Recuperação": "Aprovado";

        System.out.println(resultado);

      /*   if(nota>=7)
            System.out.println("Aprovado!");
        else if(nota >= 5 && nota <7)
            System.out.println("Recuperação!");
        else
            System.out.println("Reprovado!");
    }   */
    } 
}
