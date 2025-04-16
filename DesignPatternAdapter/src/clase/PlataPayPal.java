package clase;

public class PlataPayPal {

    private String email;

    public PlataPayPal(String email){
        this.email = email;
    }

    public void trimitePlata(float suma){
        System.out.println("Plata prin PayPal de pe emailul " + email + " in valoare de " + suma + " lei.");
    }
}
