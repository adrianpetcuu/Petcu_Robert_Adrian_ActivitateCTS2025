package exemplul1.clase;

public class Facade {
    private Sala sala;
    private PersonalSala personalSala;

    public Facade(Sala sala, PersonalSala personalSala){
        this.sala = sala;
        this.personalSala = personalSala;
    }

    public String permiteAcces(Client client){
        if(!sala.isEsteDeschisa()){
            return "Sala este inchisa. Acces interzis!";
        }
        if(!personalSala.isEsteDisponibil()){
            return "Nu este disponibil personal de sala!";
        }

        Bilet bilet = client.getBilet();
        if(!bilet.isEsteValid()){
            return "Bilet invalid!";
        }
        if(!bilet.isEstePlatit()){
            return "Bilet neplatit!";
        }
        return "Acces permis. Vizionare placuta, " + client.getNume() + "!";
    }
}
