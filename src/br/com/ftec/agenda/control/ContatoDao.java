/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ftec.agenda.control;

import br.com.ftec.agenda.model.Contato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ADM
 */
public class ContatoDao {
    
    public void salvarContato(Contato contato) throws ClassNotFoundException, SQLException{
        
        
         String sql = "insert into agenda (nome, telefone, email)"
                 + "values (?,?,?)";

        Connection conn = null;
        PreparedStatement pstm = null;
        
        conn = Conexao.criaConexao();
        pstm = conn.prepareStatement(sql);
        pstm.setString(1, contato.getNome());
        pstm.setString(2, contato.getTelefone());
        pstm.setString(3, contato.getEmail());


        
        
        
        
    }
    
}
