

import java.util.ArrayList;

public class Tablero {
    public ArrayList<Ramo>semestre;
    private int horasDisponibles;
    private boolean eventoM;
    private boolean eventoH;
    private boolean eventoI;

    public Tablero() {
        this.semestre = new ArrayList<Ramo>() ;
        this.horasDisponibles = 12;
        this.eventoM = false;
        this.eventoH = false;
        this.eventoI = false;
    }
    


    
    public int getHorasDisponibles() {
        return horasDisponibles;
    }

    public void setSemestre(ArrayList<Ramo> semestre) {
        this.semestre = semestre;
    }

    public void setHorasDisponibles(int horasDisponibles) {
        this.horasDisponibles = horasDisponibles;
    }

    public boolean isEventoM() {
        return eventoM;
    }

    public boolean isEventoH() {
        return eventoH;
    }

    public boolean isEventoI() {
        return eventoI;
    }

    public void setEventoM(boolean eventoM) {
        this.eventoM = eventoM;
    }

    public void setEventoH(boolean eventoH) {
        this.eventoH = eventoH;
    }

    public void setEventoI(boolean eventoI) {
        this.eventoI = eventoI;
    }
    
    
    
    
    
    public void agregarRamo(Ramo ramo){
        semestre.add(ramo);
    }
    
    public void iniciarTurno(){
        semestre.clear();
        horasDisponibles=12;
    }

    public ArrayList<Ramo> getSemestre() {
        return semestre;
    }
    
    
    
    
    public int jugarEstudio(Estudio estudio,int pos){
        Ramo auxramo =semestre.get(pos-1);
        System.out.print("has seleccionado el ramo " + auxramo.getNombre() + " y el estudio "+ estudio.getNombre());
        if(horasDisponibles>=estudio.getHoras()){
            horasDisponibles=horasDisponibles-estudio.getHoras();
            auxramo.anadirEstudio(estudio);
            System.out.println("se han descontado: " + estudio.getHoras() + " horas");
            return 1;
        }
        else{
            System.out.println("no puedes jugar esta carta, no hay horas suficientes ");
            return 0;
        }
        }
        
    public void mostrarTablero(){
        System.out.println("---------------------Tablero------------------------");
        System.out.println("sus horas disponibles son: " + getHorasDisponibles());
        System.out.println("-----------------------------------------------------");
        for(int i=0; i<getSemestre().size(); i++){
            getSemestre().get(i).mostrar_carta();
            
        }
        System.out.println("----------------------Fin Tablero----------------------------------");
    }
    
}
