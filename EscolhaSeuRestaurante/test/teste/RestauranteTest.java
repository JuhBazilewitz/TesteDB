package teste;

import entity.Restaurante;
import junit.framework.TestCase;

/**
 *
 * @author Juliane Bazilewitz
 */
public class RestauranteTest extends TestCase{
    
    public void testRestaurante(){
        Restaurante restaurante = new Restaurante();
        assertEquals("Apetito", restaurante.getNome());
    }
    
    public void testSetRestaurante(){
        Restaurante restaurante = new Restaurante();
        restaurante.setNome("Themys");
        assertEquals("Themys", restaurante.getNome());
    }
    
    public void testGetFuncionario(){
        Restaurante restaurante = new Restaurante();
        restaurante.setNomeFuncionario("Marco");
        assertEquals("Marco", restaurante.getNomeFuncionario());
    }
}
