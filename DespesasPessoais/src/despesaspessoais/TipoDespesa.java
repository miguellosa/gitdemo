/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package despesaspessoais;

import java.util.List;

/**
 *
 * @author losa xxxxxxxxxxxxxxxxxxxxx
 */
public class TipoDespesa {
    private String descricao;
    private String codigo;   
    
    public TipoDespesa(String descricao,String codigo)
    {
        this.descricao=descricao;
        this.codigo=codigo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
