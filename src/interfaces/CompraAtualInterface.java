package interfaces;

import Repository.CompraAtualRep;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.CompraAtual;

public class CompraAtualInterface extends AbstractTableModel {

    private CompraAtualRep crep = new CompraAtualRep();
    private List<CompraAtual> compras = crep.listar(); 
    
    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
