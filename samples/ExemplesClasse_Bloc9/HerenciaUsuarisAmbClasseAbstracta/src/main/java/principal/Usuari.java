/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author user
 */
public abstract class Usuari {
    
//    private int sessioID;
    protected int sessioID;
    
    public Usuari (int sessioID)
    {
        this.sessioID = sessioID;
    }
    
    public abstract boolean iniciaSessio();
    
    public boolean teOfertaProducte (int idProducte)
    {
        return false;   //Retorn per la majoria de tipus d'Usuaris
    }
}
