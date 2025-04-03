package classes;

public class AdapterClaseMedicament extends MedicamentSpital implements iMedicamentFarmacie{

    public AdapterClaseMedicament(float pret, String nume){
        super(pret, nume);
    }

    @Override
    public void cumparaMedicament() {
        super.achizitioneazaMedicament();
    }
}
