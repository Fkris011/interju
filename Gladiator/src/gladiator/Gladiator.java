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
public class Gladiator {

    private byte ev;
    private Szinkod szinkod;
    private boolean szabad; // alap hamis
    private Szarmazas szarmazas;
    private boolean tapasztalt;

    public Gladiator(Szarmazas szarmazas) {
        this.ev = 0;
        this.szinkod = Szinkod.Sarga;
        this.szabad = false;
        this.szarmazas = szarmazas;
        this.tapasztalt = false;
    }

    public byte getEv() {
        return ev;
    }

    public Szinkod getSzinkod() {
        return szinkod;
    }

    public boolean isSzabad() {
        return szabad;
    }

    public boolean isTapasztalt() {
        return tapasztalt;
    }

    public void setEv(byte ev) {
        this.ev = ev;
    }

    public void setSzinkod(Szinkod szinkod) {
        this.szinkod = szinkod;
    }

    public void setSzabad(boolean szabad) {
        this.szabad = szabad;
    }

    public Szarmazas getSzarmazas() {
        return szarmazas;
    }

    public void setSzarmazas(Szarmazas szarmazas) {
        this.szarmazas = szarmazas;
    }

    public void setTapasztalt(boolean tapasztalt) {
        this.tapasztalt = tapasztalt;
    }

    public void oregszik() {
        byte evekSzama = this.getEv();
        if (this.isTapasztalt()) {
            evekSzama++;
        }
        if (evekSzama > 10) {
            evekSzama = -1;
            
        }
        
        switch (evekSzama) {
            case 0:
                //System.out.println(evekSzama + "/--/");
                pluszEgyEv();
                Fejlodik(evekSzama);
                break;
            case 1:
                //System.out.println(evekSzama + "/--/");
                pluszEgyEv();
                Fejlodik(evekSzama);
                break;
            case 2:
                //System.out.println(evekSzama + "/--/");
                pluszEgyEv();
                Fejlodik(evekSzama);
                break;
            case 3:
                //System.out.println(evekSzama + "/--/");
                //   System.out.println("5");
                pluszEgyEv();
                Fejlodik(evekSzama);
                break;
            case 4:
                //System.out.println(evekSzama + "/--/");
                pluszEgyEv();
                Fejlodik(evekSzama);
                break;
            case 5:
                //System.out.println(evekSzama + "/--/");
                //   System.out.println(getSzinkod());
                //  System.out.println("5");
                pluszEgyEv();
                Fejlodik(evekSzama);
                break;
            case 6:
                //System.out.println(evekSzama + "/--/");
                pluszEgyEv();
                Fejlodik(evekSzama);
                this.setTapasztalt(true);
                break;
            case 7:
                //System.out.println(evekSzama + "/--/");
                //  System.out.println("7");
                //  System.out.println(getSzinkod());
                pluszEgyEv();
                Fejlodik(evekSzama);
                break;
            case 8:
                //System.out.println(evekSzama + "/--/");
                pluszEgyEv();
                Fejlodik(evekSzama);
                break;
            case 9:
                //System.out.println(evekSzama + "/--/");
                // System.out.println("9");
                pluszEgyEv();
                Fejlodik(evekSzama);
                break;
            case 10:
                //System.out.println(evekSzama + "/--/");
                // System.out.println("FELSZABADÍTVA");
                felszabadit();

                break;
            case -1 : 
                System.out.println("A gladiátor már nem harcolhat, felszabadult!");
                break;

        }

    }

    private void pluszEgyEv() {
        this.setEv((byte) (this.getEv() + 1));
    }

    private void Fejlodik(byte ev) {
        if (ev < 3) {
            this.setSzinkod(Szinkod.Sarga);
        } else if (ev < 6) {
            this.setSzinkod(Szinkod.Piros);

        } else {
            this.setSzinkod(Szinkod.Fekete);
        }
    }

    private void felszabadit() {
        this.setSzabad(true);

    }
}
