package model;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Usuario {

	
	
	private String idUsuario;
	private List<Mensaje> mensajes;
	private List<Mensaje> muro;
	private String nombre;
	private String apellido1;
	private String apellido2;
	
	//constructor vacio obligatorio
		public Usuario(){
			
		}
		
		//constructor
		public Usuario(String idUsuario,String nombre,String apellido1,String apellido2){
			this.idUsuario = idUsuario;
			this.nombre = nombre;
			this.apellido1 = apellido1;
			this.apellido2 = apellido2;
		}
	

	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	public List<Mensaje> getMensajes() {
		return mensajes;
	}
	public void setMensajes(List<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}
	public List<Mensaje> getMuro() {
		return muro;
	}
	public void setMuro(List<Mensaje> muro) {
		this.muro = muro;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
