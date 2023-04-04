package Entities.Exo1;

public class Instrument
{
    private String nomInstrument;
    private int idInstrument;

    public Instrument(int idInstrument,String nomInstrument) {
        this.nomInstrument = nomInstrument;
        this.idInstrument = idInstrument;
    }

    public String getNomInstrument() {
        return nomInstrument;
    }
}
