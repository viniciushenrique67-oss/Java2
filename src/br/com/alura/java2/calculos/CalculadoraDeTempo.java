package br.com.alura.java2.calculos;

import br.com.alura.java2.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
        }
//    public void inclui(Filme f) {
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie f) {
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
    public void inclui(Titulo titulo) {
//        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
