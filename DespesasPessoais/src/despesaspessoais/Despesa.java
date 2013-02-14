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
    private Categoria categoria;
    private double montante;
   
    
    public Despesa()
    {
    }
    
    public Despesa( Categoria categoria,double montante)
    {
        this.categoria=categoria;
        this.montante=montante;
    }

    /**
     * @return the categoria
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the montante
     */
    public double getMontante() {
        return montante;
    }

    /**
     * @param montante the montante to set
     */
    public void setMontante(double montante) {
        this.montante = montante;
    }
    
   
    
}
