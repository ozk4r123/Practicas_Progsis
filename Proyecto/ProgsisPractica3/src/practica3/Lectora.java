package practica3;

import java.io.*;

public class Lectora
{
    public static String leeCadena()
    {
	    try
	    {  
			BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
			String linea = br.readLine();
			return linea;
		}
		catch(IOException ioe){}
		return "";
	}
    
    public static char leeCaracter()
    {
	    try
	    {  
			BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
			String linea = br.readLine();
			return linea.charAt(0);
		}
		catch(IOException ioe){}
		return ' ';
    }
    
    public static int leeEntero()
    {
	    try
	    {  
			BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
			String linea = br.readLine();
			return Integer.parseInt(linea);
		}
		catch(Exception ioe){}
		return 0;
    }
    public static double leeDoble()
    {
	    try
	    {  
			BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
			String linea = br.readLine();
			return Double.parseDouble(linea);
		}
		catch(Exception ioe){}
		return 0.0;
    }
}
