package carles.provagooglemap;


public class Lista_entrada {
	private int idImagen;
	private String textoEncima; 
	private String textoDebajo;
	private String mapaGoogle;
	  
	public Lista_entrada (int idImagen, String textoEncima, String textoDebajo, String mapaGoogle) {
	    this.idImagen = idImagen;
	    this.textoEncima = textoEncima; 
	    this.textoDebajo = textoDebajo;
		this.mapaGoogle = mapaGoogle;
	}
	
	public String get_textoEncima() { 
	    return textoEncima; 
	}
	
	public String get_textoDebajo() { 
	    return textoDebajo; 
	}
	
	public int get_idImagen() {
	    return idImagen; 
	}

	public  String getMapaGoogle() { return mapaGoogle; }
}
