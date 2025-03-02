package ro.cts.seminar1.clase;

public class Student extends Persoana{
    private int idStudent;

    public Student() {
        super("NumeStudent", 18);
        this.idStudent = 0;
    }

    public Student(String nume, int varsta, int idStudent) {
        super(nume, varsta);
        this.idStudent = idStudent;
    }

    public int getIdStudent() {
        return idStudent;
    }

    @Override
    public float calculareVenit() {
        return 0;
    }


}
