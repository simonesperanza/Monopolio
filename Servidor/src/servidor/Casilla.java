package servidor;

/**
 *
 * @author simon
 */
public class Casilla {
    
    // Numero del jugador que posee esta casilla (entre 1 y 4) si aplica.
    private int _dueño; //1
    private float _precio; //2
    private float _precioCasa; //3
    private float _precioHotel; //4
    private float _alquiler; //5
    private float _alquilerCasa; //6
    private float _alquilerHotel; //7
    
    // Solar - Ferrocarril - Servicio - Casualidad - Arca - Go - Impuesto
    // Carcel - Vaya_A_Carcel - Parada_Libre
    private String _tipo;
    
    private int _conjunto1;
    private int _conjunto2;
    private int _conjunto3;
    
    private boolean _casa;
    private boolean _hotel;
    
    public Casilla(int _dueño, int _precio, int _precioCasa, int _precioHotel,
            int _alquiler, int _alquilerCasa, int _alquilerHotel, String _tipo,
            int _conjunto1, int _conjunto2, int _conjunto3) {
        
        this._dueño = _dueño;
        this._precio = _precio;
        this._precioCasa = _precioCasa;
        this._precioHotel = _precioHotel;
        this._alquiler = _alquiler;
        this._alquilerCasa = _alquilerCasa;
        this._alquilerHotel = _alquilerHotel;
        this._tipo = _tipo;
        this._conjunto1 = _conjunto1;
        this._conjunto2 = _conjunto2;
        this._conjunto3 = _conjunto3;
        this._casa = false;
        this._hotel = false;
    }

    public boolean isCasa() {
        return _casa;
    }

    public void setCasa(boolean _casa) {
        this._casa = _casa;
    }

    public boolean isHotel() {
        return _hotel;
    }

    public void setHotel(boolean _hotel) {
        this._hotel = _hotel;
    }
    
    

    public int getDueño() {
        return _dueño;
    }

    public void setDueño(int _dueño) {
        this._dueño = _dueño;
    }

    public float getPrecio() {
        return _precio;
    }

    public void setPrecio(float _precio) {
        this._precio = _precio;
    }

    public float getPrecioCasa() {
        return _precioCasa;
    }

    public void setPrecioCasa(float _precioCasa) {
        this._precioCasa = _precioCasa;
    }

    public float getPrecioHotel() {
        return _precioHotel;
    }

    public void setPrecioHotel(float _precioHotel) {
        this._precioHotel = _precioHotel;
    }

    public float getAlquiler() {
        return _alquiler;
    }

    public void setAlquiler(float _alquiler) {
        this._alquiler = _alquiler;
    }

    public float getAlquilerCasa() {
        return _alquilerCasa;
    }

    public void setAlquilerCasa(float _alquilerCasa) {
        this._alquilerCasa = _alquilerCasa;
    }

    public float getAlquilerHotel() {
        return _alquilerHotel;
    }

    public void setAlquilerHotel(float _alquilerHotel) {
        this._alquilerHotel = _alquilerHotel;
    }

    public String getTipo() {
        return _tipo;
    }

    public void setTipo(String _tipo) {
        this._tipo = _tipo;
    }

    public int getConjunto1() {
        return _conjunto1;
    }

    public void setConjunto1(int _conjunto1) {
        this._conjunto1 = _conjunto1;
    }

    public int getConjunto2() {
        return _conjunto2;
    }

    public void setConjunto2(int _conjunto2) {
        this._conjunto2 = _conjunto2;
    }

    public int getConjunto3() {
        return _conjunto3;
    }

    public void setConjunto3(int _conjunto3) {
        this._conjunto3 = _conjunto3;
    }

    
    
    
    
    
    
    

    
}
