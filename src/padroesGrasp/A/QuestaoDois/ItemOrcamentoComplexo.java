package padroesGrasp.A.QuestaoDois;

public class ItemOrcamentoComplexo extends ItemOrcamento {

    public ItemOrcamento[] subItemOrcamento;

    /**
     * Além dos parâmetros da superclasse, recebe como parâmetro o vetor com os subitens de orçamento.
     *
     * @param historico
     * @param valor
     * @param subItemOrcamento
     */
    public ItemOrcamentoComplexo(String historico, float valor, ItemOrcamento[] subItemOrcamento) {
        super(historico, valor);
        this.subItemOrcamento = subItemOrcamento;
    }

    /**
     * Sobrescreve o método da superclasse, retornando a soma de valores de todos os subitens de orçamento.
     *
     * @return
     */
    @Override
    public float getValor() {
        float valor = super.getValor();

        for (ItemOrcamento subItem : this.subItemOrcamento) {
            valor += subItem.getValor();
        }

        return valor;
    }

    /**
     * Recebe como parâmetro o histórico de um subitem (String) e retorna o objeto correspondente ao subitem que possui este histórico, se existir. Se não existir retorna null.
     *
     * @param historico
     * @return
     */
    public ItemOrcamento encontraItem(String historico) {

        ItemOrcamento itemOrcamentoProcurado = null;

        for (ItemOrcamento item : this.subItemOrcamento) {
            if (item.getHistorico().equals(historico)) {
                itemOrcamentoProcurado = item;
                break;
            }
        }

        return itemOrcamentoProcurado;
    }
}
