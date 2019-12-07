	public class Main{
		public static void main(String[] args){
			
			Kangas kangas = new Kangas();
			
			Command switchUp = new FlipUpCommand(kangas);
			Command switchDown = new FlipDownCommand(kangas);
			
			WallButton on = new WallButton(switchUp);
			WallButton off = new WallButton(switchDown);
			
			on.push();
			off.push();
		}
	}