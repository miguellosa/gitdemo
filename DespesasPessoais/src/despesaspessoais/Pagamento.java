/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package despesaspessoais;

import java.util.Date;



/**
 *
 * @author mcn
 */
public class Pagamento {
      private Despesa despesa;
      private Date dataPagamento;

      public Pagamento(Despesa despesa) {
            this.despesa = despesa;
            this.dataPagamento = new Date();
      }
      
      public Pagamento(Despesa despesa, Date dataPagamento) {
            this.despesa = despesa;
            this.dataPagamento = dataPagamento;
      }

      public Despesa getDespesa() {
            return despesa;
      }

      public Date getDataPagamento() {
            return dataPagamento;
      }

      public void setDespesa(Despesa despesa) {
            this.despesa = despesa;
      }

      public void setDataPagamento(Date dataPagamento) {
            this.dataPagamento = dataPagamento;
      }

      @Override
      public String toString() {
            return "Pagamento:valor=" + despesa.getMontante() + ", dataPagamento=" + dataPagamento + '}';
      }
      
}
