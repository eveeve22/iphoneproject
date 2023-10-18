import java.util.Scanner;

public class ReprodutorMusical {
    private String musica;
     Scanner scanner= new Scanner(System.in);

    public ReprodutorMusical(String musica) {
        this.musica = musica;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }
    
    
    //Repodutor Musicial: tocar, pausar, selecionarMusica
      public void selecionarMusica(){
          System.out.println("Escolha a musica que deseja tocar");
        musica = scanner.next();
    }
    public void tocarMusica(){
        if(!musica.isEmpty()){
        System.out.println("Tocando: "+ this.musica);
        }else {
            System.out.println("Nenhuma Musica Selecionada, Selecione a Musica que deseja tocar");
        }
    }
    public void pausarMusica(){
         System.out.println("Pausado: "+ this.musica);
    }
  

}
