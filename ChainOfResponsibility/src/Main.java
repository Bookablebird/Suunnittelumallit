import java.util.Scanner;


public class Main {
    
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        double prosentti = 0.0;
        double palkka = 0.0;

        Esimies esimies = new Esimies();
        Päälikkö päälikkö = new Päälikkö();
        CEO CEO = new CEO();
        
        esimies.setSuccessor(päälikkö);
        päälikkö.setSuccessor(CEO);
        
        System.out.println("Anna palkka: ");
        palkka = scanner.nextDouble();
        
        System.out.print("Anna työntekijän palkakankorotus prosentteina ");
        prosentti = scanner.nextDouble();
        esimies.processRequest(new Palkankorotus(palkka,prosentti));
    }   
}