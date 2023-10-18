public class NavegadorInternet {
    private String pagina;

    public NavegadorInternet(String pagina) {
        this.pagina = pagina;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

     // Navegador na Internet: exibirPagina, adicionarNovaAba, atualizarPagina

    public void exibirPagina(){
        System.out.println("Exibindo Página");
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando Nova Página");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando Página");
    }
}



