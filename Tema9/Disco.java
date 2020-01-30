package Tema9;

public class Disco {
private String codigo;
private String genero;
private String titulo;
private String album;
private String autor;
public Disco (String c, String g, String t, String al, String au) {
	this.codigo = c;
	this.genero = g;
	this.titulo = t;
	this.album = al;
	this.autor = au;
}
public String getCodigo() {
	return codigo;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getAlbum() {
	return album;
}
public void setAlbum(String album) {
	this.album = album;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public String toString() {
	return "------------" + "\n" +  "Codigo: " + this.getCodigo() + "\n" + "Titulo: " + this.getTitulo() + "\n" + "Album: " + this.getAlbum() + "\n" + "Autor: " + this.getAutor() + "\n" + "Genero: " + this.getGenero() + "\n" + "------------" + "\n";
}
}
