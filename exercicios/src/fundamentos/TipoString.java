package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Essa eh uma String!");
        System.out.println("Bom dia".charAt(2));
        
        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.toLowerCase().endsWith("boa"));
        System.out.println(s.toLowerCase().endsWith("tarde!"));
        System.out.println(s.length());
        System.out.println(s.toLowerCase().equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa TARDE"));
        
        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;
        
        String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario;
        System.out.println(maisUmaFrase);
        
        System.out.printf("\n\nNome: %s\nSobrenome: %s\nIdade: %d\nSalario: R$%.2f", nome, sobrenome, idade, salario);
        
        String frase = String.format("\n\nNome: %s\nSobrenome: %s\nIdade: %d\nSalario: R$%.2f", nome, sobrenome, idade, salario);
        System.out.println(frase);
        
        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".indexOf("a"));
        System.out.println("Frase qualquer".substring(6));
        System.out.println("Frase qualquer".substring(6, 10));
    }
}
