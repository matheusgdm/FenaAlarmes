package teste;

import Repository.CompraAtualRep;
import model.CompraAtual;


public class Test {
    public static void main(String[] args) {
        CompraAtual c = new CompraAtual(); 
        c.setContadorCentralDSC(6);
        
        CompraAtualRep eRep = new CompraAtualRep();
        eRep.salvar(c);  
        
    }
}
