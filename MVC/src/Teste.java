
public class Teste {
	public static void main(String[] args) {
		 
        Musica model  = musicaLancada();

        PlataformaView view = new PlataformaView();

        GravadoraController controller = new GravadoraController(model, view);

        controller.setNome("Pretty Savage");
        
        System.out.println("Pesquisando...");

        controller.atualizaView();
     }

     private static Musica musicaLancada(){
        Musica musica = new Musica();
        musica.setNome("Pretty Savage");
        musica.setArtista("Blackpink");
        musica.setGenero("K-pop");
        return musica;
        
     }
}
