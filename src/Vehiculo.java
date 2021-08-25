public abstract class Vehiculo {
    public  int pas;
    public int velo;
    public String placa;
    public String extra;

    public Vehiculo(int pas, int velo, String placa, String extra) {
        this.pas = pas;
        this.velo = velo;
        this.placa = placa;
        this.extra = extra;
    }   

    public abstract String mostrar();
}
