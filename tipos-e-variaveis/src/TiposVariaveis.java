public class TiposVariaveis {
    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();

        System.out.println("TV Ligada? " + smartTV.ligada);
        smartTV.mudarCanal(7);
        System.out.println("Canal Atual? " + smartTV.canal);
        System.out.println("Volume Atual? " + smartTV.volume);

        smartTV.aumentarVolume();
        System.out.println("Novo Volume " + smartTV.volume);
        smartTV.diminuirVolume();
        System.out.println("Novo Volume " + smartTV.volume);

        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        System.out.println("Canal Atual? " + smartTV.canal);
    }

}
