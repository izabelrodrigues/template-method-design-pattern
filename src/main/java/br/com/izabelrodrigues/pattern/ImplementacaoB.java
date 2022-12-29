package br.com.izabelrodrigues.pattern;

public class ImplementacaoB extends Template{

	@Override
	void imprimeMensagemCustomizada() {
		System.out.println("Sou a implementação B");
	}

	@Override
	int obtemResultado() {
		return 9;
	}

}
