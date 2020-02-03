import static org.junit.Assert.*;

import org.junit.Test;

public class TestDeposito {

	  private double depMax;
	  private double depNivel;


	@Test
	public void testGetDepositoNivel() {
		DepositoCombustible d1= new DepositoCombustible(100,50);
		assertEquals(50,d1.getDepositoNivel(),0);
	}

	@Test
	public void testGetDepositoMax() {
		DepositoCombustible d1= new DepositoCombustible(100,50);
		assertEquals(100,d1.getDepositoMax(),0);
	}

	@Test
	public void testEstaVacio() {
		DepositoCombustible d1= new DepositoCombustible(100,50);
		assertEquals(false,d1.estaVacio());
	}


	@Test
	public void testConsumir() {
		DepositoCombustible d1= new DepositoCombustible(100,50);
		d1.consumir(5);
		assertEquals(45,d1.getDepositoNivel(),0);
		d1.consumir(-5);
		assertEquals(45,d1.getDepositoNivel(),0);
		d1.consumir(0);
		assertEquals(45,d1.getDepositoNivel(),0);
		d1.consumir(40);
		assertEquals(5,d1.getDepositoNivel(),0);
	}
	
	
	@Test
	public void testFill() {
		DepositoCombustible d1= new DepositoCombustible(100,50);
		d1.fill(5);
		assertEquals(55,d1.getDepositoNivel(),0);
		d1.fill(15);
		assertEquals(70,d1.getDepositoNivel(),0);
		d1.fill(30);
		assertEquals(100,d1.getDepositoNivel(),0);
		d1.fill(-5);
		assertEquals(100,d1.getDepositoNivel(),0);
		d1.fill(0);
		assertEquals(100,d1.getDepositoNivel(),0);
	}

}
