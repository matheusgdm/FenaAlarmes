package Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.CompraAtual;
import Util.ConexaoBD;
import static Util.ConexaoBD.conectarBanco;
import model.Cliente;

 

public class CompraAtualRep {

    private static final String INSERT = "insert into compraAtual (totalItens, precoTotalCompra, centralDSC, centralJFL, tecladoDSC, tecladoParadox, bateriaIntel, bateriaMoura, sireneGLK, sireneECP, sensorPlus, sensorPassivo, contadorCentralDSC, contadorCentralJFL, contadorTecladoDSC, contadorTecladoParadox, contadorBateriaIntel, contadorBateriaMoura, contadorSensorParadox, contadorSensorPassivo, contadorSireneGLK, contadorSireneEcp, idClienteLogado) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";

    private static final String SELECT = "select idCompra, totalItens, precoTotalCompra, centralDSC, centralJFL, tecladoDSC, tecladoParadox, bateriaIntel, bateriaMoura, sireneGLK, sireneECP, sensorPlus, sensorPassivo, contadorCentralDSC, contadorCentralJFL, contadorTecladoDSC, contadorTecladoParadox, contadorBateriaIntel, contadorBateriaMoura, contadorSensorParadox, contadorSensorIntel, contadorSireneGLK, contadorSireneEcp, idClienteLogado from compraAtual order by idCompra";

    private static final String DELETE = "delete from compraAtual where idCompra = ?";

    private static final String UPDATE = "update compraAtual set totalItens = ?, precoTotalCompra = ?, centralDSC = ?, centralJFL = ?, tecladoDSC = ?, tecladoParadox = ?, bateriaIntel = ?, bateriaMoura = ?, sireneGLK = ?, sireneECP = ?, sensorPlus = ?, sensorPassivo = ?, contadorCentralDSC = ?, contadorCentralJFL = ?, contadorTecladoDSC = ?, contadorTecladoParadox = ?, contadorBateriaIntel = ?, contadorBateriaMoura = ?, contadorSensorParadox = ?, contadorSensorIntel = ?, contadorSireneGLK = ?, contadorSireneEcp = ?, idClienteLogado where idCompra = ? ";

    private Connection connection = ConexaoBD.conectarBanco();
    private PreparedStatement pstm;

    public void salvar(CompraAtual compraAtual) {
        try {
            Cliente clienteLogado = null;
            
            pstm = connection.prepareStatement(INSERT);
            pstm.setInt(1, compraAtual.getTotalItens());
            pstm.setDouble(2, compraAtual.getPrecoTotalCompra());
            pstm.setDouble(3, compraAtual.getCentralDSC());
            pstm.setDouble(4, compraAtual.getCentralJFL());
            pstm.setDouble(5, compraAtual.getTecladoDSC());
            pstm.setDouble(6, compraAtual.getTecladoParadox());
            pstm.setDouble(7, compraAtual.getBateriaIntel());
            pstm.setDouble(8, compraAtual.getBateriaMoura());
            pstm.setDouble(9, compraAtual.getSireneGLK());
            pstm.setDouble(10, compraAtual.getSirenaECP()) ;
            pstm.setDouble(11, compraAtual.getSensorPlus());
            pstm.setDouble(12, compraAtual.getSensorPassivo());
            pstm.setInt(13, compraAtual.getContadorCentralDSC());
            pstm.setInt(14, compraAtual.getContadorCentralJFL());
            pstm.setInt(15, compraAtual.getContadorTecladoDSC());
            pstm.setInt(16, compraAtual.getContadorTecladoParadox());
            pstm.setInt(17, compraAtual.getContadorBateriaIntel());
            pstm.setInt(18, compraAtual.getContadorBateriaMoura()); 
            pstm.setInt(19, compraAtual.getContadorSensorParadox());
            pstm.setInt(20, compraAtual.getContadorSensorIntel());
            pstm.setInt(21, compraAtual.getContadorSireneGlk());
            pstm.setInt(22, compraAtual.getContadorSireneEcp());
            pstm.setInt(23, compraAtual.getIdClienteCompra()); 
            
            pstm.execute();
            pstm.close();
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar salvar: " + ex.getMessage());
        }
    }

    public void excluir(CompraAtual compraAtual) {
        try {
            pstm = connection.prepareStatement(DELETE);
            pstm.setInt(1, compraAtual.getIdCompra());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar salvar: " + ex.getMessage());
        }

    }
    
    public List<CompraAtual> listar() {
        List<CompraAtual> compraAtuais = new ArrayList<>();
        ResultSet res;
        Connection connection = null;
        PreparedStatement pstm = null;
        try {
            connection = conectarBanco();
            pstm = connection.prepareStatement(SELECT);
            res = pstm.executeQuery();

            while (res.next()) {
                CompraAtual e = new CompraAtual();
                e.setIdCompra(res.getInt("IdCompra"));
                e.setTotalItens(res.getInt("TotalItens"));
                e.setPrecoTotalCompra(res.getDouble("precoTotalCompra"));
                e.setCentralDSC(res.getDouble("centralDSC"));
                e.setCentralJFL(res.getDouble("centralJFL"));
                e.setTecladoDSC(res.getDouble("tecladoDSC"));
                e.setTecladoParadox(res.getDouble("tecladoParadox"));
                e.setBateriaIntel(res.getDouble("bateriaIntel"));
                e.setBateriaMoura(res.getDouble("bateriaMoura"));
                e.setSireneGLK(res.getDouble("sireneGLK"));
                e.setSirenaECP(res.getDouble("sireneECP"));
                e.setSensorPassivo(res.getDouble("sensorPassivo"));
                e.setContadorCentralDSC(res.getInt("contadorCentralDSC"));
                e.setContadorCentralJFL(res.getInt("contadorCentralJFL"));
                e.setContadorTecladoDSC(res.getInt("contadortecladoDSC"));
                e.setContadorTecladoParadox(res.getInt("contadortecladoParadox"));
                e.setContadorBateriaIntel(res.getInt("contadorBateriaIntel"));
                e.setContadorBateriaMoura(res.getInt("contadorBateriaMoura"));
                e.setContadorSensorParadox(res.getInt("contadorSensorParadox"));
                e.setContadorSensorIntel(res.getInt("contadorSensorPassivo"));
                e.setContadorSireneGlk(res.getInt("contadorSireneGLK"));
                e.setContadorSireneEcp(res.getInt("contadorSireneECP"));
                
                compraAtuais.add(e);
            }

        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar buscar os estudantes do banco: " + ex.getMessage());
        }
        return compraAtuais; 
    }
    
}
