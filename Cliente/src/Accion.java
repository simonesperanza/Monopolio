
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
public class Accion {

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

    public void ActualizarPosicionCasa(JLabel Casa2, int casillaPos){
        /*
                PARA MOSTRAR CASA
                
                Necesitann modificarlo 
                No tiene color por jugador asignado y no crea piezas extra, necesita crear piezas extra y evaluar si se vende la casa/hotel
                Osea, seria crear un objeto tipo casa en estas coordenadas, las coordenas son las unicas que pueden tener. En casillas que sean posibles poner hotel/casa.
                Lo pense como que uno devuelve el mensaje de la casilla donde compro la casa/hotel
            */
            
            switch(casillaPos) {

                case 1 :
                    Casa2.setLocation(680, 740);
                   break; // optional
                   
                case 3 :
                    Casa2.setLocation(540, 740);
                   break; // optional
                  
                case 6 :
                    Casa2.setLocation(330, 740);
                   break; // optional
                  
                case 8 :
                    Casa2.setLocation(190, 740);
                   break; // optional
                   
                case 9 :
                    Casa2.setLocation(120, 740);
                   break; // optional
                   
                case 11 :
                    Casa2.setLocation(90, 680);
                   break; // optional
                   
                case 13 :
                    Casa2.setLocation(90, 540);
                   break; // optional
                   
                case 14 :
                    Casa2.setLocation(90, 470);
                   break; // optional
                   
                case 16 :
                    Casa2.setLocation(90, 330);
                   break; // optional
                   
                case 18 :
                    Casa2.setLocation(90, 190);
                   break; // optional
                   
                case 19 :
                    Casa2.setLocation(90, 120);
                   break; // optional
                   
                case 21 :
                    Casa2.setLocation(150, 90);
                   break; // optional
                   
                case 23 :
                    Casa2.setLocation(290, 90);
                   break; // optional
                   
                case 24 :
                    Casa2.setLocation(360, 90);
                   break; // optional
                   
                case 26 :
                    Casa2.setLocation(500, 90);
                   break; // optional
                   
                case 27 :
                    Casa2.setLocation(570, 90);
                   break; // optional  

                case 29 :
                    Casa2.setLocation(710, 90);
                   break; // optional
                   
                case 31 :
                    Casa2.setLocation(740, 150);
                   break; // optional
                   
                case 32 :
                    Casa2.setLocation(740, 220);
                   break; // optional
                     
                case 34 :
                    Casa2.setLocation(740, 360);
                   break; // optional

                case 37 :
                    Casa2.setLocation(740, 570);
                   break; // optional
                   
                case 39 :
                    Casa2.setLocation(740, 710);
                   break; // optional

                default : // Optional
                   // Statements
             }
    }
    
    public void ActualizarPosicionHotel(JLabel Casa1, int casillaPos){
        
            /*
                PARA MOSTRAR HOTEL
                
                Necesitann modificarlo 
                No tiene color por jugador asignado y no crea piezas extra, necesita crear piezas extra y evaluar si se vende la casa/hotel
                Osea, seria crear un objeto tipo casa en estas coordenadas, las coordenas son las unicas que pueden tener. En casillas que sean posibles poner hotel/casa.
                Lo pense como que uno devuelve el mensaje de la casilla donde compro la casa/hotel
            */
            
            switch(casillaPos) {

                case 1 :
                    Casa1.setLocation(700, 730);
                   break; // optional
                   
                case 3 :
                    Casa1.setLocation(560, 730);
                   break; // optional
                  
                case 6 :
                    Casa1.setLocation(350, 730);
                   break; // optional
                  
                case 8 :
                    Casa1.setLocation(210, 730);
                   break; // optional
                   
                case 9 :
                    Casa1.setLocation(140, 730);
                   break; // optional
                   
                case 11 :
                    Casa1.setLocation(90, 700);
                   break; // optional
                   
                case 13 :
                    Casa1.setLocation(90, 560);
                   break; // optional
                   
                case 14 :
                    Casa1.setLocation(90, 490);
                   break; // optional
                   
                case 16 :
                    Casa1.setLocation(90, 350);
                   break; // optional
                   
                case 18 :
                    Casa1.setLocation(90, 210);
                   break; // optional
                   
                case 19 :
                    Casa1.setLocation(90, 140);
                   break; // optional
                   
                case 21 :
                    Casa1.setLocation(120, 80);
                   break; // optional
                   
                case 23 :
                    Casa1.setLocation(260, 80);
                   break; // optional
                   
                case 24 :
                    Casa1.setLocation(330, 80);
                   break; // optional
                   
                case 26 :
                    Casa1.setLocation(470, 80);
                   break; // optional
                   
                case 27 :
                    Casa1.setLocation(540, 80);
                   break; // optional  

                case 29 :
                    Casa1.setLocation(680, 80);
                   break; // optional
                   
                case 31 :
                    Casa1.setLocation(740, 120);
                   break; // optional
                   
                case 32 :
                    Casa1.setLocation(740, 190);
                   break; // optional
                     
                case 34 :
                    Casa1.setLocation(740, 330);
                   break; // optional

                case 37 :
                    Casa1.setLocation(740, 540);
                   break; // optional
                   
                case 39 :
                    Casa1.setLocation(740, 680);
                   break; // optional

                default : // Optional
                   // Statements
             }
        
    }
}
