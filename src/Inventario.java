import java.util.Scanner;
import java.util.Vector;

public class Inventario {
    public static Vector procesarComandos(String comando){
        Vector variables = new Vector();

        int x = 0;
        int pos = comando.indexOf("&", x);
        int opcion = Integer.valueOf(comando.substring(x, pos));
        
        x = pos;
        pos = comando.indexOf("&", x+1);
        String tipo = comando.substring(x+1, pos);
        
        x = pos;
        pos = comando.indexOf("&", x+1);
        int pas = Integer.valueOf(comando.substring(x+1, pos));

        x = pos;
        pos = comando.indexOf("&", x+1);
        int velo = Integer.valueOf(comando.substring(x+1, pos));

        x = pos;
        pos = comando.indexOf("&", x+1);
        String placa = comando.substring(x+1, pos);

        String extra = comando.substring(pos+1, comando.length());

        variables.add(opcion);
        variables.add(tipo);
        variables.add(pas);
        variables.add(velo);
        variables.add(placa);
        variables.add(extra);
        return variables;
    }

    public static Object agregarVehiculo(String tipo, int pas, int velo, String placa, String extra){
        if (tipo.contains("Comercial")){
            Comercial c = new Comercial(pas, velo, placa, extra);
            return c;
        }
        else {
            Particular p = new Particular(pas, velo, placa, extra);
            return p;
        }
        
    }
    public static void listarVehiculos(Vector vehiculos){
        System.out.println("***Inventario de vehículos***");
        for (Object i:vehiculos){
            try {
                ((Comercial) i).mostrar();
            } catch(Exception e) {
                ((Particular) i).mostrar();
            }
        }
    }
    public static void main(String[] args) throws Exception {
        //Lista de Vehiculos
        Vector vehiculos = new Vector();

        int opcion = 0;
        while (opcion != 3){
            Scanner sc = new Scanner(System.in);
            String comando = sc.nextLine();
               
            if (comando.length()>1){
                Vector a = procesarComandos(comando);
                opcion = Integer.valueOf(a.get(0).toString());
                String tipo = a.get(1).toString();
                int pas = Integer.valueOf(a.get(2).toString());
                int velo = Integer.valueOf(a.get(3).toString());
                String placa = a.get(4).toString();
                String extra = a.get(5).toString();
                //System.out.println(tipo + " " + pas + " " + velo + " " + placa + " " + extra);
                vehiculos.add(agregarVehiculo(tipo, pas, velo, placa, extra));
            }
            else{
                opcion =Integer.valueOf(comando);
            }

            if (opcion==2){
                listarVehiculos(vehiculos);
            }

            if (opcion==3){
                //System.out.println(Vehiculos.get(1).placa);
                System.exit(0);
            }
        }
        
    }
}
