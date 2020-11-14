package padroesGrasp.A;

/**
 * Representa as ferramentas utilizadas pelo sistema do zoológico para filtrar e classificar as espécies de animais.
 */
public interface Ferramentas {

    /**
     * Filtra os animais por espécie.
     *
     * @param completo       Vetor de instâncias das classes que implementam a interface Animal.
     * @param especieFiltrar Nome da espécie que será utilizada na filtragem.
     * @return Vetor de animais da espécie especificada.
     */
    Animal[] filtraEspecie(Animal[] completo, String especieFiltrar);

    /**
     * Classifica as espécies dos animais.
     *
     * @param completo Vetor de instâncias das classes que implementam a interface Animal.
     * @return Vetor de String com os nomes dos animais.
     */
    String[] classificaEspecies(Animal[] completo);
}