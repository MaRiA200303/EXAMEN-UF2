/**
 * @author Maria Rodriguez Palomino
 *@since 21/02/2022
 * @version UTF-8
 */

package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Description: Mostra al client el producte amb el nom, preu, codi amb la data de caducitat
 */
public class Alimentacio extends Producte {

    private LocalDate d;

    /**
     * Description: Dades del producte
     * @param preu cost total del producte
     * @param nom nom del producte
     * @param codi codi de barres per identificar el producte
     * @param datac data de caducitat del producte
     */
    public Alimentacio(float preu, String nom, String codi, LocalDate datac) {
        super(preu, nom, codi);
        d = datac; //obtenim la data de caducitat
    }

    /**
     * Description: Mostra al client quin serà el valor final del producte
     */
    @Override
    public float getPreu() {
        float preu = super.getPreu();
        long dif;
        dif = ChronoUnit.DAYS.between(d,LocalDate.now());
        preu = preu - (float) (preu*(1/(dif+1)) + (preu*(0.1)));
        //System.out.println("preu:" + preu);
        return preu;
    }

    /**
     *  Description: Mostra al client les dades finals
     * @return el nom del producte amb el seu respectiu preu
     */

    @Override
    public String toString() {
        return new String(getNom() + " " + getPreu());
    }


}

