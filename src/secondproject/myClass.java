/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondproject;

import java.util.logging.Logger;

/**
 *
 * @author Student
 */
//если класс final, то он не наследуется
public final class myClass {

    private static final Logger LOG = Logger.getLogger(myClass.class.getName());

    int id;
    String Name;
    String foto;
    final String SURNAME = "Pupkin"; //константа
    
    public void myClass(int _id, String _name, String _foto){
        id = _id;
        Name = _name;
        foto = _foto;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getFoto() {
        return foto;
    }
    
    public String toString(){
        return (id+" "+Name+""+foto);
    }
    
    
}
