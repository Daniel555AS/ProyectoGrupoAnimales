package co.edu.upb.proyectogrupoanimales;

public class Principal {

	public static void main(String[] args) {

		// ----------- Ejemplo de Creación de una Instancia de la Clase MamiferoTerrestre -----------

		MamiferoTerrestre oso = new MamiferoTerrestre("Oso", MamiferoTerrestre.TipoExtremidad.PLANTIGRADO);

		System.out.println("\n-------------------- MAMIFERO TERRESTRE --------------------\n");
		System.out.println("-->Nombre: " + oso.getNombreEspecie());
		System.out.println("-->Tipo de Extremidad: " + oso.getTipoExtremidad());
		System.out.println("-->Sonido: " + oso.getOnomatopeya());
		System.out.println("\n------------------------------------------------------------");

		// ------------------------------------------------------------------------------------------


		// ----------- Ejemplo de Creación de una Instancia de la Clase MamiferoAcuatico -----------

		MamiferoAcuatico ballena = new MamiferoAcuatico("Ballena");
		ballena.setMinutosContieneRespiracion(90);

		System.out.println("\n--------------------- MAMIFERO ACUATICO --------------------\n");
		System.out.println("-->Nombre: " + ballena.getNombreEspecie());
		System.out.println("-->Minutos que Aguanta la Respiracion: " + ballena.getMinutosContieneRespiracion());
		System.out.println("-->Sonido: " + ballena.getOnomatopeya());
		System.out.println("\n------------------------------------------------------------");

		// -----------------------------------------------------------------------------------------


		// ----------- Ejemplo de Creación de una Instancia de la Clase MamiferoVolador -----------

		MamiferoVolador murcielago = new MamiferoVolador("Muercielago");
		murcielago.setAlas(true);
						      
		System.out.println("\n--------------------- MAMIFERO VOLADOR ---------------------\n");
		System.out.println("-->Nombre: " + murcielago.getNombreEspecie());

		if(murcielago.getAlas()) {
			System.out.println("-->Si Tiene Alas.");
		}
		else {
			System.out.println("-->No Tiene Alas.");
		}

		System.out.println("-->Sonido: " + murcielago.getOnomatopeya());
		System.out.println("\n------------------------------------------------------------");
		
		// ----------------------------------------------------------------------------------------
		
		
		// ----------- Ejemplo de Creación de una Instancia de la Clase Ave -----------
		
		Ave condorDeCalifornia = new Ave("Condor de California", TipoAve.AVE_DE_CARRONA);
		
		System.out.println("\n--------------------------- AVE ----------------------------\n");
		System.out.println("-->Nombre: " + condorDeCalifornia.getNombreEspecie());
		System.out.println("-->Tipo de Ave: " + condorDeCalifornia.getTipoAve());
		System.out.println("-->Sonido: " + condorDeCalifornia.getOnomatopeya());
		System.out.println("\n------------------------------------------------------------");
		
		// ----------------------------------------------------------------------------
		
		
		// ----------- Ejemplo de Creacion de una Instancia de la Clase Reptil -----------
		
		Reptil cocodriloDePantano = new Reptil("Cocodrilo de Pantano", TipoReptil.COCODRILO);
		                      
		System.out.println("\n-------------------------- REPTIL --------------------------\n");
		System.out.println("-->Nombre: " + cocodriloDePantano.getNombreEspecie());
		System.out.println("-->Tipo de Reptil: " + cocodriloDePantano.getTipoReptil());
		System.out.println("-->Sonido: " + cocodriloDePantano.getOnomatopeya());
		System.out.println("\n------------------------------------------------------------");
		
		// -------------------------------------------------------------------------------
			
	} // main

} // public class Principal
