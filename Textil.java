/**
 * @author: Maria Rodriguez Palomino
 *@since: 21/02/2022
 * @version: UTF-8
 */

package com.company;

public class Textil extends Producte {
    private String composicio;
    private String codificacio;

    /**
     *  Description. Dades del producte
     * @param preu preu del producte
     * @param nom nom del producte
     * @param codi codi del producte
     * @param compo composició del producte
     */
    public Textil(float preu, String nom, String codi, String compo) {
        super(preu, nom, codi);
        composicio = compo;
        codificacio = preu + codi;
    }

    /**
     *  Description: Mostra quina és la composició del producte
     * @return de quina composició está fet el producte téxtil
     */
    public String getComposicio() {
        return composicio;
    }

    /**
     *  Description: Dona valor a la composició
     * @param composicio la composició del producte téxtil
     */
    public void setComposicio(String composicio) {
        this.composicio = composicio;
    }

    /**
     *  Description: Mostra al client les dades finals
     * @return el nom del producte amb el seu respectiu preu
     */
    @Override
    public String toString() {
        return new String(getNom() + " " + getPreu());
    }

    /**
     * Description: aquesta funció no s'utilitza
     * @return la codificació del producte
     */
    //aquesta funció no s'està usant
    public String getCode (){
        return codificacio;
    }

}
