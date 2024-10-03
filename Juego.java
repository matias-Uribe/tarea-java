

import java.util.Scanner;

public class Juego {

    private Mazo mazoCarrera;
    private Mazo mazoUniversitario;
    private Tablero tablero;
    private int aprovados;
    private int reprobados;
    private Mano mano;

    public Juego() {
        this.mazoCarrera = new Mazo();
        this.mazoUniversitario = new Mazo();
        this.tablero = new Tablero();
        this.aprovados = 0;
        this.reprobados = 0;
        this.mano = new Mano();
    }

    public Mazo getMazoCarrera() {
        return mazoCarrera;
    }

    public Mazo getMazoUni() {
        return mazoUniversitario;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public int getAprovados() {
        return aprovados;
    }

    public int getReprobados() {
        return reprobados;
    }

    public Mano getMano() {
        return mano;
    }

    public void setMazoCarrera(Mazo mazoCarrera) {
        this.mazoCarrera = mazoCarrera;
    }

    public void setMazoUni(Mazo mazoUniversitario) {
        this.mazoUniversitario = mazoUniversitario;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public void setAprovados() {
        aprovados = aprovados+1;
    }

    public void setReprobados() {
        reprobados = reprobados+1;
    }

    public void setMano(Mano mano) {
        this.mano = mano;
    }

    public Mazo crearMazoCarrera() {
        Ramo carta1 = new Ramo("MAT-021", "Certamen Global", "Matematicas");
        mazoCarrera.putBack(carta1);
        Ramo carta2 = new Ramo("MAT-022", "Certamen Global", "Matematicas");
        mazoCarrera.putBack(carta2);
        Ramo carta3 = new Ramo("MAT-023", "Certamen Global", "Matematicas");
        mazoCarrera.putBack(carta3);
        Ramo carta4 = new Ramo("MAT-024", "Certamen Global", "Matematicas");
        mazoCarrera.putBack(carta4);
        Ramo carta5 = new Ramo("HRW-133", "Etica y Argumentacion Critica", "Humanista");
        mazoCarrera.putBack(carta5);
        Ramo carta6 = new Ramo("HRW-132", "Sociedad y PoliticaContemporanea", "Humanista");
        mazoCarrera.putBack(carta6);
        Ramo carta7 = new Ramo("IWI-131", "Programacion Aguante ¡¡MEZA!!", "Informatica");
        mazoCarrera.putBack(carta7);
        Ramo carta8 = new Ramo("INF-134", "Estructura de Datos", "Informatica");
        mazoCarrera.putBack(carta8);
        Ramo carta9 = new Ramo("INF-152", "Estructuras Discretas", "Informatica");
        mazoCarrera.putBack(carta9);
        Ramo carta10 = new Ramo("INF-253", "Lenguajes de Programacion ", "Informatica");
        mazoCarrera.putBack(carta10);
        mazoCarrera.shuflle2();
        return mazoCarrera;

    }

    public Mazo crearMazoUni() {
        Estudio carta1 = new Estudio(2, "*Ir a todas las Clases* ", "Es muy util", "Matematicas");
        mazoUniversitario.putBack(carta1);
        Estudio carta2 = new Estudio(2, "*Llegar puntual*", "Lo mas complicado", "Matematicas");
        mazoUniversitario.putBack(carta2);
        Estudio carta3 = new Estudio(2, "*llegar con un cafecito*", "10/10", "Matematicas");
        mazoUniversitario.putBack(carta3);
        Estudio carta4 = new Estudio(2, "*Leer los libros*", "Bastante util", "Humanista");
        mazoUniversitario.putBack(carta4);
        Estudio carta5 = new Estudio(2, "*Participar en clase*", "sin miedo", "Humanista");
        mazoUniversitario.putBack(carta5);
        Estudio carta6 = new Estudio(2, "*Tomar apuntes*", "Lettering", "Humanista");
        mazoUniversitario.putBack(carta6);
        Estudio carta7 = new Estudio(2, "*Ir a las ayudantias*", "entrete", "Informatica");
        mazoUniversitario.putBack(carta7);
        Estudio carta8 = new Estudio(2, "*Tener un buen pc*", "armarse uno", "Informatica");
        mazoUniversitario.putBack(carta8);
        Estudio carta9 = new Estudio(2, "*Vivir en cerrito*", "Universirap", "Informatica");
        mazoUniversitario.putBack(carta9);
        Estudio carta10 = new Estudio(2, "*Vivir en sala Pasta*", "Jugar Smash", "Informatica");
        mazoUniversitario.putBack(carta10);
        
        Estudio carta11 = new Estudio(3, "**Ir a todas las Clases** ", "Es muy util", "Matematicas");
        mazoUniversitario.putBack(carta11);
        Estudio carta12 = new Estudio(3, "**Llegar puntual**", "Lo mas complicado", "Matematicas");
        mazoUniversitario.putBack(carta12);
        Estudio carta13 = new Estudio(3, "**Llegar con una hamburgeza**", "20/10", "Humanista");
        mazoUniversitario.putBack(carta13);
        Estudio carta14 = new Estudio(3, "**Leer los libros**", "O ver todo Youtube", "Humanista");
        mazoUniversitario.putBack(carta14);
        Estudio carta15 = new Estudio(3, "**Participar en clase**", "sin miedo y con actitud", "Informatica");
        mazoUniversitario.putBack(carta15);
        Estudio carta16 = new Estudio(3, "**Tomar apuntes**", "Lettering", "Informatica");
        mazoUniversitario.putBack(carta16);
        Estudio carta17 = new Estudio(3, "**Ir a las ayudantias**", "Entrete", "Informatica");
        mazoUniversitario.putBack(carta17);
        
        Estudio carta18 = new Estudio(4, "***Aprender Wolfram***", "Es la mano ", "Matematicas");
        mazoUniversitario.putBack(carta18);
        Estudio carta19 = new Estudio(4, "***Vivir en Biblioteca***", "Una rata", "Humanista");
        mazoUniversitario.putBack(carta19);
        Estudio carta20 = new Estudio(4, "***Leer Toda Documentacion ***", "Para lograr hacer un MAKEFILE", "Informatica");
        mazoUniversitario.putBack(carta20);
        
        
        Evento carta21 = new Evento("Boton de Panico", "Devuelve el ramo al mazo","RAV", "Informatica");
        mazoUniversitario.putBack(carta21);
        Evento carta22 = new Evento("El Azar de la vida","Que la suerte este siempre de su lado", "Cambio", "Informatica");
        mazoUniversitario.putBack(carta22);
        Evento carta23 = new Evento("Buff Matematico","aumenta un 25%", "Buff", "Matematicas");
        mazoUniversitario.putBack(carta23);
        Evento carta24 = new Evento("Buff Humanistico","aumenta un 25%", "Buff", "Humanista");
        mazoUniversitario.putBack(carta24);
        Evento carta25 = new Evento("Buff Informatico","aumenta un 25%", "Buff", "Informatica");
        mazoUniversitario.putBack(carta25);
        
        
        mazoUniversitario.shuflle2();
        return mazoUniversitario;
    }

    public void iniciarTurno(Tablero miTablero, Mazo mazocarrera, Mazo mazouni, Mano mano, Juego juego) {
        miTablero.iniciarTurno();
        miTablero.agregarRamo((Ramo) mazocarrera.draw());
        miTablero.agregarRamo((Ramo) mazocarrera.draw());
        //miTablero.mostrarTablero();
        juego.llenarMano(mano, mazouni);

    }

    public void llenarMano(Mano mano, Mazo mazo) {
        while (mano.getCartas().size() < 6) {
            mano.anadirCarta(mazo.draw());
            System.out.println("Has sacado una carta");

        }

        //return mano;
    }

    public static void main(String[] args) {
        Juego miJuego = new Juego();
        Mano miMano = new Mano();
        miJuego.setMazoCarrera(miJuego.crearMazoCarrera());
        miJuego.setMazoUni(miJuego.crearMazoUni());
        Tablero miTablero = new Tablero();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Evento cartaSeleccionadaEvento;
        int number;
        
        //turno
        while (miJuego.getAprovados()<5 && miJuego.getReprobados()<2) {
            number = 1;
            int valor;
            int i = 0;
            miJuego.iniciarTurno(miTablero, miJuego.getMazoCarrera(), miJuego.getMazoUni(), miMano, miJuego);
            //elecciones
            while (number != 0) {
                //System.out.println("Horas Disponibles " + miTablero.getHorasDisponibles());
                miTablero.mostrarTablero();
                miMano.mostrarMano();
                i++;
                System.out.println("Que Carta quiere seleccionar: ");
                do {
                    System.out.println("Por favor ingrese un valor valido");
                    while (!sc.hasNextInt()) {
                        System.out.println("Por favor ingrese un numero valido--");
                        sc.next();
                    }
                    number = sc.nextInt();
                } while (number > miMano.getCartas().size() || number<0);
                if (number == 0) {
                    System.out.println("Has finalizado el turno");
                    break;
                }
                System.out.println("Has elegido la carta de tu mano : " + number);

                if (Evento.class == miMano.getCartas().get((number - 1)).getClass()) {
                    cartaSeleccionadaEvento = (Evento) miMano.seleccionarCarta(number);
                    cartaSeleccionadaEvento.aplicarEvento(miTablero, miJuego.mazoCarrera, miMano);
                    miMano.getCartas().remove(number - 1);
                } else {

                    do {
                        System.out.println("Por favor ingrese el numero del ramo ");
                        while (!sc2.hasNextInt()) {
                            System.out.println("Por favor ingrese un numero valido");
                            sc2.next();
                        }
                        valor = sc2.nextInt();
                    } while (valor != 1 && valor != 2);
                    System.out.println("Has elegido la carta Ramo: " + valor);
                    if (miTablero.jugarEstudio((Estudio) miMano.seleccionarCarta(number), (valor)) == 1) {
                        miMano.getCartas().remove(number - 1);
                    }

                }

                System.out.println("Fin eleccion numero: " + i);
                System.out.println("");
            }
            
            for (int i2=0;i2<=miTablero.semestre.size()-1;){
                if (miTablero.semestre.get(i2).calcularNota(miTablero)>55){
                    miJuego.setAprovados();
                    
                }
                else{
                    miJuego.setReprobados();
                    
                }
                i2++;

            }
            System.out.println("Ramos Aprovados " + miJuego.getAprovados());
            System.out.println("Ramos Reprovados " + miJuego.getReprobados());
            System.out.println("");
            System.out.println("");
            System.out.println("");
            
        }
        if (miJuego.getAprovados()==5){
            System.out.println("GANASTE,PASASTE LOS 5 RAMOS");
        }
        else{
            System.out.println("PERDISTE REPROBASTE 2 RAMOS");
        }
        
        

    }
}
