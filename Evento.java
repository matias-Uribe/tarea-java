

import java.util.ArrayList;
import java.util.Scanner;


public class Evento extends Carta {
    private enum tipo{RAV,Buff,Cambio}
    private tipo efecto;
    public enum depto {Matematicas,Informatica,Humanista}; 
    private depto area;
    //private area areacor;

    public Evento(String nombre, String lore,String efectoe,String areae) {
        super(nombre, lore);
        if ("Rav".equals(efectoe)){
            efecto=tipo.RAV;
        }
        if ("Buff".equals(efectoe)){
            efecto=tipo.Buff;
        }
        if ("Cambio".equals(efectoe)){
            efecto=tipo.Cambio;
        }
        
        if ("Humanista".equals(areae)){
            area=depto.Humanista;
        }
        else if ("Matematicas".equals(areae)){
            area=depto.Matematicas;
        }
        else if ("Informatica".equals(areae)){
            area=depto.Informatica;
        }
        else{
            System.out.print("ERROR REGISTRAR RAMO"+ nombre);
        }
    }

    public tipo getEfecto() {
        return efecto;
    }

    public String getArea() {
        return area.toString();
    }
    
    
    
    @Override
    public void mostrar_carta(){
        System.out.println("Tipo:Evento");
        System.out.println("nombre:"+getNombre());
        System.out.println("lore:"+getLore());
        System.out.println("Depto:"+getArea());
        
    }
    
   public void cambio(Tablero tablero){
        System.out.print("Ingrese que carta ramo desea hacer un cambio de coordinacion ");

       Scanner sc = new Scanner(System.in);
       int number;
       do {
           System.out.println("Por favor ingrese un valor positivo");
           while (!sc.hasNextInt()) {
               System.out.println("Por favor ingrese un numero valido");
               sc.next();
           }
           number = sc.nextInt();
       }
       while (number !=1 && number !=2 );
           System.out.println("Has elegido la ramo: " + number);
       
       ArrayList<Ramo>aux=tablero.getSemestre();
       Ramo aux2=aux.get(number-1);
       int azar=(int) Math.floor(Math.random()*3+1);
       int i=aux2.getCreditos();
       if (azar==1){
           aux2.setCreditos(i+3);
           System.out.println("se han agregado 3 creditos al ramo elejido");
       }
       if (azar==2){
           aux2.setCreditos(i-3);
           System.out.println("se han restado 3 creditos al ramo elejido");
       }
   }
   
   public void rav(Tablero tablero,Mazo mazoCarrera,Mano mano){
       
       System.out.print("Ingrese que carta ramo desea elegir y mesclar en el  mazo ");

       Scanner sc = new Scanner(System.in);
       int number;
       do {
           System.out.println("Por favor ingrese un valor positivo");
           while (!sc.hasNextInt()) {
               System.out.println("Por favor ingrese un numero valido");
               sc.next();
           }
           number = sc.nextInt();
       }
       while (number ==1 || number ==2 );
           System.out.println("Has elegido la ramo: " + number);
       
       for (int i =0; i<tablero.getSemestre().size();i++){
           mano.anadirCarta(tablero.getSemestre().get(i));
           System.out.println("has recuperado la carta: " + tablero.getSemestre().get(i).getNombre());
       }
       mazoCarrera.putBack(tablero.getSemestre().get(number-1));
       System.out.print("se ha agregado el ramo al mazo");
       mazoCarrera.shuflle2();
       System.out.print("se ha revuelto el mazo");
       tablero.getSemestre().remove(number-1);
       tablero.semestre.add((Ramo) mazoCarrera.draw());
       System.out.print("se ha actualizado el tablero");
       
       
       
   }
   public void buff(Tablero tablero){
       if( "Humanista".equals(getArea())){
            tablero.setEventoH(true);
        }
        if( "Informatica".equals(getArea())){
            tablero.setEventoI(true);
        }
        if( "Matematica".equals(getArea())){
            tablero.setEventoM(true);
        }
   }
    
    
    
    
    public void aplicarEvento(Tablero tablero,Mazo mazoCarrera,Mano mano){
        if (tipo.RAV==getEfecto()){
            rav(tablero,mazoCarrera,mano);
        }        
        if (tipo.Buff==getEfecto()){
            buff(tablero);
        }
        if (tipo.Cambio==getEfecto()){
            cambio(tablero);
        }
    }
}
