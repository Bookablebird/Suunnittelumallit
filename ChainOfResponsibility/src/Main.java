import java.util.Scanner;


public class Main {
    
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        double prosentti = 0.0;
        double palkka = 0.0;

        Esimies esimies = new Esimies();
        P��likk� p��likk� = new P��likk�();
        CEO CEO = new CEO();
        
        esimies.setSuccessor(p��likk�);
        p��likk�.setSuccessor(CEO);
        
        System.out.println("Anna palkka: ");
        palkka = scanner.nextDouble();
        
        System.out.print("Anna ty�ntekij�n palkakankorotus prosentteina ");
        prosentti = scanner.nextDouble();
        esimies.processRequest(new Palkankorotus(palkka,prosentti));
    }   
}