package Tema11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;

public class ExCV {
	public static void main(String[] args) throws IOException {
		boolean experiencia = false;
		boolean imagen = false;
		boolean nombre = true;
		String file = "cv";
		int counter = 0;
		BufferedReader readerGayy = new BufferedReader(new FileReader(file+".txt"));
		String curr = "";
		BufferedReader stepByStep = new BufferedReader(new StringReader(""));
		try {
		BufferedWriter writer = new BufferedWriter(new FileWriter(file+"_sort"+".html"));
		writer.write("<!DOCTYPE html>\n");
		writer.write("<html lang='es'>\n");
		writer.write("<head>\n");
		writer.write("<meta charset='UTF-8'>\n");
		writer.write("<meta name='viewport' content='width=device-width, initial-scale=1.0'>\n");
		writer.write("<title>Curriculum Vitae</title>\n");
		writer.write("<link rel='stylesheet' href='cv.css'>\n");
		writer.write("</head>\n");
		writer.write("<body>\n");
		writer.write("<div class='fondoprueba' id='firstBack'></div>\n");
		curr = readerGayy.readLine();
		while (curr != null) {
			BufferedReader readerSecond = new BufferedReader(new StringReader(curr));
			char currentChar = 0;
			if (curr.contains("<<")) {
				while (currentChar != 32) {
					currentChar = (char) readerSecond.read();	
				}
				String name = "";
				if (nombre) {
				name += "<h1>";	
				} else {
					name += "<div><h1>";	
				}
				while (currentChar != 65535) {
					currentChar = (char) readerSecond.read();
					int number = (int) currentChar;
					if (currentChar == 65535) {
						break;
					}
					name += currentChar;
				}
				if (nombre) {
					name += "</h1>\n";	
					nombre = false;
					} else {
						name += "</h1></div>\n";	
					}
				if (name.toLowerCase().equals("<div><h1>experiencia</h1></div>\n") || name.toLowerCase().equals("<div><h1>educacion</h1></div>\n")) {
					experiencia = true;
				}
				if (name.toLowerCase().equals("<div><h1>imagen</h1></div>\n")) {
					imagen = true;
				}
				writer.write(name);
				curr = readerGayy.readLine();
			} else {
				String name = "";
				while (curr != null) {
					if (curr.contains("<<")) {
						break;
					}
					if (experiencia) {
						int counterArray = 0;
						int maxElement = 4;
						name += "<p>";
						while (counterArray < maxElement) {
							name += curr;
							if (counterArray == 0) {
							name += " (";	
							} else if (counterArray == 1) {
								name += "-";
							} else if (counterArray == 2) {
								name += "). ";	
							} else {
								name += " ";
							}
							curr = readerGayy.readLine();
							counterArray++;
						}
						name += "</p>";
						name += "\n";
					} else if (imagen) {
					name += "<img src='" + curr + "'>";
					curr = readerGayy.readLine();
					}  else {
						name += "<p>";
						name += curr;
						name += "</p>";
						name += "\n";
						curr = readerGayy.readLine();
					}
				}
				writer.write(name);
				experiencia = false;
				imagen = false;
			}
		}
		writer.write("</body>");
		writer.write("</html>");
		writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} 
}

