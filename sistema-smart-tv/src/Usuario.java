public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ?" + smartTv.ligada);
        System.out.println("Canal Atual: "+smartTv.canal);
        System.out.println("Volume atual "+ smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status - TV Ligada ?" + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println(smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println(smartTv.volume);

        smartTv.mudarCanal();
    }
}
