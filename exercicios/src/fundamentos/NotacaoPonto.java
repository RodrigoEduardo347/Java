package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        String s = "Bom dia X";
        s = s.replace("X", "Senhora");
        s = s.concat("!!!");
        s = s.toUpperCase();
        System.out.println(s);
        
        String x = "Leo".toUpperCase();
        System.out.println(x);
        
        String y = "Bom dia X"
                .replace("X", "Gui")
                .toUpperCase()
                .concat("!!!");
        System.out.println(y);
        
//        Tipos primitivos não tem operador "."
        int a = 3;
        System.out.println(a);
    }
}
