import br.com.alura.java2.modelos.Filme;
import br.com.alura.java2.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();

        filme1.setNome("Shrek 2");
        filme1.setDuracaoEmMinutos(98);
        filme1.setAnoDeLancamento(2004);
        filme1.setIncluidoNoPlano(true);

        filme1.exibeFichaTecnica();
        filme1.avalia( 9);
        filme1.avalia( 10);
        filme1.avalia( 8);
        System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacao());
        System.out.println(filme1.pegaMedia());
        //filme1.somaDasAvaliacoes = 10;
        System.out.println("Média de avaliações do filme: " + filme1.pegaMedia());

        Serie serie1 = new Serie();
        serie1.setNome("O cavaleiro dos 7 reinos");
        serie1.setAnoDeLancamento(2026);
        serie1.setTemporadas(1);
        serie1.setEpisodiosPorTemp(8);
        serie1.setMinutosPorEp(45);
        serie1.exibeFichaTecnica();
        System.out.println("Duração da maratona: " + serie1.getDuracaoEmMinutos() + " min.");
    }
}
