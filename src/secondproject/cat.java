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
public class cat {
    String name;
    String poroda;
    String mast;
    int age;
    
    public void eat(){
        System.out.println("Cat likes to eat mouse");
    }
    
    public void sleep(){
        System.out.println("Cat is sleep");
    }
    public String speak(String sp){
        return "Cat speaks " + sp;
    }
    
}
