import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class FiguraTest {

	
//PRUEBAS UNITARIAS PARA CUADRADOS
	
	
	
	
	@Test
	public void determinarSiAltura0Cuadrado() {
		Figura figura = new Figura();
		assertEquals(figura.cuadrado(0).toString(),"");
	}
	
	@Test
	public void determinarSiAltura1Cuadrado() {
		Figura figura = new Figura();
		assertEquals(figura.cuadrado(1).toString(),"* \n");
	}
	@Test
	public void determinarSiAltura7Cuadrado() {
		Figura figura = new Figura();
		assertEquals(figura.cuadrado(7).toString(),
		"* * * * * * * \n"
	   +"* * * * * * * \n"
	   +"* * * * * * * \n"
	   +"* * * * * * * \n"
	   +"* * * * * * * \n"
	   +"* * * * * * * \n"
	   +"* * * * * * * \n");
		
	}
	
//PRUEBAS UNITARIAS PARA TRIANGULOS	
	
	@Test
	public void determinarSiAltura0Triangulo() {
		Figura figura = new Figura();
		assertEquals(figura.triangulo(0).toString(),"");
	}
	
	@Test
	public void determinarSiAltura1Triangulo() {
		Figura figura = new Figura();
		assertEquals(figura.triangulo(1).toString()," *\n");
	}
	@Test
	public void determinarSiAltura7Triangulo() {
		Figura figura = new Figura();
		assertEquals(figura.triangulo(7).toString(),
		"       *\n"
	   +"      ***\n"
	   +"     *****\n"
	   +"    *******\n"
	   +"   *********\n"
	   +"  ***********\n"
	   +" *************\n");
		
	}

	//PRUEBAS UNITARIAS PARA ROMBOS	
	
		@Test
		public void determinarSiAltura0Rombo() {
			Figura figura = new Figura();
			assertEquals(figura.rombo(0).toString(),"");
		}
		
		@Test
		public void determinarSiAltura1Rombo() {
			Figura figura = new Figura();
			assertEquals(figura.rombo(1).toString()," *\n  \n");
		}
		@Test
		public void determinarSiAltura7Rombo() {
			Figura figura = new Figura();
			assertEquals(figura.rombo(7).toString(),
			"       *\n"
		   +"      ***\n"
		   +"     *****\n"
		   +"    *******\n"
		   +"   *********\n"
		   +"  ***********\n"
		   +" *************\n"
		   +"  ***********\n"
		   +"   *********\n"
		   +"    *******\n"
		   +"     *****\n"
		   +"      ***\n"
		   +"       *\n"
		   +"        \n");
		}

}
