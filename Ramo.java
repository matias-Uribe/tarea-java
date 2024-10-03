

import java.util.ArrayList;

public class Ramo extends Carta {
    public int creditos;
    public enum depto {Matematicas,Informatica,Humanista}; 
    private depto area;
    private ArrayList<Estudio>estudios=new ArrayList<>();
    
//constructor
    public Ramo( String nombre, String lore,String areae) {
        super(nombre, lore);
        this.nombre=nombre;
        this.lore = lore;
        if ("Humanista".equals(areae)){
            area=depto.Humanista;
            creditos=2;
        }
        else if ("Matematicas".equals(areae)){
            area=depto.Matematicas;
            creditos=7;
        }
        else if ("Informatica".equals(areae)){
            area=depto.Informatica;
            creditos=5;
        }
        else{
            System.out.print("ERROR REGISTRAR RAMO");
        }
        
    }
    //metodos
        public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
        
        
    
    public depto getArea() {
        return area;
    }
    
    
    @Override
    public void mostrar_carta(){
        System.out.println("Tipo:Ramo");
        System.out.println("nombre:"+getNombre());
        System.out.println("lore:"+getLore());
        System.out.println("creditos:"+getCreditos());
        System.out.println("AREA:"+getArea());
        System.out.println("--------------------------Lista Estudios del Ramo---------------------------------------");
        for(int i=0; i<estudios.size(); i++){
            estudios.get(i).mostrar_carta();
        }
        System.out.println("----------------------Fin Lista Estudios del Ramo----------------------------------");
    }
    
    public double calcularNota(Tablero tablero){
        double nf =0;
        for(int i=0;i<estudios.size()-1;){
            Estudio aux =estudios.get(i);
            int flag=0;
            if(area.toString().equals(aux.getArea())){
                flag=1;
                
            }
            if (flag==1){
                nf=nf+aux.calcularBonus(tablero)*1.25;
            }
            if (flag==0){
                nf=nf+aux.calcularBonus(tablero);
            }
            i++;
        }
        nf=nf-(2*getCreditos());
        return nf;
        
        
    }
    public void anadirEstudio(Estudio estudio){
        estudios.add(estudio);
    }
    
}
