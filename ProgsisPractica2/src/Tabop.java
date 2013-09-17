public class Tabop 
{
	String codigo_oper, cod1,cod2, cod3,cod4, cod5, cod6;	

	public Tabop()
	{
	}	

	public void agregar(String codigo_oper,String cod1,String cod2, String cod3,String cod4,String cod5, String cod6)
	{
		this.codigo_oper=codigo_oper;
		this.cod1=cod1;
		this.cod2=cod2;
		this.cod3=cod3;
		this.cod4=cod4;
		this.cod5=cod5; 
		this.cod6=cod6;
	}

	public void mostrar()
	{
		System.out.println(codigo_oper+"	"+cod1+"	"+cod2+"	"+ cod3+"	"+cod4+"	"+cod5+"	"+cod6);
	}
}