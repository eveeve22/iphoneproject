import java.util.Scanner;

public class IPhone {

    ReprodutorMusical reprodutorMusical = new ReprodutorMusical(null);
    Telefone telefone= new Telefone(0, 0);
    NavegadorInternet navegadorInternet = new NavegadorInternet(null);    
   
    public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in);
            IPhone iphone = new IPhone();
            int caso;
            System.out.println("Iniciando Iphone ...");

            System.out.println("Escolha qual app do Iphone deseja utilizar: \n 1-Ipod (Reprodutor Musical) \n" +" 2-Safari (Navegador)"+ "\n 3-Telefone"+"\n 4-Desligar");
            int opcao= scanner.nextInt();
            
            do{
            switch(opcao){
                case 1:{
                    System.out.println("Ipod");
                    System.out.println("Escolha entre as opções: \n1-Selecionar Musica \n2-Tocar Musica \n3-Pausar Musica \n4-Voltar para home");
                     caso=scanner.nextInt();
                    if(caso==1){
                         iphone.reprodutorMusical.selecionarMusica();
                         iphone.reprodutorMusical.tocarMusica();
                         opcao=0;
                         break;
                    }else if(caso==2){
                         iphone.reprodutorMusical.tocarMusica();
                         opcao=0;
                         break;
                    }else if(caso==3){
                           iphone.reprodutorMusical.pausarMusica();
                           opcao=0;
                           break;
                    }else if(caso==4){ 
                        System.out.println("Voltando para Home");
                        opcao=0;
                    break;
                    }else{
                        System.out.println("Essa não é uma opção válida!");
                        break;
                    }
                    
                
                }
                 case 2:{
                     System.out.println("Safari");
                    System.out.println("Escolha entre as opções: 1-Exibir Página \n2-Atualizar Página \n3-adicionarNovaAba Musica \n4-Voltar para home");
                    caso=scanner.nextInt();
                    if(caso==1){
                        iphone.navegadorInternet.exibirPagina();
                    }else if(caso==2){
                         iphone.navegadorInternet.atualizarPagina();
                    }else if(caso==3){
                           iphone.navegadorInternet.adicionarNovaAba();
                    }else if(caso==4){ 
                        System.out.println("Voltando para Home");
                    break;
                    }else{
                        System.out.println("Essa não é uma opção válida!");
                    }
                    break;
                }
                case 3:{
                    System.out.println("Telefone");
                    System.out.println("Escolha entre as opções:\n1-Ligar \n2-Atender \n3-Iniciar Correrio de Voz \n4-Voltar para home");
                    caso=scanner.nextInt();
                    if(caso==1){
                        iphone.telefone.ligar();
                        break;
                    }else if(caso==2){
                       iphone.telefone.atender();
                       break;
                    }else if(caso==3){
                        iphone.telefone.iniciarCorrerioVoz();
                        break;
                    }else if(caso==4){ 
                        System.out.println("Voltando para Home");
                    break;
                    }else{
                        System.out.println("Essa não é uma opção válida!");
                        caso=scanner.nextInt();
                    }
                 }case 4:{
                    System.out.println("Desligando");
                    break;
                 }
                 default:
                    System.out.println("Digite novamente a opção desejada!");
                    caso=scanner.nextInt();
                    }
                }
                while(opcao!=4);

            
        
        }

    }

