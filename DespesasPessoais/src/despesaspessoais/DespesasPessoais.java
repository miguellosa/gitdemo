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
        TipoDespesa cat=new TipoDespesa("Alimentação","0012");
        Despesa despesa = new Despesa(cat,200.0);
        System.out.println(despesa.getCategoria().getDescricao());
        System.out.println(despesa.getMontante());
         Pagamento pag=new Pagamento(despesa);
        System.out.println(pag);
    }
}
