public class Principal{
	public static void main(String[] args) {
		
		Persona listaClientes [] = new Persona [100];
		Persona2 listaVendedores [] = new Persona2 [10];
		
		listaClientes[0] = new Persona("108800", "Oscar Loaiza", "Calle 20");
		listaClientes[1] = new Persona("108801", "Daniel Garcia", "Calle 19");
		listaClientes[2] = new Persona("108802", "Juan Lopez", "Calle 18");
		listaClientes[3] = new Persona("108803", "Catalina Mendez", "Calle 17");
		listaClientes[4] = new Persona("108804", "Andres Lopez", "Calle 16");

		listaVendedores[0] = new Persona2("015599", "Alejandra Lopez");
		listaVendedores[1] = new Persona2("025599", "Luisa Fernanda");
		listaVendedores[2] = new Persona2("035599", "Andres Saldarriaga");
		listaVendedores[3] = new Persona2("045599", "Aqua Stawberry");
		listaVendedores[4] = new Persona2("055599", "Santiago Gomez");

		Facturador inicio = new Facturador(listaClientes, listaVendedores);

	}
}