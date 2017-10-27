package banco;


public class TesteDAO {
    public static void main(String[] args) {
        Usuario usu = new Usuario();
        DaoUsuario dao = new DaoUsuario();
        usu.setNome("Claudir");
        usu.setSobrenome("O interessado");
        
        dao.salvarUsuario(usu);
    }
    
}
