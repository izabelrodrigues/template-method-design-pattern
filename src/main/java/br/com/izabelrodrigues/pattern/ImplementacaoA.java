package br.com.izabelrodrigues.pattern;

public class ImplementacaoA extends Template {

	@Override
	void imprimeMensagemCustomizada() {
		System.out.println("Sou a implementação A");
	}

	@Override
	int obtemResultado() {

		return 5;
	}

}
