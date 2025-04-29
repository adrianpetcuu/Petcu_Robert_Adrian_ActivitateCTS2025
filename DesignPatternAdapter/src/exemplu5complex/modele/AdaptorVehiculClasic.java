package exemplu5complex.modele;

import exemplu5complex.clasice.BicicletaClasica;
import exemplu5complex.clasice.TrotinetaClasica;

public class AdaptorVehiculClasic implements VehiculElectric{
    private Object vehiculClasic;

    public AdaptorVehiculClasic(Object vehiculClasic){
        this.vehiculClasic = vehiculClasic;
    }
    @Override
    public void incarca() {
        System.out.println("Vehiculul clasic nu necesita incarcare.");
    }

    @Override
    public void porneste() {
        if(vehiculClasic instanceof BicicletaClasica){
            ((BicicletaClasica) vehiculClasic).pedaleaza();
        } else if(vehiculClasic instanceof TrotinetaClasica){
            ((TrotinetaClasica) vehiculClasic).pornireManuala();
        }
    }

    @Override
    public String getIdentificator() {
        if(vehiculClasic instanceof BicicletaClasica){
            return ((BicicletaClasica) vehiculClasic).getMarca();
        }else if(vehiculClasic instanceof TrotinetaClasica) {
            return ((TrotinetaClasica) vehiculClasic).getCod();
        }
        return "Necunoscut";
    }
}
