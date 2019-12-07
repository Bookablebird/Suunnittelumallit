public class FlipUpCommand implements Command {
	private Kangas kangas;
	
	public FlipUpCommand(Kangas kangas) {
		this.kangas = kangas;
	}
	
	@Override // Command
	public void execute() {
		kangas.turnOn();
	}
}