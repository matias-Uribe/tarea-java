


public class Estudio extends Carta {
    private int horas;
    private int bonusMin;
    private int bonusMax;
    private enum depto {Matematicas,Informatica,Humanista};
    private depto area;


    public Estudio(int horas, String nombre, String lore,String areae) {
        super(nombre, lore);
        this.horas = horas;
        if(horas==2){
            bonusMin=18;
            bonusMax=26;
        }
        else if(horas==3){
            bonusMin=28;
            bonusMax=40;
        }
        else if(horas==4){
            bonusMin=20;
            bonusMax=90;
        }
        else{
            System.out.println("ERROR DE Horas");
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
            System.out.println("ERROR DE DEPTO");
        }
        
    }

    public int getHoras() {
        return horas;
    }

    public int getBonusMin() {
        return bonusMin;
    }

    public int getBonusMax() {
        return bonusMax;
    }

    public String getArea() {
        return area.toString();
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setBonusMax(int bonusMax) {
        this.bonusMax = bonusMax;
    }

    public void setArea(depto area) {
        this.area = area;
    }
    
    
    
    @Override
    public void mostrar_carta() {
        System.out.println("Tipo:Estudio");
        System.out.println("nombre:"+ getNombre());
        System.out.println("lore:"+ getLore());
        System.out.println("Area: "+getArea());
        System.out.println("horas:"+ getHoras());
        System.out.println("bonus min:"+ getBonusMin());
        System.out.println("bonus max:"+ getBonusMax());
        System.out.println("----------------------");
    }
    public int calcularBonus(Tablero tablero){
        if(tablero.isEventoH()&& "Humanista".equals(getArea())){
            setBonusMax((int)(getBonusMax()*1.25));
        }
        if(tablero.isEventoI()&& "Informatica".equals(getArea())){
            setBonusMax((int)(getBonusMax()*1.25));
        }
        if(tablero.isEventoM()&& "Matematica".equals(getArea())){
            setBonusMax((int)(getBonusMax()*1.25));
        }
        int valorEntero = (int) Math.floor(Math.random()*(getBonusMax()-getBonusMin()+1)+getBonusMin());
        System.out.println("valor:"+ valorEntero);
        System.out.println("bonus min:" + getBonusMin());
        System.out.println("bonus max:"+ getBonusMax());
        return valorEntero;
    }
}
