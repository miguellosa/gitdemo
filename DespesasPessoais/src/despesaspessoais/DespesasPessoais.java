/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package despesaspessoais;

/**
 *
 * @author Administrator
 */
public class DespesasPessoais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Despesa despesa = new Despesa("alimentação",200.0);
        System.out.println(despesa.tipodespesa);
        System.out.println(despesa.montante);
    }
}
