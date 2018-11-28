package Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import Util.ConexaoBD;

public class ClienteRep extends ConexaoBD{

    private static final String INSERT = "insert into cadastrocliente (nome, sobrenome, email, telefone1, telefone2, senha, nascionalidade) values (?,?,?,?,?,?,?);";

    private static final String SELECT = "select idcadastroCliente, nome, sobrenome, email, telefone1, telefone2, senha, nascionalidade from cadastrocliente order by idcadastroCliente";

    private static final String LOGIN = "select nome from cadastrocliente where email = ? and senha = ?";
    
    private static final String DELETE = "delete from cadastrocliente where idcadastroCliente = ?";

    private static final String UPDATE = "update cadastrocliente set nome = ?, sobrenome = ?, email = ?, telefone1 = ?, telefone2 = ?, senha = ?, nascionalidade = ? where idcadastroCliente = ? ";

    //private Connection connection = ConexaoBD.conectarBanco();
    //private PreparedStatement pstm;
    
    private Cliente clienteLogado;

    public void salvar(Cliente cliente) throws SQLException {
        Connection connection = null;
        PreparedStatement pstm = null;
        try {
            connection = conectarBanco();
            pstm = connection.prepareStatement(INSERT);
            pstm.setString(1, cliente.getNome());
            pstm.setString(2, cliente.getSobrenome());
            pstm.setString(3, cliente.getEmail());
            pstm.setInt(4, cliente.getTelefone1());
            pstm.setInt(5, cliente.getTelefone2());
            pstm.setString(6, cliente.getSenha());
            pstm.setString(7, cliente.getNascionalidade());
            pstm.execute();
            
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar salvar: " + ex.getMessage());
        }finally{
            if(pstm != null){
               pstm.close(); 
            }
            if(connection != null){
                connection.close();
                System.out.println("Conexão finalizada!");
            }
        }
    }

    public void excluir(Cliente cliente) throws SQLException {
        Connection connection = null;
        PreparedStatement pstm = null;
        try {
            connection = conectarBanco();
            pstm = connection.prepareStatement(DELETE);
            pstm.setInt(1, cliente.getIdcadastroCliente());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar salvar: " + ex.getMessage());
        }finally{
            if(pstm != null){
               pstm.close(); 
            }
            if(connection != null){
                connection.close();
            }
        }

    }

    public Cliente logar(String email, String senha) throws SQLException
    {
        Connection connection = null;
        PreparedStatement pstm = null;
        ResultSet res;
        try {
            connection = conectarBanco();
            pstm = connection.prepareStatement(LOGIN);
            pstm.setString(1, email);
            pstm.setString(2, senha);
            res = pstm.executeQuery();

            while (res.next()) {
                clienteLogado = new Cliente();
                clienteLogado.setNome(res.getString("nome")); 
            }
            
            return clienteLogado;

        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar buscar os clientes do banco: " + ex.getMessage());
        }finally{
            if(pstm != null){
               pstm.close(); 
            }
            if(connection != null){
                connection.close();
                System.out.println("Conexão finalizada!");
            }
        }
        return null;
    }
    
    public List<Cliente> listar() throws SQLException {
        List<Cliente> clientes = new ArrayList<>();
        ResultSet res;
        Connection connection = null;
        PreparedStatement pstm = null;
        try {
            connection = conectarBanco();
            pstm = connection.prepareStatement(SELECT);
            res = pstm.executeQuery();

            while (res.next()) {
                Cliente e = new Cliente();
                e.setIdcadastroCliente(res.getInt("IdcadastroCliente"));
                e.setSobrenome(res.getString("Sobrenome"));
                e.setEmail(res.getString("Email"));
                e.setTelefone1(res.getInt("Telefone1"));
                e.setTelefone2(res.getInt("Telefone2")); 
                e.setSenha(res.getString("Senha"));
                e.setNascionalidade(res.getString("Nascionalidade"));
                clientes.add(e);
            }

        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar buscar os estudantes do banco: " + ex.getMessage());
        }finally{
            if(pstm != null){
               pstm.close(); 
            }
            if(connection != null){
                connection.close();
            }
        }
        return clientes;
    }
}
