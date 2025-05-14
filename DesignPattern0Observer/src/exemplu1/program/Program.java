package exemplu1.program;


import exemplu1.clase.FileMonitor;
import exemplu1.client.BackupService;
import exemplu1.client.Logger;
import exemplu1.client.Observer;


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