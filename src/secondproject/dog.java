/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondproject;

/**
 *
 * @author Student
 */
public class dog {
    String name;
    String poroda;
    String mast;
    int age;
    
    public void eat(){
        System.out.println("Dog likes to eat bones"); //bones - кости
    }
    
    public void sleep(){
        System.out.println("Dog is sleep");
    }
    public String speak(String sp){
        return "Dog speaks " + sp;
    }
}
