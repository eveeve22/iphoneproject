import java.util.Scanner;

public class Telefone {
    private int contato;
    Scanner scanner= new Scanner(System.in);


    public Telefone(int discador, int contato) {
    
        this.contato = contato;
    }
   
    public int getContato() {
        return contato;
    }
    public void setContato(int contato) {
        this.contato = contato;
    }
    // Aparelho Telefônico: ligar, atender, iniciarCorrerioVoz

    public void ligar(){
        System.out.println("Escolha o contato que deseja ligar");
        contato = scanner.nextInt();
        System.out.println("Ligando para: "+contato);

    }
     public void atender(){
        System.out.println("Atendendo ligação: "+this.contato);
    }

     public void iniciarCorrerioVoz(){
        System.out.println("iniciando Correrio de Voz ...");
    }


}
