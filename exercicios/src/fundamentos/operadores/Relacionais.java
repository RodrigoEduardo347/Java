package fundamentos.operadores;

public class Relacionais {

    public static void main(String[] args) {
        
        System.out.println(3 == 7);
        System.out.println(3 != 7);
        System.out.println(3 > 7);
        System.out.println(3 < 7);
        System.out.println(3 >= 7);
        System.out.println(3 <= 7);
        
        double nota = 6.9;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        
        System.out.println("Tem desconto? " + temDesconto);
    }
}
