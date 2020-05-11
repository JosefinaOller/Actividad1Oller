package modelo;
import excepciones.ContrasenaInvalidaException;
import excepciones.NombreInvalidoException;

public class Usuario {
	private String nombre;
	private String contrasena;
	
	public Usuario(String nombre,String contrasena) throws NombreInvalidoException, ContrasenaInvalidaException {
			this.setNombre(nombre);
			this.setContrasena(contrasena);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws NombreInvalidoException {
		if(nombre.isEmpty()==false)
			this.nombre = nombre;
		else
			throw new NombreInvalidoException("Nombre vacio");
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) throws ContrasenaInvalidaException {
		char[] arreglo =contrasena.toCharArray();
        if(contrasena.isEmpty()==false) 
        {
        	if(arreglo.length>6) 
        	{
        		if(((arreglo[0]>='A'&& arreglo[0]<='Z') | (arreglo[0]>='a'&& arreglo[0]<='z')))
        			this.contrasena = contrasena;
        		else
        			throw new ContrasenaInvalidaException("El primer caracter no es una letra");
        	}
        	else
        		throw new ContrasenaInvalidaException("No tiene mas de seis caracteres");
        }
        else
        	throw new ContrasenaInvalidaException("La contrasena es vacia o es null");
	}
}
