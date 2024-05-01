public class Usuario {
    
    public static void main(String[] args) throws Exception{
       
        SmartTv smartTV = new SmartTv();

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();

        smartTV.mudarCanal(23);
        System.out.println("canal atual"+smartTV.canal);
        
        System.out.println("Volume atual: " + smartTV.volume);
        
        System.out.println("TV ligada? "+ smartTV.ligada);

        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo Status -> TV ligada? "+ smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo Status -> TV ligada? "+ smartTV.ligada);

        
       
    }
}
