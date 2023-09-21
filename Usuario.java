public class Usuario {
    public static void main (String[] args) throws Exception{

        SmartTv smartTv = new SmartTv();

        System.out.print("A TV está ligada: "+smartTv.ligada);
        System.out.print("\nQual o canal atual: "+smartTv.canal);
        System.out.print("\nQual o volume: "+smartTv.volume);

        smartTv.ligar();
        System.out.print("\nA TV está ligada: "+smartTv.ligada);
       
        smartTv.desligar();
        System.out.print("\nA TV está desligada: "+ smartTv.ligada);

        smartTv.diminuir();
        smartTv.diminuir();
        smartTv.diminuir();
        smartTv.diminuir();
        System.out.print("\nVolume atual:" + smartTv.volume + "\n");
        
        smartTv.aumentar();
        smartTv.aumentar();
        smartTv.aumentar();
        smartTv.aumentar();
        System.out.print("\nVolume atual:" + smartTv.volume + "\n");

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.print("Canal atual:" + smartTv.canal);
          
    }
}


