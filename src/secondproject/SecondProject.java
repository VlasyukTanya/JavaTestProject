/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondproject;
//import... подключение библиотек 
/**
 *
 * @author Student
 */
public class SecondProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        myClass my = new myClass();
        my.id = 1;
        my.Name = "Vasya";
        my.foto = "";
        
        my.Name = "Kolya";
        my.Name = "Vova";
        
        //System.out.println(my.LOG.toString());
        
        System.out.println(my.toString());
        int[] mas = new int[10];
        for(int i=0; i<10; i++){
            mas[i] = i;
            System.out.println(i);
        }
    }
    
}
