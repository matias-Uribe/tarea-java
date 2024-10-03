


public abstract class Carta {
    protected String nombre;
    protected String lore;
    //static enum area {Matematicas,Informatica,Humanista};
    //static enum efecto{RAV,Buff,Cambio}
    public Carta(String nombre, String lore) {
        this.nombre = nombre;
        this.lore = lore;
    }

    public String getNombre(){
        return nombre;
    }
    public String getLore(){
        return lore;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }
    
   
    public abstract void mostrar_carta();
    
}
