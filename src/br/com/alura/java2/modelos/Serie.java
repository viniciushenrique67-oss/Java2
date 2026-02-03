package br.com.alura.java2.modelos;

public class Serie extends Titulo {

    private int temporadas;
    private int episodiosPorTemp;
    private boolean ativa;
    private int minutosPorEp;

    public int getTemporadas() {
        return temporadas;
    }
    public int getEpisodiosPorTemp() {
        return episodiosPorTemp;
    }
    public boolean getAtiva() {
        return ativa;
    }
    public int getMinutosPorEp() {
        return minutosPorEp;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public void setEpisodiosPorTemp(int episodiosPorTemp) {
        this.episodiosPorTemp = episodiosPorTemp;
    }
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    public void setMinutosPorEp(int minutosPorEp) {
        this.minutosPorEp = minutosPorEp;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemp * minutosPorEp;
    }
}
