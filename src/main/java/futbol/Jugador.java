package futbol;

public class Jugador extends Futbolista {
    public short golesMarcados;
    public byte dorsal;
    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal){
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }
    public Jugador(){
        super();
        this.golesMarcados = 289;
        this.dorsal = 7;
    }
    public int compareTo(Futbolista f) {
        if (this.getEdad() -f.getEdad()<0){
            return (this.getEdad() -f.getEdad())*-1;
        }
        return this.getEdad() - f.getEdad();

    }
    public boolean jugarConLasManos() {
        return false;
    }
    @Override
    public String toString() {
        return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados;
    }
}
