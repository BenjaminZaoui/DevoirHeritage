package Entities.Exo1;

public class CoursCollectif extends Cours implements ICalcul
{
    private String nomCours;
    private int nbPlaceMaxi;
    private int ageMini;

    public CoursCollectif( int idCours,double prixCours, String nomCours,int nbPlaceMaxi, int ageMini) {
        super(idCours,prixCours);
        this.nomCours = nomCours;
        this.nbPlaceMaxi = nbPlaceMaxi;
        this.ageMini = ageMini;
    }

    @Override
    public double getPrix() {
       Double prixCourColl = super.getPrix();
       if (ageMini > 10){
           prixCourColl = prixCourColl + 12;
       }
       else if (ageMini > 20) {
           prixCourColl = prixCourColl + 15;
       }
       else {
           prixCourColl = prixCourColl + 17;
       }
        return prixCourColl;
    }
    public String getinfos(){
        return super.getinfos()+" Nom : " + nomCours +" Age mini "+ ageMini+" nombre de place maxi "+ nbPlaceMaxi ;
    }
}
