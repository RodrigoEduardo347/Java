package fundamentos.operadores;

public class Logico {

    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;
        
        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 && !condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 || !condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(condicao1 ^ condicao2);        
        
        System.out.println("\n\nTabela verdade do OR");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        
        System.out.println("\n\nTabela verdade do XOR (Exclusive OR)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);
        
        System.out.println("\n\nTabela verdade do NOT");
        System.out.println(!true);
        System.out.println(!false);
    }
}

