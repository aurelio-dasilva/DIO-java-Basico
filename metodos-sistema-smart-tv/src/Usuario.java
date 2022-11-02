public class Usuario{
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> Tv Ligada? " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Novo status -> Tv Ligada? " + smartTv.ligada);

        smartTv.mudarCanal(10);
        System.out.println("Canal Atual: " + smartTv.canal);

        
    }
}
