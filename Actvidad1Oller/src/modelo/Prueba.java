package modelo;
import excepciones.ContrasenaInvalidaException;
import excepciones.NombreInvalidoException;

public class Prueba {

	public static void main(String[] args) {
		System.out.println("1");
		capturarErrores("Josefina","Mjo190597");
		System.out.println("2");
		capturarErrores("","Mjo190597");
		System.out.println("3");
		capturarErrores("Lucia","190597KMKM");
		System.out.println("4");
		capturarErrores("Victoria","Mjo19");

	}
	public static void capturarErrores(String nombre, String contrasena) {
		int aux=0;
		@SuppressWarnings("unused")
		Usuario u=null;
		try {
			u= new Usuario(nombre,contrasena);  
            aux = 1;
        }
        catch (ContrasenaInvalidaException e) {
            System.out.println("Contrasena invalida-->" +e.getMessage());
        }
		catch(NombreInvalidoException e ) {
			System.out.println("Nombre invalido-->" +e.getMessage());
			
		}
        finally{
            if(aux==1)
                System.out.println("Se creo el usuario de manera correcta");
        }
	}

}
