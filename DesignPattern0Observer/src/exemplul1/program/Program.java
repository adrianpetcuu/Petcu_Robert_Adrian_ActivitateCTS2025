package exemplul1.program;


import exemplul1.clase.FileMonitor;
import exemplul1.client.BackupService;
import exemplul1.client.Logger;
import exemplul1.client.Observer;


public class Program {
    public static void main(String[] args) {
        Observer logger = new Logger("Sistem");
        Observer backupService = new BackupService("backup/");

        FileMonitor fileMonitor = new FileMonitor("FolderPrincipal");

        fileMonitor.adaugaObserver(logger);
        fileMonitor.adaugaObserver(backupService);

        fileMonitor.evenimentAdaugare("document.txt");
        fileMonitor.evenimentModificare("poza.jpg");
        fileMonitor.evenimentStergere("fisier_temp.tmp");

        fileMonitor.stergeObserver(backupService);

        fileMonitor.evenimentModificare("raport_final.pdf");
    }
}