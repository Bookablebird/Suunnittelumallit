public class FlipDownCommand implements Command {
	private Kangas kangas;
	
	public FlipDownCommand(Kangas kangas) {
		this.kangas = kangas;
	}
	@Override // Command
	public void execute() {
		kangas.turnOff();
	}
}