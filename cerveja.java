public class cerveja {

    public static void main(String[] args) {

     int beerNum = 99;

     String palavra = "garrafas";   


   while (beerNum > 0) {

    if (beerNum >= 5) {

        palavra = "garrafas";

    }
        System.out.println(beerNum + " " + palavra + " de cervejas em cima da mesa");
     System.out.println(beerNum + " " + palavra + " de cerveja!!!");

     System.out.println("Derrube uma, porque não?");
     System.out.println("Agora passe por ai");
     System.out.println("Não deixe que ninguém veja! ;)");

        beerNum = beerNum - 1;   
   }
     
     if (beerNum >= 5) {
        System.out.println(beerNum + " " + palavra + " está em cima da mesa");

     }

        
    

        else{
            System.out.println("Não há mais garrafas de cerveja em cima da mesa.");            
        }
    }
    
    
}