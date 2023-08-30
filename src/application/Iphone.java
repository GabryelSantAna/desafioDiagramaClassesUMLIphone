package application;

import entities.AparelhoTelefonico;
import entities.NavegadorInternet;
import entities.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	@Override
	public void tocarMusica() {
		System.out.println("Tocando musica...");

	}

	@Override
	public void pausarMusica() {
		System.out.println("Pausando musica...");

	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando musica...");

	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo pagina internet...");

	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina web...");

	}

	@Override
	public void exibirNovaAba() {
		System.out.println("Adicionando nova aba...");

	}

	@Override
	public void ligar() {
		System.out.println("Fazendo chamada pelo Iphone");

	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligacao...");
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("Correio de voz iniciado...");

	}

}
