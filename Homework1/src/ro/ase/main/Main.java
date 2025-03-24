package ro.ase.main;

import ro.ase.clase.Logger;
import ro.ase.clase.UserService;

public class Main {
    public static void main(String[] args){
        Logger logger = Logger.getInstance(); // prima apelare + initializeaza

        logger.log("Application started.");

        UserService userService = new UserService();
        userService.createUser("Adrian");

        Logger loggerAgain = Logger.getInstance();
        loggerAgain.log("Application finished."); // nu mai creeaza altul
    }
}