package DesafioDio;

public interface AparelhoTelefonico {
	
	public void ligar(String numero);
    public void atender(String numero);
    public void iniciarCorreioVoz(String mensagem, String destinatario);
	public void atualizarPagina(String string);
	public void tocar(String string);
	public void pausar(String string);
	public void selecionarMusica(String string);

}
