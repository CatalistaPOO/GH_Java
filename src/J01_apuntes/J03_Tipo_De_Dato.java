package J01_apuntes;

public class J03_Tipo_De_Dato {
	public static void main(String[] arg) {
		
		//VARIABLES TIPO NUMERICO
		
			//ENTEROS
	
			//int:4bytes (desde -2.147.483.648 hasta 2.147.483.647).En uso por defecto
			int tipoint=2147483647; //numero maximo
	
			//short:2bytes (desde -32.768 hasta 32.767)
			short tiposhort=32767; //numero maximo
	
			//long:8bytes (un rango muy grande)
			long tipolong=999999999L; //debe llevar L al final
	
			//byte:1byte (desde -128 hasta 127)
			byte tipobyte=127;//numero máximo
	
		
			//DECIMALES
		
			//float:4bytes (+-3.40282347E+38F)
			float tipofloat= 3.2587f;//debe llevar f al final
		
			//double:8bytes (numero muy grande).En uso por defecto.
			double tipodouble=99999999999999999999999.9;
	
	
		//VARIABLES TIPO CARACTER
	
		//caracteres existentes en tabla de codificacion UNICODE
		char tipochar='A';
		
	
		//VARIABLES TIPO BOOLEAN
		
		//boolean:1byte (falso (0) o verdadero (1)
		boolean tipoboolean= true;
		
		
			 
		byte b = 5;
		short s = b;
		int i = s;
		long l = i;
		float f =l;
		double d = f;
			 
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println("-------");
			 
			 
		i = Integer.MAX_VALUE; //MAX_VALUE es una constante que almacena el mayor valor entero
		f = i;
		d = i;
		System.out.println(i); //trunca el decimal, pierde precision
		System.out.println(f); //trunca el decimal, pierde precision
		System.out.println(d);
		System.out.println("-------");
			 
		l= Long.MAX_VALUE;
		f = l;
		d = l;
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);		 
		
		//Valores y tipos de datos, conversiones y problemas 

		byte b1 = 7;
		//byte b1 = 200; //dará error, sale del rango de byte;
	
		double  d1= 1.5; //8 bytes
	
		//float f = 0.1; //dará error porque ocupa más de lo que abarca un float (float son 4 bytes)
		float f1 = 0.1F;//los prefijos (este caso F)permiten convertir ese dato

		//int numGrande = 2_200_000_000; //error , supera el rango int
		long l1 = 2_200_000_000L;//prefijjo L permite convierte el dato.
	
		// System.out.println(2_200_000_000);Dará error
		System.out.println(2_200_000_000L); //Soluciona el error ya que por defecto seria un numero int
	
	}
}