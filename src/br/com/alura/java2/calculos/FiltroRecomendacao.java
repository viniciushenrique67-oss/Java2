package br.com.alura.java2.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Melhores do momento!");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Também gostaram.");
        } else {
            System.out.println("Assista também: ");
        }
    }
}
