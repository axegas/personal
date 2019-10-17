package prueba;


	public class ColorearPrint 
	{
	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) 
	    {
	        String texto = "Ejemplo de texto de color y con fondo";
	        
	        for(int i = 30; i <= 37; i++)
	        {
	            for(int j = 40; j <= 47; j++)
	            {
	                String textoformateado = "[";
	                textoformateado += String.valueOf(i);
	                textoformateado += ";";
	                textoformateado += String.valueOf(j);
	                textoformateado += "m";
	                textoformateado += texto;
	                System.out.println((char)27 + textoformateado);
	            }
	        }
	        
	        System.out.println("Texto con color normal");
	    }
	    
	}
