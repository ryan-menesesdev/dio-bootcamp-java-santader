public class SmartTv {
    private boolean onOff = true;
    private int canal = 10;
    private int volume = 26;

    public boolean getOnOff(){
        return this.onOff;
    }

    public void setOnOff(boolean acao){
        this.onOff = acao;
    }

    public int getCanal(){
        return this.canal;
    }

    public void setCanal(int acao){
        this.canal = acao;
    }

    public void subirCanal(){
        this.canal++;
    }

    public void descerCanal(){
        this.canal--;
    }

    public int getVolume(){
        return this.volume;
    }

    public void setVolume(int acao){
        this.volume = acao;
    }

    public void aumentarVolume(){
        this.volume ++;
    }

    public void diminuirVolume(){
        this.volume --;
    }    

}
