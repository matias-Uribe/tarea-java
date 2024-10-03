

import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
    private ArrayList<Carta>cartas=new ArrayList<>();
    
    public Carta draw(){
        Carta aux=cartas.remove(0);
        return aux;
    }
    public void putBack(Carta carta){
        cartas.add(cartas.size(), carta);
    }
    public void shuflle(){
        int valorEntero = (int) Math.floor(Math.random()*((cartas.size()/2)-0+1)+0);
        for(int i=0;i<(cartas.size()/2);){
            Carta aux=cartas.get(i);
            cartas.add(i, cartas.get(i+valorEntero));
            cartas.add(i+valorEntero,aux);
        }
                  
    }
    
    public void shuflle2 (){
        Collections.shuffle(cartas);
    }
}
