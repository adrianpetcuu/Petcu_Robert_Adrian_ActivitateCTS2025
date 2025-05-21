package model8_composite.model;

public class CppFunction implements Code, CodeComposite{
    private String name;
    private String body;

    public CppFunction(String name, String body) {
        this.name = name;
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public String getBody() {
        return body;
    }

    @Override
    public boolean containsUnsafeCalls() {
        return body.contains("gets(") || body.contains("strcpy(");
    }

    @Override
    public void parcurge() {
        System.out.println("Parsing function: " + name);
        if(containsUnsafeCalls()){
            System.out.println("-> Unsage call detected in function: " + name);
        }
    }

    @Override
    public void adaugaNod(Code nod) throws Exception{
        throw new Exception("Nu este implementata");
    }

    @Override
    public void stergeNod(Code nod) throws Exception{
        throw new Exception("Nu este implementata");
    }

    @Override
    public Code getNodCopil(int index) throws Exception{
        throw new Exception("Nu este implementata");
    }
}
