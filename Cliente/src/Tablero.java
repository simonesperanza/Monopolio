/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eavv1
 */
public class Tablero {
    
    private static final String ESPACIO = "Espacio";
    
	public static String[][] CASILLA =
		{
			// CASILLAS DEL 0 AL 9
			/*0*/{"Go"},
			/*1*/{"Mediterranean Avenue"},
			/*2*/{"Community Chest"},
			/*3*/{"Baltic Avenue"},
			/*4*/{"Income Tax"},
			/*5*/{"Reading Railroad"},
			/*6*/{"Oriental Avenue"},
			/*7*/{ "Chance"},
			/*8*/{"Vermont Avenue"},
			/*9*/{"Connecticut Avenue"},
			// CASILLAS DEL 10 AL 19
			/*10*/{ "Jail / Just Visiting"},
			/*11*/{"St. Charles Place"},
			/*12*/{"Electric Company"},
			/*13*/{"States Avenue"},
			/*14*/{"Virginia Avenue"},
			/*15*/{"Pennsylvania Railroad"},
			/*16*/{"St. James Place"},
			/*17*/{"Community Chest"},
			/*18*/{"Tennessee Avenue"},
			/*19*/{"New York Avenue"},
			// CASILLAS DEL 20 AL 29
			/*20*/{"Free Parking"},
			/*21*/{"Kentucky Avenue"},
			/*22*/{"Chance"},
			/*23*/{"Indiana Avenue"},
			/*24*/{"Illinois Avenue"},
			/*25*/{"B&O Railroad"},
			/*26*/{"Atlantic Avenue"},
			/*27*/{"Ventnor Avenue"},
			/*28*/{"Water Works"},
			/*29*/{"Marvin Gardens"},
			// CASILLAS DEL 30 AL 39
			/*30*/{"Go To Jail"},
			/*31*/{"Pacific Avenue"},
			/*32*/{"North Carolina Avenue"},
			/*33*/{"Community Chest"},
			/*34*/{"Pennsylvania Avenue"},
			/*35*/{"Short Line"},
			/*36*/{"Chance"},
			/*37*/{"Park Place"},
			/*38*/{"Luxury Tax"},
			/*39*/{"Boardwalk"},
		};

	private Espacio[] espacios;
        
	public Tablero() throws ClassNotFoundException
	{
		//CARGA DE LOS ESPACIOS
		espacios = new Espacio[CASILLA.length];
		for (int i = 0; i < espacios.length; i++)
		{
			String[] espacio = CASILLA[i];
			String className = espacio[0];
			
			try
			{
				//INSTANCIA EN CLASE ESPECIFICA
				espacios[i] = (Espacio) Class.forName(ESPACIO + className).newInstance();
				
				//CADA ESPACIO TIENE UNA POSICION
				espacios[i].setPosicion(i);
				espacios[i].setNombre(espacio[1]);
				
			}
			catch(InstantiationException | IllegalAccessException e)
			{
				System.out.println("No se pudo instanciar la clase ...");
				e.printStackTrace();
				System.exit(1);
			}
		}
	}        
    
	public Espacio getEspacio(int i)
	{
		return this.espacios[i];
	}
	
        
}
