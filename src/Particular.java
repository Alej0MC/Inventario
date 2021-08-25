public class Particular extends Vehiculo {
    public Particular(int pas, int velo, String placa, String extra){
        super(pas, velo, placa, extra);
    }
    
    @Override
    public String mostrar(){
        System.out.println("\tVehículo Particular - Placa: " + this.placa);
        System.out.println("\tvelocidad: " + this.velo);
        System.out.println("\tpasajeros: " + this.pas);
        System.out.println("\tcolor: " + this.extra);
        return null;
    }
}
