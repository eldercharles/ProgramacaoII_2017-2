
package banco;

import java.sql.Connection;
import java.util.List;


public class DaoUsuario {
    
    Connection conexao = Conexao.criarConexao();
    
    // Listar 
    public List<Usuario> listarUsuarios() {
        return null;
    }
    
    //Salvar
    public boolean salvarUsuario(Usuario usuario) {
        return false;
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
