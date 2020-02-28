package PacoPotter;

public class Libro {

	private String titulo;
	private String autor;
	private int paginas;
	private static int libros=0;
	private static String estado;
	private Boolean prestado = false;
	
	public Libro(String titulo, String autor, int paginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		libros++;		
		estado = "DISP";
	}
	public void prestar() {
		prestado=true;
		estado="PREST";
	}
	public void devolver() {
		prestado=false;
		estado="DISP";
	}
	
	public int getLibros() {
		return libros;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public int getPaginas() {
		return paginas;
	}
	public String verLibro() {
		String str = "\t-" + titulo + " escrito por: " + autor + " tiene " + paginas + " pags. | " + estado;
		
		return str;
	}
	public Boolean getEstado() {
		return prestado;
	}
	
}
