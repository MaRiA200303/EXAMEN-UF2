/**
 * @author: Maria Rodriguez Palomino
 *@since: 21/02/2022
 * @version: UTF-8
 */

package com.company;

public abstract class Producte {
    private float preu;
    private String nom;
    private String codibarres;

    /**
     *  Description: Dades del producte
     * @param preu cost total d'un producte
     * @param nom nom del producte
     * @param codi codi de barres per identificar quin producte és
     */
    public Producte(float preu, String nom, String codi) {
        this.preu = preu;
        this.nom = nom;
        codibarres = codi;
    }

    /**
     * Description: Agafa el preu del producte
     * @return preu del producte
     */
    public float getPreu() {
        return preu;
    }

    /**
     *  Description: Mostra el preu del producte
     * @param preu preu del producte
     */
    public void setPreu(float preu) {
        this.preu = preu;
    }

    /**
     *Description: Agafa el nom del producte
     * @return nom del producte
     */
    public String getNom() {
        return nom;
    }

    /**
     * Description: Mostra el nom del producte
     * @param nom nom del producte
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Description: Agafa el codi de barres del producte
     * @return codi de barres per identificar el producte
     */
    public String getCodibarres() {
        return codibarres;
    }

    /**
     *  Description: Mostra el codi de barres per saber de quin producte es tracte
     * @param codibarres codi de barres per identificar el producte
     */
    public void setCodibarres(String codibarres) {
        this.codibarres = codibarres;
    }

    /**
     * Description: Compara els codi de barres per veure si és el mateix producte
     * @param obj
     * @return els productes que tenen el mateix codi de barres
     */
    @Override
    public boolean equals(Object obj) {
        boolean son_iguals;
        if(obj == null) {
            son_iguals = false;
            return son_iguals;
        }
        else {
            Producte p = (Producte) obj;
            if (codibarres.equals(p.getCodibarres()) && getPreu() == p.getPreu()) {
                son_iguals = true;
                return son_iguals;
            }
            else {
                son_iguals = false;
                return son_iguals;
            }
        }
    }

    /**
     *  Description: Es llegeix el codi de barres per identificar de quin producte es tracta
     * @return el codi del producte
     */
    @Override
    public int hashCode() {
        int codi = codibarres.hashCode();
        return codi;
    }




