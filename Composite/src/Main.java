public class Main {

	 public static void main(String[] args) {

		 ILaiteosa kaikkiOsat;

		 kaikkiOsat = giveOsalista(new DellFactory());
		 System.out.println("\nDell Osien kokonais hinta: " + kaikkiOsat.tulosta()+"€");
		 System.out.println("\n");

		 kaikkiOsat = giveOsalista(new HpFactory());
		 System.out.println("\nHp Osien kokonais hinta: " + kaikkiOsat.tulosta()+"€");

	 }

	 private static ILaiteosa giveOsalista(IFactory newFactory) {

		 IFactory factory = newFactory;

		 ILaiteosa kaikkiOsat = factory.giveKoostekomponentti();

		 ILaiteosa emolevy = factory.giveEmolevy();

		 emolevy.addLaiteosa(factory.giveProsessori());
		 emolevy.addLaiteosa(factory.giveRAM());
		 emolevy.addLaiteosa(factory.giveNaytonohjain());
		 emolevy.addLaiteosa(factory.giveVerkkokortti());

		 ILaiteosa kotelo = factory.giveKotelo();

		 kotelo.addLaiteosa(factory.giveVirtalahde());
		 kotelo.addLaiteosa(factory.giveTuuletin());

		 kaikkiOsat.addLaiteosa(emolevy);
		 kaikkiOsat.addLaiteosa(kotelo);

		 return kaikkiOsat;
	 }

}