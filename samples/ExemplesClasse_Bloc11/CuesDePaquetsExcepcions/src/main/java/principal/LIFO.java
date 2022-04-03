/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import excepcions.CuaBuidaException;

/**
 *
 * @author user
 */
public class LIFO extends CuaPaquets
{
    public LIFO (int qServei, int capacitat)
    {
        super(qServei, capacitat);
    }
    
    @Override
    public Paquet extreu() throws CuaBuidaException
    {
        super.extreu();
        
        Paquet p = this.paquets.remove(this.paquets.size()-1);
        this.ocupada -= p.getMida();
        return p;
    }
    
    @Override
    public String toString()
    {
        String s = "[LIFO]\n";
        s += super.toString();
        return s;
    }
}
