import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
import javax.sound.sampled.DataLine;
import javax.sound.*;
public class Exercise12 {
 static int points = 0;
 static boolean canItBeCorrect = false;
 public static void main(String[] args) {
  String respuesta1;
  Scanner keyboard = new Scanner(System.in);
  System.out.println("¿Cuál es la forma mínima de organización de ficheros (1 palabra)");
  respuesta1 = keyboard.nextLine();
  if (respuesta1.equalsIgnoreCase("Registros") || respuesta1.equalsIgnoreCase("Registro")) {
   Audio.main("respuestacorrecta.wav");
   System.out.println("Tu respuesta es correcta");
   points++;
  } else {
   Audio.main("respuestaincorrecta.wav");
   System.out.println("Tu respuesta es incorrecta");
  }
  String respuesta2;
  System.out.println("¿Cómo se llama la organización sin ánimo de lucro conocida por sus licencias libres?");
  respuesta2 = keyboard.nextLine();
  if (respuesta2.equalsIgnoreCase("Creative Commons")) {
   Audio.main("respuestacorrecta.wav");
   System.out.println("Tu respuesta es correcta");
   points++;
  } else {
   Audio.main("respuestaincorrecta.wav");
   System.out.println("Tu respuesta es incorrecta");
  }
  String respuesta3;
  System.out.println("¿Con qué etiqueta se pone un vídeo con controles en Html5? (pon la etiqueta en si, no te olvides de '<>'");
  respuesta3 = keyboard.nextLine();
  if (respuesta3.equalsIgnoreCase("<video controls>")) {
   Audio.main("respuestacorrecta.wav");
   System.out.println("Tu respuesta es correcta");
   points++;
  } else {
   Audio.main("respuestaincorrecta.wav");
   System.out.println("Tu respuesta es incorrecta");
  }
  String respuesta4;
  System.out.println("¿Cuál es la cardinalidad máxima de una relación? (Dos palabras)");
  respuesta4 = keyboard.nextLine();
  if (respuesta4.equalsIgnoreCase("Muchos a Muchos") || respuesta4.equalsIgnoreCase("Infinitos a Infinitos")) {
   Audio.main("respuestacorrecta.wav");
   System.out.println("Tu respuesta es correcta");
   points++;
  } else {
   Audio.main("respuestaincorrecta.wav");
   System.out.println("Tu respuesta es incorrecta");
  }
  String respuesta5;
  System.out.println("¿Cómo se define la función main()?");
  respuesta5 = keyboard.nextLine();
  if (respuesta5.equals("public static void main(String[] args)")) {
   System.out.println("¿Es 'args' en 'String[] args' obligatorio como nombre de la String[]?");
   respuesta5 = keyboard.nextLine();
   if (respuesta5.equalsIgnoreCase("No"))) {
    Audio.main("respuestacorrecta.wav");
    System.out.println("Tu respuesta es correcta");
    points++;
   } else {
    Audio.main("respuestaincorrecta.wav");
    System.out.println("Tu respuesta es incorrecta");
    points++;
   }
  } else {
   System.out.println("No es el consenso, pero puede estar bien");
   System.out.println("Te daré el punto de todas formas y lo revisaré al acabar el cuestionario, si no es correcto, te quitaré ese punto");
   Audio.main("respuestacorrecta.wav");
   points++;
   canItBeCorrect = true;
   Audio.main("respuestaincorrecta.wav");
   System.out.println("Tu respuesta es incierta");
  }
  String respuesta6;
  System.out.println("¿Qué certificación es obligatoria para pasar SINF?");
  respuesta6 = keyboard.nextLine();
  if (respuesta6.equals("CCNA1")) {
   Audio.main("respuestacorrecta.wav");
   System.out.println("Tu respuesta es correcta");
   points++;
  } else {
   Audio.main("respuestaincorrecta.wav");
   System.out.println("Tu respuesta es incorrecta");
  }
  String respuesta7;
  System.out.println("¿Cómo se empieza una consulta básica en el lenguaje SQL? (1 palabra en mayúscula)");
  respuesta7 = keyboard.nextLine();
  if (respuesta7.equals("SELECT")) {
   Audio.main("respuestacorrecta.wav");
   System.out.println("Tu respuesta es correcta");
   points++;
  } else {
   Audio.main("respuestaincorrecta.wav");
   System.out.println("Tu respuesta es incorrecta");
  }
  String respuesta8;
  System.out.println("¿Cómo se dividen los tipos de archivos? (2 palabras, 'x' y 'e')");
  respuesta8 = keyboard.nextLine();
  if (respuesta8.equalsIgnoreCase("De texto y binario") || respuesta8.equalsIgnoreCase("Texto y binario")) {
   Audio.main("respuestacorrecta.wav");
   System.out.println("Tu respuesta es correcta");
   points++;
  } else {
   Audio.main("respuestaincorrecta.wav");
   System.out.println("Tu respuesta es incorrecta");
  }
  String respuesta9;
  System.out.println("¿Cómo se le llama en bases de datos a una función que a partir de una clave, obtiene la posición de lo asociado a esta en su correspondiente registro? (En español peninsular)");
  respuesta9 = keyboard.nextLine();
  if (respuesta9.equalsIgnoreCase("Función aleatorizante") || respuesta9.equalsIgnoreCase("Funcion aleatorizante") || respuesta9.equalsIgnoreCase("Función hash") || respuesta9.equalsIgnoreCase("Funcion Hash")) {
   Audio.main("respuestacorrecta.wav");
   System.out.println("Tu respuesta es correcta");
   points++;
  } else {
   Audio.main("respuestaincorrecta.wav");
   System.out.println("Tu respuesta es incorrecta");
  }
  String respuesta10;
  System.out.println("¿Con que comando de la consola de comandos predeterminada de Ubuntu 19.04 se obtiene el fichero en el que la terminal se situa en ese momento? (en minúscula)");
  respuesta10 = keyboard.nextLine();
  if (respuesta10.equalsIgnoreCase("pwd")) {
   Audio.main("respuestacorrecta.wav");
   System.out.println("Tu respuesta es correcta");
   points++;
  } else {
   Audio.main("respuestaincorrecta.wav");
   System.out.println("Tu respuesta es incorrecta");
  }
  if (canItBeCorrect == false) {} else {
   System.out.println("Ahora se comprobará si tu respuesta 5 es correcta o no, lo último que pusiste fue" + respuesta5);
   System.out.println("Llame al autor (Pablo Luis Molina Blanes), y pídale que ponga la contraseña correspondiente, si desea ver su puntuación ya, escriba 'ver' en la consola (no se retira el punto)");
   while (true) {
    String contraseña = System.console().readLine();
    if (contraseña.equals("ver")) {
     System.out.println("Tienes, por ahora, " + points + " puntos de diez posibles");
    } else if (contraseña.equals("Misgatosrompenlasparedes7diasno6")) {
     Audio.main("respuestacorrecta.wav");
     System.out.println("Permanece el punto, respuesta correcta");
     break;
    } else if (contraseña.equals("Miscigarrasedesvivenpormi")) {
     Audio.main("respuestaincorrecta.wav");
     System.out.println("Respuesta incorrecta, se quita el punto");
     points--;
     break;
    } else {
     System.out.println("Contraseña incorrecta");
    }
   }
  }
  System.out.println("Tienes " + points + " puntos de diez posibles");
  System.out.println("Tus respuestas han sido " + respuesta1 + ", " + respuesta2 + ", " + respuesta3 + ", " + respuesta4 + ", " + respuesta5 + ", " + respuesta6 + ", " + respuesta7 + ", " + respuesta8 + ", " + respuesta9 + ", " + respuesta10);
 }
}
class Audio {
 public static void main(String args2) {
  try {
   File respuesta = new File(args2);
   AudioInputStream audioStream = AudioSystem.getAudioInputStream(respuesta);
   AudioFormat wav = audioStream.getFormat();
   DataLine.Info info = new DataLine.Info(Clip.class, wav);
   Clip audioClip = (Clip) AudioSystem.getLine(info);
   audioClip.open(audioStream);
   audioClip.start();
   try {
    Thread.sleep(4000);
   } catch (InterruptedException ex) {
    ex.printStackTrace();
   }
   audioClip.close();
   audioStream.close();
  } catch (UnsupportedAudioFileException ex) {
   System.out.println("The specified audio file is not supported");
   ex.printStackTrace();
  } catch (LineUnavailableException ex) {
   System.out.println("Audio line for playing back is unavailable");
   ex.printStackTrace();
  } catch (IOException ex) {
   System.out.println("Error playing the audio file");
   ex.printStackTrace();
  }
 }
}
