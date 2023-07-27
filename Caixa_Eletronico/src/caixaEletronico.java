public class caixaEletronico {
    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 25.0;

        if(valorSolicitado <= saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("-----------------------------");
            System.out.println("Seu saldo é R$" + saldo);
        }else{System.out.println("Seu saldo é insificiente.");
        }
        
        

    }
}
