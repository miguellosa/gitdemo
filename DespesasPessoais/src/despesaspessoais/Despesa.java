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
    Categoria categoria;
    double montante;
   
    
    public Despesa()
    {
    }
    
    public Despesa( Categoria categoria,double montante)
    {
        this.categoria=categoria;
        this.montante=montante;
    }
    
   
    
}
