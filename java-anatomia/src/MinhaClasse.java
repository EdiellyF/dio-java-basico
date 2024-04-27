public class MinhaClasse {
    
 public static void main(String[] args) {
   
   String primeiroNome = "Edielly";
   String segundoNome = "Ferreira";

   String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
   System.out.println(nomeCompleto);
 }


 public static String nomeCompleto(String primeiroNome, String segundoNome){
      return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
 }

}

//a classe deve possuir o mesmo nome dp arquivo.java
//toda variavel deve ser escrita com letra minúscula