
public class MinhaClasse {
   public static void main (String [] args){
   

   String nome_completo = nomeCompleto("Luis", "Carlos");
   System.out.println(nome_completo);
   
   } 

   public static String nomeCompleto(String primeiroNome, String segundo_Nome){
      return primeiroNome.concat(" ").concat(segundo_Nome);
   }
}
