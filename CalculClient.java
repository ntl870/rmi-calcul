import java.rmi.*;

public class CalculClient {
    public static void main(String[] args){
        try{
            String res = "rmi://localhost/RMICalcul";
            // Lookup the service in the registry, and obtain a remote service
            Remote remoteService = Naming.lookup(res);

            // Cast to a RMICalcul Interface
            RMICalcul calculService = (RMICalcul)remoteService;

            // Call remote method
            System.out.println("Sum of 3 and 5 is: " + calculService.add(3,5));
            System.out.println("Sub of 5 and 3 is: " + calculService.sub(5,3));
            System.out.println("Convert 100 fahrenheit to Celsius: " + calculService.convert(100));
        } catch(Exception e){
            System.err.println("Error – " + e.getMessage());
        }
    }
}