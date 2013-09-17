import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Linea
{
	String etiqueta, codigo,codigo_END, operando, archierr;
	int lin;
	Progsis p=new Progsis();

	public Linea(int linea, String archiv)
	{
		lin=linea;
		archierr=archiv;
	}

	public boolean  validarEtiqueta(String etiq)
	{
		etiqueta=etiq;
		if(etiqueta.length()>8)
		{
			p.escribirError(lin+"\tLa etiqueta es demasiado larga\r\n",archierr);
			return false;
		}
        else
        {
			Pattern pat = Pattern.compile("[a-zA-Z][a-zA-Z_0-9]{0,7}");
	        Matcher mat = pat.matcher(etiqueta);
	        if (mat.matches())
	        {
	        	return true;
	        }
	        else
	        {
	        	p.escribirError(lin+"\tLa etiqueta: "+etiq+" no es valida\r\n",archierr);
	        	return false;
	        }
        }
	}

	public boolean validarCodigo(String cod)
	{
		codigo=cod;
		if(codigo.length() >5)
		{
			p.escribirError(lin+"\tEl codigo de operación es demasiado largo\r\n",archierr);       	    
			return false;
		}
		else
		{
			Pattern pat = Pattern.compile("[a-zA-Z][a-zA-Z.]{1,4}");
			Matcher mat = pat.matcher(codigo);
			if (mat.matches())
			{
				return true;
			}
			else
			{
				p.escribirError(lin+"\tEl codigo de operacion: "+codigo+" no es valido\r\n",archierr);
				return false;
			}
		}
	}
	public boolean validarCodigo_END(String cod)
	{
		codigo_END=cod;
		if(codigo_END.toLowerCase().equals("end"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean validarOperando(String oper)
	{
		operando=oper;		
	    Pattern pat = Pattern.compile(".*");
        Matcher mat = pat.matcher(operando);
        if (mat.matches()) 
        {
        	return true;       	
        }
        else
      	{	
        	p.escribirError(lin+"\tEl operando  no   es valido\r\n",archierr);
         	return false;
        }
	}
}
