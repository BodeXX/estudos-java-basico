package metodos;

public class SmartTv {

    private boolean ligada = false;
    private int canal = 1;
    private int volume = 25;

    // gettters e Setters seguros
    public boolean isLigada(){
        return ligada;
    }

    public int getCanal(){
        return canal;
    }

    public int getVolume(){
        return volume;
    }

    public void setCanal(int novoCanal){
        if (novoCanal > 0) {
            this.canal = novoCanal;
        }
    }

    public void setVolume(int volume){
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        }
    }

    // Métodos de comportamento


    // Liga a TV 
    public void ligar(){
        ligada=true;
    }

    // Desliga a TV
    public void desligar(){
        ligada=false;
    }


    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        if (canal > 1) canal--;
    }

    public void aumentarVolume(){
        if (volume < 100) volume++;
    }

    public void diminuirVolume(){
        if (volume > 0) volume--;
    }

    public void mostrarEstado(){
        System.out.println(this); // usa o toString
    }

    @Override
    public String toString() {
        return "TV ligada ou desliga?: " + ligada + ", Canal: " + canal + ", Volume: " + volume;
    }
}
