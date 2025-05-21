package model8_composite.model;

import java.util.ArrayList;
import java.util.List;

public class CppClass implements Code, CodeComposite{
    private String name;
    private List<Code> membri = new ArrayList<>();

    public CppClass(String name) {
        this.name = name;
    }

    @Override
    public boolean containsUnsafeCalls() {
        return false;
    }

    @Override
    public void parcurge() throws Exception {
        System.out.println("Parsing class: " + name);
        for(Code nod : membri){
            if(nod instanceof CodeComposite compozit){
                compozit.parcurge();
            }else if( nod instanceof CppFunction f){
                f.parcurge();
            }
        }
    }

    @Override
    public void adaugaNod(Code nod) throws Exception {
        membri.add(nod);
    }

    @Override
    public void stergeNod(Code nod) throws Exception {
        membri.remove(nod);
    }

    @Override
    public Code getNodCopil(int index) throws Exception {
        return membri.get(index);
    }
}
