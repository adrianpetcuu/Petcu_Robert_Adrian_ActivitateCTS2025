package clase;

public class Facade {

    public String verificaAsezareMasa(Masa masa) {
        Picolo picolo = new Picolo();
        Ospatar ospatar = new Ospatar();

        if(masa.isEsteLibera()){
            if(picolo.debaraseaza(masa)){
                if(ospatar.esteAranjata(masa)){
                    return "Puteti lua loc la masa " + masa.getNrMasa() + ".";
                }
                else {
                    return "Asteptati putin ca sa fie aranjata masa.";
                }
            }else{
                return "Asteptati, tocmai s-a ridicat cineva.";
            }
        }
        else{
            return "Nu avem locuri libere.";
        }
    }
}
