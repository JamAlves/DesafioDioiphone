package DesafioDio;

public abstract class iPhone implements ReprodutorMusical, AparelhoTelefonico,NavegadorInternet{
     
	@Override
    public void ligar(String numero) {
          this.ligar("LIGANDO");
          System.out.println("ligando");
    }

    @Override
    public void atender(String numero) {
        this.atender("ATENDENDO");
        System.out.println("atendendo");
    }

    @Override
    public void iniciarCorreioVoz(String mensagem, String destinatario) {
        this.iniciarCorreioVoz(mensagem, destinatario);
        System.out.println("mensagem");
        System.out.println("destinatario");
    }

    @Override
    public void exibirPagina(String url) {
       this.exibirPagina(url);
       System.out.println("EXIBINDO PAGINA");
    }

    @Override
    public void adicionarNovaAba(String url) {
        this.adicionarNovaAba(url);
        System.out.println("NOVA ABA");
    }

    @Override
    public void atualizarPagina(String string) {
        this.atualizarPagina("ATUALIZANDO");
        System.out.println("ATUALIZADO");
    }

    @Override
    public void tocar(String string) {
        this.tocar("TOCANDO MUSICA");
        System.out.println("TOCANDO");
    }

    @Override
    public void pausar(String string) {
        this.pausar("PAUSANDO A MUSICA");
        System.out.println("PAUSADO");
    }

    @Override
    public void selecionarMusica(String string) {
       this.selecionarMusica("SELECIONANDO A MUSICA"); 
       System.out.println("SELECIONANDO");
    }

	
	

}
