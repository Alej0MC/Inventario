public class Comercial extends Vehiculo {
    public Comercial(int pas, int velo, String placa, String extra){
        super(pas, velo, placa, extra);
    }
    
    @Override
    public String mostrar(){
        System.out.println("\tVehiculo Particular - Placa: " + this.placa);
        System.out.println("\tvelocidad: " + this.velo);
        System.out.println("\tpasajeros: " + this.pas);
        System.out.println("\tCarga máxima: " + this.extra);
        return null;
    }
}
