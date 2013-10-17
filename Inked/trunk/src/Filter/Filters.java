/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Filter;

/**
 *
 * @author Administrador
 */
public class Filters {
    
    public Double format(String valor) {
        Double resul = Double.parseDouble(valor.replaceAll(",", "."));
        return resul;
    }
}
