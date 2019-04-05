package model;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Mensaje {

	private String idMsg;
	private String idUsuarioOrigen;
	private String idUsuarioDestino;
	private String contenido;
	
	//constructor vacio obligatorio
	public Mensaje(){
		
	}
	
	//constructor
	public Mensaje(String idMsg,String idUsuarioOrigen,String idUsuarioDestino,String contenido){
		this.idMsg = idMsg;
		this.idUsuarioDestino = idUsuarioDestino;
		this.idUsuarioOrigen = idUsuarioOrigen;
		this.contenido = contenido;
	}

	public String getIdMsg() {
		return idMsg;
	}

	
	public String getIdUsuarioOrigen() {
		return idUsuarioOrigen;
	}

	

	public String getIdUsuarioDestino() {
		return idUsuarioDestino;
	}

	

	public String getMensaje() {
		return contenido;
	}

	public void editarMensaje(String contenido) {
		this.contenido = contenido;
	}
	
}
