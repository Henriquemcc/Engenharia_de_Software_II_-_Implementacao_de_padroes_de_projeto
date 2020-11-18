package padroesGrasp.b.questaoQuatro;

import padroesGrasp.b.Correntista;
import padroesGrasp.b.MovimentoConta;
import padroesGrasp.b.OperacoesBanco;

/**
 * Contém o método atualizarSaldoCorrentistas.
 */
public class AtualizarSaldoCorrentista
{

	/**
	 * Atualiza o saldo das contas correntes de acordo com o movimento da conta.
	 *
	 * @param C              Vetor de instâncias da classe Correntista.
	 * @param M              Vetor de instâncias da classe MovimentoConta.
	 * @param operacoesBanco Instância de classe que implementa a interface OperacoesBanco.
	 */
	public static void atualizarSaldoCorrentistas(Correntista[] C, MovimentoConta[] M, OperacoesBanco operacoesBanco)
	{

		for (MovimentoConta movimentoConta : M)
		{
			Correntista correntista = operacoesBanco.encontraCorrentista(C, movimentoConta.getCPFCorrentista());

			if (correntista != null)
			{
				correntista.setSaldo(correntista.getSaldo() + movimentoConta.getValorMovimento());
			}
		}

	}

}
