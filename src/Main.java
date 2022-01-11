import java.net.InetAddress;

public class Main {

    public static void main(String[] args) {
        /* write your code here */
        String dominio="www.cifpvirgendegracia.com";
        try{
            InetAddress direccion=InetAddress.getByName(dominio);
            boolean existe=direccion.isReachable(1000);
            if(existe) System.out.println(dominio + " existe");
            else System.out.println(dominio + " no existe");

        }catch (Exception e) {
            System.out.println("error de conexión");
        }
    }
}
