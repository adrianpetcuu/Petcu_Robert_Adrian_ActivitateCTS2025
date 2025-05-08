package exemplul1.clase;

public class Loc implements ILoc{
    private String sector;
    private String tipScaun; // Vip sau Normal

    public Loc(String sector, String tipScaun){
        this.sector = sector;
        this.tipScaun = tipScaun;
    }


    @Override
    public void afiseazaDetalii(Rezervare rezervare) {
        System.out.println("Loc in sectorul " + sector + ", tip scaun: " + tipScaun +
                ". Rand: " + rezervare.getRand() +
                ", Numar loc: " + rezervare.getNumarLoc() +
                ", rezervat de: " + rezervare.getNumePersoana());
    }
    // sector si tipScaun - date intrinseci (partajate)
    // datele unice (extrinseci) - rand, numarLoc, numePersoana -> sunt primite prin Rezervare
}
