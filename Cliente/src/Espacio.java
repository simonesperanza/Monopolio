/**
 *
 * @author eavv1
 */
public class Espacio {
    
    private int posicion = 0;
	private String nombre = "";
	
	/**
	 * OBTIENE LA POSICION MEDIANTE UN INTEGER EN EL ESPACIO DEL TABLERO, ENTRE 0 Y 39
	 */
	public int getPosicion()
	{
		return posicion;
	}
	
	/**
	 * OBTIENE EL NOMBRE DEL ESPACIO
	 */
	public String getNombre()
	{
		return nombre;
	}	
	
	/**
	 * SETEA LA POSICION EN EL ESPACIO, ENTRE 0 Y 39
	 */
	public void setPosicion(int position)
	{
		this.posicion = position;
	}
	
	/**
	 * SETEA EL NOMBRE DEL ESPACIO
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	
	/**
	 * CALCULA LOS ESPACIOS POR DELANTE DE LA CASILLA DADA, RESPECTO DE LA POSICION ACTUAL
	 */
	public int distanciaA(int otraPosicion)
	{
		if (otraPosicion < posicion)
			otraPosicion += Tablero.CASILLA.length;
		
		return otraPosicion - posicion;
	}
	
	/**
	 * CALCULA LOS ESPACIOS POR DELANTE DE LA CASILLA DADA, RESPECTO DEL ESPACIO ACTUAL
	 */
	public int distanciaA(Espacio otroEspacio)
	{
		return distanciaA(otroEspacio.getPosicion());
	}
}

    
