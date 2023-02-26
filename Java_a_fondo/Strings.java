
/**
 * Write a description of class Strings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Strings
{
    public static void main(String[] args) {  

        // declara la cadena como un objeto S1 S2       
        String S = "Hola";                  
        int length = S.length();       
        System.out.println("Longitud de una cadena es:" + S.length());      
        
        //Determina su una cadena es la cadena vacía
        String s1 = "Hola";
        boolean b1 = s1.isEmpty();
        
        String s2 = "";
        boolean b2 = s2.isEmpty();
        
        System.out.println("Cadena 1" + s1.isEmpty());
        System.out.println( "Cadena 2" + s2.isEmpty());
        
        //Acceder a los caracteres de una cadena
        String t = "Hola";
        for(int i=0; i<t.length(); i++)
        {
            char c = t.charAt(i);
            System.out.println(c);
        }
        
        //Comparar cadenas
        String x = "Hola";
        String y = "Hola";
        if (x.equals(y)){
            System.out.println("SI pasas por aqui!");
        }
        // Determinar la posición que ocupa un carácter dentro de una cadena
        String s = "Hola, como estas?";
        int p1 = s.indexOf ('a');
        int p2 = s.lastIndexOf('a');
         System.out.println("La primera aparicion de la \"a\" es:" + p1);
          System.out.println("La ultima aparicion de la \"a\" es:" + p2);
        
        //Determinar la pisición que ocupa un carácter dentro de una cadena
        String m = "Hola, como estas? Estas como querias?";
        int t1 = m.indexOf("como");
        int t2 = m.indexOf("estas");
        int t3 = m.lastIndexOf("como");
        System.out.println ("posicion de como es: " + t1);
        System.out.println ("posicion de estas es: " + t2);
        System.out.println ("posicion de como, de atras hacia delante es: " + t3);
        
        //Convertir a mayúsculas y minúsculas
        String o = "Hola, como estas?";
        String may = o.toUpperCase();
        String min = o.toLowerCase();
        System.out.println (may);
        System.out.println (min);
        
        //Subcadenas
        String n = "Hola, como estas?";
        String n1 = n.substring (0,4);
        String n2 = n.substring (6,10);
        String n3 = n.substring (11);
        System.out.println (n1);
        System.out.println (n2);
        System.out.println (n3);
        
        //Conversión entre cadenas y números
        //enteros
        String h1 = "1234";
        int i = Integer.parseInt(h1);
        String r1 = Integer.toString(i);
        System.out.println (r1);
        //Flotantes
        String h2 = "1234.56";
        double d = Double.parseDouble(h2);
        String r2 = Double.toString(d);
        System.out.println (r2);
       
        //Concatenar cadenas
        String q = "Hola, ";
String p = "que tal?";
        String j = q+p;
        System.out.println (j);
        
        //Concatenar cadenas de caracteres
        StringBuilder sb = new StringBuilder();
        sb.append("Hola, ");
        sb.append("Chau");
        System.out.println (sb);
       
        //Modificar los caracteres de una cadena
        StringBuilder sd = new StringBuilder("Hola");
        sd.setCharAt(2,'X');
        System.out.println (sd);   
        
    }
     
}


