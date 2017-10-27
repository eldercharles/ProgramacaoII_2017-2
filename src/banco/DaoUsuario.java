package banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoUsuario {

    Connection conexao = Conexao.criarConexao();

    // Listar 
    public List<Usuario> listarUsuarios() {
        return null;
    }

    //Salvar
    public int salvarUsuario(Usuario usuario) {
        String sql = "INSERT "
                + "INTO "
                + "tb_usuario (nome, sobrenome) "
                + "VALUES (?, ?)";
        try {
            PreparedStatement preparacaoDaInstrucao = conexao.prepareStatement(sql);
            // De acordo com a posicao do ponto de interrogacao na SQL e o tipo do dado
            preparacaoDaInstrucao.setString(1, usuario.getNome());
            preparacaoDaInstrucao.setString(2, usuario.getSobrenome());

            return preparacaoDaInstrucao.executeUpdate();
        } catch (SQLException ex) {
            
            ex.printStackTrace();
            return - 1;
        }
    }

    //Excluir
    public boolean excluirUsuario(Usuario usuario) {
        return false;
    }

    //Atualizar
    public boolean atualizarUsuario(Usuario usuario) {
        return false;
    }
}
