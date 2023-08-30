package application;

public class Usuario {

	public static void main(String[] args) {

		Iphone iphone = new Iphone();
		// chammando Aparelho telefonico
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioDeVoz();
		System.out.println();

		// Chamando NavegadorIntenet
		iphone.exibirPagina();
		iphone.exibirNovaAba();
		iphone.atualizarPagina();
		System.out.println();

		// Chamando ReprodutorMusica
		iphone.tocarMusica();
		iphone.pausarMusica();
		iphone.selecionarMusica();

	}

}
