package br.com.izabelrodrigues.pattern;

public class TesteTemplate {

	public static void main(String[] args) {
		String tipo = "A";
		//String tipo = "B";

		Template implementacao;
		if("A".equals(tipo)) {
			implementacao = new ImplementacaoA();
		} else {
			implementacao = new ImplementacaoB();
		}

		implementacao.executar();
	}

}
