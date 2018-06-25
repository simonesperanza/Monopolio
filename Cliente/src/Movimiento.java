/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eavv1
 */
public class Movimiento {
    
private int posicion = 0;    
private Tablero tablero; 
private int distanciaMovida = 0;
    
    
    public void mover(int distancia)
	{
		Espacio ultimoEspacio = tablero.getEspacio(getPosicion());
		cambiarPosicion(distancia);
		Espacio espacioAterrizaje = tablero.getEspacio(getPosicion());
                
                System.out.println("Desde \"" + ultimoEspacio.getNombre() + "\" hacia \"" + espacioAterrizaje.getNombre() + "\".");
	}

    public int getPosicion()
	{
		return posicion;
    }
    
    public void setPosicion(int posicion)
	{
		this.posicion = posicion;
    }
    
    public void cambiarPosicion(int cantidad)
	{
		distanciaMovida += Math.abs(cantidad);
		this.posicion += cantidad;
		
		if (this.posicion >= 40)
		{
			this.posicion -= 40;
		}
		//
		else if (this.posicion < 0)
			this.posicion += 40;
    }
 
    public Tablero getTablero()
	{
		return tablero;
    }
	
    public void setTablero(Tablero tablero)
	{
		this.tablero = tablero;
    }    
    
    public Espacio getEspacioActual()
	{
		return tablero.getEspacio(getPosicion());
    }

    public void avanzarA(int posicion)
	{
		mover(this.getEspacioActual().distanciaA(posicion));
    }
	
    public void avanzarA(Espacio espacio)
	{
		avanzarA(espacio.getPosicion());
    }    

    public int getDistanciaMovida()
	{
		return distanciaMovida;
    }
	
    public void setDistanciaMovida(int distanciaMovida)
	{
		this.distanciaMovida = distanciaMovida;
    }
	
    public void addDistanciaMovida(int distanciaMovida)
	{
		this.distanciaMovida += distanciaMovida;
    }    
}
