
import java.util.concurrent.TimeUnit;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon
 */
public class HiloMovimiento extends Thread{
    
    JLabel _pieza;
    int _posicionActual;
    int _destino;
    
    @Override
    public void run(){
        MoverPieza(_pieza, _posicionActual, _destino);
    }
    
    public void MoverPieza(JLabel pieza, int posicionActual, int destino){
        try{
            if (destino < posicionActual){

                for (int i = posicionActual+1; i<= 40; i++){
                    TimeUnit.MILLISECONDS.sleep(250);
                    ActualizarPosicionPieza(pieza, i);
                }

                for (int i = 0; i <= destino; i++){
                    TimeUnit.MILLISECONDS.sleep(250);
                    ActualizarPosicionPieza(pieza, i);
                }
            } else{
                for (int i = posicionActual+1; i<= destino; i++){
                    TimeUnit.MILLISECONDS.sleep(250);
                    ActualizarPosicionPieza(pieza, i);
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public void ActualizarPosicionPieza(JLabel pieza, int posicion){
        switch(posicion) {
                case 0 :
                   pieza.setLocation(760, 770);
                   break; // optional

                case 1 :
                    pieza.setLocation(670, 770);
                   break; // optional
                   
                case 2 :
                    pieza.setLocation(600, 770);
                   break; // optional
                   
                case 3 :
                    pieza.setLocation(530, 770);
                   break; // optional
                   
                case 4 :
                    pieza.setLocation(460, 770);
                   break; // optional
                
                case 5 :
                    pieza.setLocation(390, 770);
                   break; // optional
                  
                case 6 :
                    pieza.setLocation(320, 770);
                   break; // optional
                   
                case 7 :
                    pieza.setLocation(250, 770);
                   break; // optional
                  
                case 8 :
                    pieza.setLocation(180, 770);
                   break; // optional
                   
                case 9 :
                    pieza.setLocation(110, 770);
                   break; // optional
                   
                case 10 :
                    pieza.setLocation(-10, 810);
                   break; // optional
                   
                case 11 :
                    pieza.setLocation(10, 680);
                   break; // optional
                   
                case 12 :
                    pieza.setLocation(10, 610);
                   break; // optional
                   
                case 13 :
                    pieza.setLocation(10, 540);
                   break; // optional
                   
                case 14 :
                    pieza.setLocation(10, 470);
                   break; // optional
                   
                case 15 :
                    pieza.setLocation(10, 400);
                   break; // optional
                   
                case 16 :
                    pieza.setLocation(10, 330);
                   break; // optional
                   
                case 17 :
                    pieza.setLocation(10, 260);
                   break; // optional
                   
                case 18 :
                    pieza.setLocation(10, 190);
                   break; // optional
                   
                case 19 :
                    pieza.setLocation(10, 120);
                   break; // optional
                   
                case 20 :
                    pieza.setLocation(20, 30);
                   break; // optional
                   
                case 21 :
                    pieza.setLocation(110, 20);
                   break; // optional
                   
                case 22 :
                    pieza.setLocation(180, 20);
                   break; // optional
                   
                case 23 :
                    pieza.setLocation(250, 20);
                   break; // optional
                   
                case 24 :
                    pieza.setLocation(320, 20);
                   break; // optional
                   
                case 25 :
                    pieza.setLocation(390, 20);
                   break; // optional
                   
                case 26 :
                    pieza.setLocation(460, 20);
                   break; // optional
                   
                case 27 :
                    pieza.setLocation(530, 20);
                   break; // optional
                   
                case 28 :
                    pieza.setLocation(600, 20);
                   break; // optional   

                case 29 :
                    pieza.setLocation(670, 20);
                   break; // optional
                   
                case 30 :
                    pieza.setLocation(760, 30);
                   break; // optional
                   
                case 31 :
                    pieza.setLocation(770, 130);
                   break; // optional
                   
                case 32 :
                    pieza.setLocation(770, 200);
                   break; // optional
                   
                case 33 :
                    pieza.setLocation(770, 270);
                   break; // optional
                     
                case 34 :
                    pieza.setLocation(770, 340);
                   break; // optional
                   
                case 35 :
                    pieza.setLocation(770, 410);
                   break; // optional
                   
                case 36 :
                    pieza.setLocation(770, 480);
                   break; // optional

                case 37 :
                    pieza.setLocation(770, 550);
                   break; // optional
                  
                case 38 :
                    pieza.setLocation(770, 620);
                   break; // optional
                   
                case 39 :
                    pieza.setLocation(770, 690);
                   break; // optional
                   
                case 40 :
                    pieza.setLocation(40, 760);
                   break; // optional

                default : // Optional
                   // Statements
             }
    }

    public void setPieza(JLabel _pieza) {
        this._pieza = _pieza;
    }

    public void setPosicionActual(int _posicionActual) {
        this._posicionActual = _posicionActual;
    }

    public void setDestino(int _destino) {
        this._destino = _destino;
    }
 
    
    
}
