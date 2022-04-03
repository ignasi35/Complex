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
public class FIFO extends CuaPaquets
{
    public FIFO(int qServei, int capacitat)
    {
        super(qServei, capacitat);
    }
    
    @Override
    public Paquet extreu()
    {
        if (this.paquets.isEmpty())
            return null;
        
        Paquet p = this.paquets.remove(0);      //Retorna l'objecte eliminat
        this.ocupada -= p.getMida();
        return p;
    }
    
    @Override
    public String toString()
    {
        String s = "[FIFO]\n";
        s += super.toString();
        return s;
    }
}
