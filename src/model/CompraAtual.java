package model;

public class CompraAtual {

    private int idClienteLogado = 0;
    private int idClienteCompra;
    private int idCompra;
    private int totalItens = 0;
    private double precoTotalCompra = 0.0;
    private double centralDSC = 0;
    private double centralJFL = 0;
    private double tecladoDSC = 0;
    private double tecladoParadox = 0;
    private double bateriaIntel = 0;
    private double bateriaMoura = 0;
    private double sireneGLK = 0;
    private double sirenaECP = 0;
    private double sensorPlus = 0;
    private double sensorPassivo = 0;
    private int contadorCentralDSC = 0;
    private int contadorCentralJFL = 0;
    private int contadorTecladoDSC = 0;
    private int contadorTecladoParadox = 0;
    private int contadorBateriaIntel = 0;
    private int contadorBateriaMoura = 0;
    private int contadorSensorParadox = 0;
    private int contadorSensorIntel = 0;
    private int contadorSensorJFL = 0;
    private int contadorSireneGlk = 0;
    private int contadorSireneEcp = 0;

    public CompraAtual() {
    }

    public int getIdClienteLogado() {
        return idClienteLogado;
    }

    public void setIdClienteLogado(int idClienteLogado) {
        this.idClienteLogado = idClienteLogado;
    }

    
    public int getIdClienteCompra() {
        return idClienteCompra;
    }

    public void setIdClienteCompra(int idClienteCompra) {
        this.idClienteCompra = idClienteCompra;
    }

    
    public CompraAtual(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getTotalItens() {
        return totalItens;
    }

    public void setTotalItens(int totalItens) {
        this.totalItens = totalItens;
    }

    public double getPrecoTotalCompra() {
        return precoTotalCompra;
    }

    public void setPrecoTotalCompra(double precoTotalCompra) {
        this.precoTotalCompra = precoTotalCompra;
    }

    public double getCentralDSC() {
        return centralDSC;
    }

    public void setCentralDSC(double centralDSC) {
        this.centralDSC = centralDSC;
    }

    public double getCentralJFL() {
        return centralJFL;
    }

    public void setCentralJFL(double centralJFL) {
        this.centralJFL = centralJFL;
    }

    public double getTecladoDSC() {
        return tecladoDSC;
    }

    public void setTecladoDSC(double tecladoDSC) {
        this.tecladoDSC = tecladoDSC;
    }

    public double getTecladoParadox() {
        return tecladoParadox;
    }

    public void setTecladoParadox(double tecladoParadox) {
        this.tecladoParadox = tecladoParadox;
    }

    public double getBateriaIntel() {
        return bateriaIntel;
    }

    public void setBateriaIntel(double bateriaIntel) {
        this.bateriaIntel = bateriaIntel;
    }

    public double getBateriaMoura() {
        return bateriaMoura;
    }

    public void setBateriaMoura(double bateriaMoura) {
        this.bateriaMoura = bateriaMoura;
    }

    public double getSireneGLK() {
        return sireneGLK;
    }

    public void setSireneGLK(double sireneGLK) {
        this.sireneGLK = sireneGLK;
    }

    public double getSirenaECP() {
        return sirenaECP;
    }

    public void setSirenaECP(double sirenaECP) {
        this.sirenaECP = sirenaECP;
    }

    public double getSensorPlus() {
        return sensorPlus;
    }

    public void setSensorPlus(double sensorPlus) {
        this.sensorPlus = sensorPlus;
    }

    public double getSensorPassivo() {
        return sensorPassivo;
    }

    public void setSensorPassivo(double sensorPassivo) {
        this.sensorPassivo = sensorPassivo;
    }

    public int getContadorCentralDSC() {
        return contadorCentralDSC;
    }

    public void setContadorCentralDSC(int contadorCentralDSC) {
        this.contadorCentralDSC = contadorCentralDSC;
    }

    public int getContadorCentralJFL() {
        return contadorCentralJFL;
    }

    public void setContadorCentralJFL(int contadorCentralJFL) {
        this.contadorCentralJFL = contadorCentralJFL;
    }

    public int getContadorTecladoDSC() {
        return contadorTecladoDSC;
    }

    public void setContadorTecladoDSC(int contadorTecladoDSC) {
        this.contadorTecladoDSC = contadorTecladoDSC;
    }

    public int getContadorTecladoParadox() {
        return contadorTecladoParadox;
    }

    public void setContadorTecladoParadox(int contadorCentralParadox) {
        this.contadorTecladoParadox = contadorCentralParadox;
    }

    public int getContadorBateriaIntel() {
        return contadorBateriaIntel;
    }

    public void setContadorBateriaIntel(int contadorBateriaIntel) {
        this.contadorBateriaIntel = contadorBateriaIntel;
    }

    public int getContadorBateriaMoura() {
        return contadorBateriaMoura;
    }

    public void setContadorBateriaMoura(int contadorBateriaMoura) {
        this.contadorBateriaMoura = contadorBateriaMoura;
    }

    public int getContadorSensorParadox() {
        return contadorSensorParadox;
    }

    public void setContadorSensorParadox(int contadorSensorParadox) {
        this.contadorSensorParadox = contadorSensorParadox;
    }

    public int getContadorSensorIntel() {
        return contadorSensorIntel;
    }

    public void setContadorSensorIntel(int contadorSensorIntel) {
        this.contadorSensorIntel = contadorSensorIntel;
    }

    public int getContadorSensorJFL() {
        return contadorSensorJFL;
    }

    public void setContadorSensorJFL(int contadorSensorJFL) {
        this.contadorSensorJFL = contadorSensorJFL;
    }

    public int getContadorSireneGlk() {
        return contadorSireneGlk;
    }

    public void setContadorSireneGlk(int contadorSireneGlk) {
        this.contadorSireneGlk = contadorSireneGlk;
    }

    public int getContadorSireneEcp() {
        return contadorSireneEcp;
    }

    public void setContadorSireneEcp(int contadorSireneEcp) {
        this.contadorSireneEcp = contadorSireneEcp;
    }

    @Override
    public String toString() {
        return "CompraAtual{" + "idCompra=" + idCompra + ", totalItens=" + totalItens + ", precoTotalCompra=" + precoTotalCompra + ", centralDSC=" + centralDSC + ", centralJFL=" + centralJFL + ", tecladoDSC=" + tecladoDSC + ", tecladoParadox=" + tecladoParadox + ", bateriaIntel=" + bateriaIntel + ", bateriaMoura=" + bateriaMoura + ", sireneGLK=" + sireneGLK + ", sirenaECP=" + sirenaECP + ", sensorPlus=" + sensorPlus + ", sensorPassivo=" + sensorPassivo + ", contadorCentralDSC=" + contadorCentralDSC + ", contadorCentralJFL=" + contadorCentralJFL + ", contadorTecladoDSC=" + contadorTecladoDSC + ", contadorTecladoParadox=" + contadorTecladoParadox + ", contadorBateriaIntel=" + contadorBateriaIntel + ", contadorBateriaMoura=" + contadorBateriaMoura + ", contadorSensorParadox=" + contadorSensorParadox + ", contadorSensorIntel=" + contadorSensorIntel + ", contadorSensorJFL=" + contadorSensorJFL + ", contadorSireneGlk=" + contadorSireneGlk + ", contadorSireneEcp=" + contadorSireneEcp + '}';
    }

}
