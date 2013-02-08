package despesaspessoais;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author Administrator
 */
public class Despesa {
    String tipodespesa;
    double montante;
    
    public Despesa()
    {
        
    }
    
    public Despesa(String tipodespesa,double montante)
    {
        this.tipodespesa=tipodespesa;
        this.montante=montante;
    }
}
