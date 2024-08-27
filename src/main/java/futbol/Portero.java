package futbol;

public class Portero extends Futbolista {
    public short golesRecibidos;
    public byte dorsal;
    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal){
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }
    public Portero(){
        super();
        this.golesRecibidos = 0;
        this.dorsal = 1;
    }
    public int compareTo(Futbolista f) {
       if(this.golesRecibidos - ((Portero)f).golesRecibidos < 0){
           return (this.golesRecibidos - ((Portero)f).golesRecibidos)*-1;
       }
       return this.golesRecibidos - ((Portero)f).golesRecibidos;
    }
    public boolean jugarConLasManos() {
        return true;
    }
    @Override
    public String toString() {
        return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;
    }
}
