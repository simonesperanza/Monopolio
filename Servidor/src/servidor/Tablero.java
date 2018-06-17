package servidor;

import java.util.ArrayList;

/**
 *
 * @author simon
 */
public class Tablero {

    private ArrayList<Casilla> tablero = new ArrayList();
    
    public Tablero(){
        iniciarTablero();
    }

    public ArrayList<Casilla> getTablero() {
        return tablero;
    }
    
    private void iniciarTablero(){

        Casilla c0 = new Casilla(0, 0, 0, 0, 0, 0, 0, "Go", 0, 0, 0);
        tablero.add(c0);
        
        Casilla c1 = new Casilla(0, 60, 50, 50, 2, 90, 250, "Solar", 3, 0, 0);
        tablero.add(c1);
        
        Casilla c2 = new Casilla(0, 0, 0, 0, 0, 0, 0, "Arca", 0, 0, 0);
        tablero.add(c2);
        
        Casilla c3 = new Casilla(0, 60, 50, 50, 4, 180, 450, "Solar", 1, 0, 0);
        tablero.add(c3);
        
        Casilla c4 = new Casilla(0, 0, 0, 0, 200, 0, 0, "Impuesto", 0, 0, 0);
        tablero.add(c4);
        
        Casilla c5 = new Casilla(0, 200, 0, 0, 200, 0, 0, "Ferrocarril", 0, 0, 0);
        tablero.add(c5);
        
        Casilla c6 = new Casilla(0, 100, 50, 50, 6, 270, 550, "Solar", 8, 9, 0);
        tablero.add(c6);
        
        Casilla c7 = new Casilla(0, 0, 0, 0, 0, 0, 0, "Casualidad", 0, 0, 0);
        tablero.add(c7);
        
        Casilla c8 = new Casilla(0, 100, 50, 50, 6, 270, 550, "Solar", 6, 9, 0);
        tablero.add(c8);
        
        Casilla c9 = new Casilla(0, 120, 50, 50, 8, 300, 600, "Solar", 6, 7, 0);
        tablero.add(c9);
        
        Casilla c10 = new Casilla(0, 0, 0, 0, 0, 0, 0, "Carcel", 0, 0, 0);
        tablero.add(c10);
        
        Casilla c11 = new Casilla(0, 140, 100, 100, 10, 450, 750, "Solar", 13, 14, 0);
        tablero.add(c11);
        
        Casilla c12 = new Casilla(0, 150, 0, 0, 50, 0, 0, "Servicio", 28, 0, 0); //Luz
        tablero.add(c12);
        
        Casilla c13 = new Casilla(0, 140, 100, 100, 10, 450, 750, "Solar", 11, 14, 0);
        tablero.add(c13);
        
        Casilla c14 = new Casilla(0, 160, 100, 100, 10, 500, 900, "Solar", 11, 13, 0);
        tablero.add(c14);
        
        Casilla c15 = new Casilla(0, 200, 0, 0, 200, 0, 0, "Ferrocarril", 0, 0, 0);
        tablero.add(c15);
        
        Casilla c16 = new Casilla(0, 180, 100, 100, 15, 550, 950, "Solar", 18, 19, 0);
        tablero.add(c16);
        
        Casilla c17 = new Casilla(0, 0, 0, 0, 0, 0, 0, "Arca", 0, 0, 0);
        tablero.add(c17);
        
        Casilla c18 = new Casilla(0, 180, 100, 100, 15, 550, 950, "Solar", 16, 19, 0);
        tablero.add(c18);
        
        Casilla c19 = new Casilla(0, 200, 100, 100, 15, 600, 1000, "Solar", 16, 18, 0);
        tablero.add(c19);
        
        Casilla c20 = new Casilla(0, 0, 0, 0, 0, 0, 0, "Parada_Libre", 0, 0, 0);
        tablero.add(c20);
        
        Casilla c21 = new Casilla(0, 220, 150, 150, 20, 700, 1050, "Solar", 23, 24, 0);
        tablero.add(c21);
        
        Casilla c22 = new Casilla(0, 0, 0, 0, 0, 0, 0, "Casualidad", 0, 0, 0);
        tablero.add(c22);
        
        Casilla c23 = new Casilla(0, 220, 150, 150, 20, 700, 1050, "Solar", 21, 24, 0);
        tablero.add(c23);
        
        Casilla c24 = new Casilla(0, 240, 150, 150, 20, 750, 1100, "Solar", 21, 23, 0);
        tablero.add(c24);
        
        Casilla c25 = new Casilla(0, 200, 0, 0, 200, 0, 0, "Ferrocarril", 0, 0, 0);
        tablero.add(c25);
        
        Casilla c26 = new Casilla(0, 260, 150, 150, 25, 800, 1150, "Solar", 27, 29, 0);
        tablero.add(c26);
        
        Casilla c27 = new Casilla(0, 260, 150, 150, 25, 800, 1150, "Solar", 26, 29, 0);
        tablero.add(c27);
        
        Casilla c28 = new Casilla(0, 150, 0, 0, 120, 0, 0, "Servicio", 28, 0, 0); //Agua
        tablero.add(c28);
        
        Casilla c29 = new Casilla(0, 280, 150, 150, 25, 850, 1200, "Solar", 26, 27, 0);
        tablero.add(c29);
        
        Casilla c30 = new Casilla(0, 0, 0, 0, 0, 0, 0, "Vaya_A_Carcel", 0, 0, 0);
        tablero.add(c30);
        
        Casilla c31 = new Casilla(0, 300, 200, 200, 30, 900, 1275, "Solar", 32, 34, 0);
        tablero.add(c31);
        
        Casilla c32 = new Casilla(0, 300, 200, 200, 30, 900, 1275, "Solar", 31, 34, 0);
        tablero.add(c32);
        
        Casilla c33 = new Casilla(0, 0, 0, 0, 0, 0, 0, "Arca", 0, 0, 0);
        tablero.add(c33);
        
        Casilla c34 = new Casilla(0, 320, 200, 200, 30, 1000, 1400, "Solar", 31, 32, 0);
        tablero.add(c34);
        
        Casilla c35 = new Casilla(0, 200, 0, 0, 200, 0, 0, "Ferrocarril", 0, 0, 0);
        tablero.add(c35);
        
        Casilla c36 = new Casilla(0, 0, 0, 0, 0, 0, 0, "Casualidad", 0, 0, 0);
        tablero.add(c36);
        
        Casilla c37 = new Casilla(0, 350, 200, 200, 35, 1100, 1500, "Solar", 39, 0, 0);
        tablero.add(c37);
        
        Casilla c38 = new Casilla(0, 0, 0, 0, 75, 0, 0, "Impuesto", 0, 0, 0);
        tablero.add(c38);
        
        Casilla c39 = new Casilla(0, 400, 200, 200, 50, 1400, 2000, "Solar", 37, 0, 0);
        tablero.add(c39);
        
    }


}
