package state;

public class EstadoPausado implements EstadoIF{

	@Override
	public void fazerAcao(Contexto context) {
		System.out.println("Filme est� pausado...");
		context.setEstado(this);
		
		
	}

}
