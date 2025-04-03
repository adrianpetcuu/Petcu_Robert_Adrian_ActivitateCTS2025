package classes;

public class AdaptorMedicament extends MedicamentFarmacie{
    private MedicamentSpital medicamentSpital;

    public AdaptorMedicament(float pret, String nume, boolean esteInStoc) {
        super(pret, nume, esteInStoc);
    }

    public AdaptorMedicament(MedicamentSpital medicamentSpital){
        super(medicamentSpital.getPret(), medicamentSpital.getNume(), true);
        this.medicamentSpital = medicamentSpital;
    }

    public void cumparaMedicament(){
        medicamentSpital.achizitioneazaMedicament();
    }
}
