package padroesGrasp.A;

public interface Ferramentas {
    /**
     * Recebe como parâmetro um vetor contendo animais, que podem ser de várias espécies diferentes, e retorna um vetor que contém apenas os animais cuja espécie é especificada no parâmetro “especieFiltrar”. Se não houver nenhum animal da espécie especificada, retorna um vetor com zero posições.
     *
     * @param completo       Vetor de animais que serão filtrados.
     * @param especieFiltrar Nome da espécie do animal para realizar a filtragem.
     * @return Vetor de animais da espécie especificada.
     */
    Animal[] filtraEspecie(Animal[] completo, String especieFiltrar);

    /**
     * Recebe como parâmetro um vetor contendo animais e retorna um vetor de Strings contendo o nome de todas as espécies que foram encontradas no vetor recebido como parâmetro. Cada nome de espécie só aparece uma vez no vetor de saída.
     *
     * @param completo Vetor de animais que serão classificados.
     * @return Nome da espécie dos animais do vetor.
     */
    String[] classificaEspecies(Animal[] completo);
}