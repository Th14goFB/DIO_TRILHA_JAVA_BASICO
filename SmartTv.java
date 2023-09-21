public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=12;



    public void ligar () {
        ligada = true;
    }

    public void desligar () {
        ligada = false;
    }

    public void aumentar() {
        volume++;
        System.out.print("\nAumentando volume para:" + volume);
    }

    public void diminuir() {
        volume--;
        System.out.print("\nDiminuindo volume para:" + volume);
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("\nMudando para o canal:" + canal);
    }

    public void voltarCanal() {
        canal--;
        System.out.println("Voltando ao canal:" + canal);
    }
}

