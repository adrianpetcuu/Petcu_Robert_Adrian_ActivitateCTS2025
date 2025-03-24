package ro.ase.clase;

public class UserService {
    private Logger logger = Logger.getInstance();

    public void createUser(String name){
        logger.log("User " + name + " has been created.");
    }
}
