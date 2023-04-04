package Entities.Exo1;

public class CoursIndividuel extends Cours implements ICalcul
{
    private Instrument instrument;

    public CoursIndividuel(int idCours,double prixCours, Instrument instrument) {
        super(idCours,prixCours);
        this.instrument = instrument;
    }
    @Override
    public double getPrix() {
        Double prixCourInst = super.getPrix();
        if (instrument.getNomInstrument() == "guitare"){
            prixCourInst = prixCourInst + 7.5;
        }
        else if (instrument.getNomInstrument() == "piano"){
            prixCourInst = prixCourInst + 10;
        }
        else {
            prixCourInst = prixCourInst + 9;
        }

        return prixCourInst;
    }
    public String getinfos(){
        return super.getinfos() + " Instrument : " + instrument.getNomInstrument();
    }
}
