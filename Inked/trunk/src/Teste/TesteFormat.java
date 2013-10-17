/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

/**
 *
 * @author Administrador
 */
public class TesteFormat {

    public static void main(String[] args) {
        format("2,56");
    }

    public static double format(String valor) {
        System.out.println("1 - " + valor);
        Double resul = Double.parseDouble(valor.replaceAll(",", "."));;
        System.out.println("Double - " + resul);
        return resul;
    }
}
