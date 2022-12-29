/**
 *
 */
package br.com.izabelrodrigues.pattern;

/**
 * @author Izabel Rodrigues
 *
 */

public abstract class Template {

	protected final void executar() {

		imprimeMensagemCustomizada();
		int resultado = obtemResultado();
		imprimeResultado(resultado);
	}

	abstract void imprimeMensagemCustomizada();
	abstract int obtemResultado();

	private final void imprimeResultado(int resultado) {
		System.out.println("Mensagem padrão ......... ");
		System.out.println("O resultado foi: " + resultado);
	}

}
