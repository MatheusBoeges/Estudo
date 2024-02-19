package SmartTv;

public class Usuario {
	
	public static void main(String[] args) {
		
		Sistema smartTv = new Sistema();
		
		System.out.println("A tv está ligada ? " + smartTv.ligada);
		
		smartTv.ligar();
		
		System.out.println("\nA tv está ligada ? " + smartTv.ligada);
		System.out.println("Canal atual : " + smartTv.canal);
		System.out.println("Volume ataual : " + smartTv.volume);
		
		smartTv.mudarCanal(7);
		
		System.out.println("\nCanal atual : " + smartTv.canal);
		
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		
		System.out.println("Volume ataual : " + smartTv.volume);
		
		smartTv.desligar();
		
		System.out.println("\nA tv está ligada ? " + smartTv.ligada);
		
	}
	
}
