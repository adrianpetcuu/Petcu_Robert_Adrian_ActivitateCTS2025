package exemplul1.client;

public class BackupService implements Observer {
    private String locatieBackup;

    public BackupService(String locatieBackup){
        this.locatieBackup = locatieBackup;
    }
    @Override
    public void notifica(String numeFisier, String actiune) {
        if(actiune.equalsIgnoreCase("modificat") || actiune.equalsIgnoreCase("adaugat")){
            System.out.println("[BACKUP] Creat backup pentru " + numeFisier + " in " + locatieBackup + ".");
        }
    }
}
