
import java.util.ArrayList;


public class Mano {
    //static ArraList<Carta> carta =new ArrayList();
    private ArrayList<Carta>cartas;

    public Mano() {
        this.cartas =new ArrayList<Carta>();
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }


    public void anadirCarta(Carta carta){
        cartas.add(carta);
    }
    
    public void mostrarMano(){
        System.out.println("---------------su manos es -------------------");
        for(int i=0; i<cartas.size(); i++){
            System.out.println("---------------------" + (i+1) + "------------------------");
            cartas.get(i).mostrar_carta();
            System.out.println("--------------------------------------------------------");
                    
        }   
    }
    
    public Carta seleccionarCarta(int pos){
        Carta aux=cartas.get(pos-1);
        return aux;
        
        
                    
        } 
    
    
    
}
