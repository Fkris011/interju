/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gladiator;

/**
 *
 * @author f_kri
 */
public class KepzettGladiator extends Gladiator {

    public KepzettGladiator(Szarmazas szarmazas) {
        super(szarmazas);
    }
    
    private Fegyvernem fegyvernem;
    private String becenev;

    @Override
    public void oregszik() {
        if (this.getEv() > 7) {
            this.setEv((byte) (this.getEv() + 1));
            
        }
       super.oregszik();
    }
     
    
    
    
}
