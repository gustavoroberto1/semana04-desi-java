package seman04.desi.java;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Seman04DesiJava {

    public static void main(String[] args) {
        listasArrays();
    }
    
    public static void listasArrays(){
         ArrayList alunos = new ArrayList(); 
       alunos.add("PEDRINH");
       alunos.add(100);
       alunos.add(true);
       alunos.add("Gustavo"); 
       alunos.remove("Gustavo");
       alunos.remove(2);
       alunos.contains(2123);
       alunos.size();
       alunos.get(1);
       
       ArrayList<String> frutas = new ArrayList<>();
       String fruta = JOptionPane.showInputDialog("INFORME A FRUTA");
       frutas.add(fruta);
       fruta = JOptionPane.showInputDialog("INFORME A FRUTA");
       frutas.add(fruta);
       
       for(int i = 0; i < frutas.size(); i++){
           System.out.println(frutas.get(i));
       }
       
       for(String fruit: frutas){
           System.out.println(fruit);
       }
       
       frutas.forEach((item) -> {
           System.out.println(item);
       });
       
       System.out.println(frutas);
    }
    
}
