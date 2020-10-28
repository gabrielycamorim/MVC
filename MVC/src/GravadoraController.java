
public class GravadoraController {
	private Musica model;
    private PlataformaView view;

    public GravadoraController(Musica model, PlataformaView view){
       this.model = model;
       this.view = view;
    }

    public void setNome(String nome){
       model.setNome(nome);      
    }

    public String getNome(){
       return model.getNome();       
    }

    public void setArtista(String artista){
       model.setArtista(artista);      
    }

    public String getArtista(){
       return model.getArtista();     
    }

    public void setGenero(String genero){
           model.setGenero(genero);      
    }

        public String getGenero(){
           return model.getGenero();       
    }
    public void atualizaView(){                
       view.printMusica(model.getNome(), model.getArtista(), model.getGenero());
    }    
}
