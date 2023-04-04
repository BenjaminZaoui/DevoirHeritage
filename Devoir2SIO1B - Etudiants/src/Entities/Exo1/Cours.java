package Entities.Exo1;

import java.util.ArrayList;

public class  Cours implements Comparable<Cours>,ICalcul
{
    private double prixCours;
    private int idCours;

    public Cours(int idCours,double prixCours) {
        this.prixCours = prixCours;
        this.idCours = idCours;
    }

    @Override
    public int compareTo(Cours o) {
        return Double.compare(this.prixCours,o.prixCours);
    }
    public String getinfos(){
        return "Numero : "+String.valueOf(idCours) ;
    }

    @Override
    public double getPrix() {
        return 5;
    }
}
