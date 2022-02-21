/**
 * @author: Maria Rodriguez Palomino
 *@since: 21/02/2022
 * @version: UTF-8
 */
package com.company;

public class Electronica extends Producte {
    private int dies_garantia;

    /**
     * Description: Dades del producte
     * @param preu cost total del producte
     * @param nom nom del producte
     * @param codi codi de barres per identificar el producte
     * @param diesg els dies de garantia
     */
    public Electronica(float preu, String nom, String codi, int diesg) {
        super(preu, nom, codi);
        dies_garantia = diesg;
    }

    /**
     * Description: Mostra al client quin serà el valor final del producte junt amb la garantia
     */
    @Override
    public float getPreu() {
        float preu = super.getPreu();
        return (float) (preu + preu*(dies_garantia/365)*0.1);
    }

    /**
     *  Description: Mostra al client les dades finals
     * @return el nom del producte amb el seu respectiu preu
     */
    @Override
    public String toString() {
        return getNom() + "," + getPreu();
    }

}
