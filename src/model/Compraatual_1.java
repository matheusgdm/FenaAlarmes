package model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "compraatual")
@NamedQueries({
    @NamedQuery(name = "Compraatual_1.findAll", query = "SELECT c FROM Compraatual_1 c")})
public class Compraatual_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCompra")
    private Integer idCompra;
    @Column(name = "totalItens")
    private Integer totalItens;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precoTotalCompra")
    private BigDecimal precoTotalCompra;
    @Column(name = "centralDSC")
    private Double centralDSC;
    @Column(name = "centralJFL")
    private Double centralJFL;
    @Column(name = "tecladoDSC")
    private Double tecladoDSC;
    @Column(name = "tecladoParadox")
    private Double tecladoParadox;
    @Column(name = "bateriaIntel")
    private Double bateriaIntel;
    @Column(name = "bateriaMoura")
    private Double bateriaMoura;
    @Column(name = "sireneGLK")
    private Double sireneGLK;
    @Column(name = "sireneECP")
    private Double sireneECP;
    @Column(name = "sensorPlus")
    private Double sensorPlus;
    @Column(name = "sensorPassivo")
    private Double sensorPassivo;
    @Column(name = "contadorCentralDSC")
    private Integer contadorCentralDSC;
    @Column(name = "contadorCentralJFL")
    private Integer contadorCentralJFL;
    @Column(name = "contadorTecladoDSC")
    private Integer contadorTecladoDSC;
    @Column(name = "contadorTecladoParadox")
    private Integer contadorTecladoParadox;
    @Column(name = "contadorBateriaIntel")
    private Integer contadorBateriaIntel;
    @Column(name = "contadorBateriaMoura")
    private Integer contadorBateriaMoura;
    @Column(name = "contadorSensorParadox")
    private Integer contadorSensorParadox;
    @Column(name = "contadorSensorPassivo")
    private Integer contadorSensorPassivo;
    @Column(name = "contadorSireneGlk")
    private Integer contadorSireneGlk;
    @Column(name = "contadorSireneEcp")
    private Integer contadorSireneEcp;
    @Basic(optional = false)
    @Column(name = "idClienteLogado")
    private int idClienteLogado;

    public Compraatual_1() {
    }

    public Compraatual_1(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Compraatual_1(Integer idCompra, int idClienteLogado) {
        this.idCompra = idCompra;
        this.idClienteLogado = idClienteLogado;
    }

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        Integer oldIdCompra = this.idCompra;
        this.idCompra = idCompra;
        changeSupport.firePropertyChange("idCompra", oldIdCompra, idCompra);
    }

    public Integer getTotalItens() {
        return totalItens;
    }

    public void setTotalItens(Integer totalItens) {
        Integer oldTotalItens = this.totalItens;
        this.totalItens = totalItens;
        changeSupport.firePropertyChange("totalItens", oldTotalItens, totalItens);
    }

    public BigDecimal getPrecoTotalCompra() {
        return precoTotalCompra;
    }

    public void setPrecoTotalCompra(BigDecimal precoTotalCompra) {
        BigDecimal oldPrecoTotalCompra = this.precoTotalCompra;
        this.precoTotalCompra = precoTotalCompra;
        changeSupport.firePropertyChange("precoTotalCompra", oldPrecoTotalCompra, precoTotalCompra);
    }

    public Double getCentralDSC() {
        return centralDSC;
    }

    public void setCentralDSC(Double centralDSC) {
        Double oldCentralDSC = this.centralDSC;
        this.centralDSC = centralDSC;
        changeSupport.firePropertyChange("centralDSC", oldCentralDSC, centralDSC);
    }

    public Double getCentralJFL() {
        return centralJFL;
    }

    public void setCentralJFL(Double centralJFL) {
        Double oldCentralJFL = this.centralJFL;
        this.centralJFL = centralJFL;
        changeSupport.firePropertyChange("centralJFL", oldCentralJFL, centralJFL);
    }

    public Double getTecladoDSC() {
        return tecladoDSC;
    }

    public void setTecladoDSC(Double tecladoDSC) {
        Double oldTecladoDSC = this.tecladoDSC;
        this.tecladoDSC = tecladoDSC;
        changeSupport.firePropertyChange("tecladoDSC", oldTecladoDSC, tecladoDSC);
    }

    public Double getTecladoParadox() {
        return tecladoParadox;
    }

    public void setTecladoParadox(Double tecladoParadox) {
        Double oldTecladoParadox = this.tecladoParadox;
        this.tecladoParadox = tecladoParadox;
        changeSupport.firePropertyChange("tecladoParadox", oldTecladoParadox, tecladoParadox);
    }

    public Double getBateriaIntel() {
        return bateriaIntel;
    }

    public void setBateriaIntel(Double bateriaIntel) {
        Double oldBateriaIntel = this.bateriaIntel;
        this.bateriaIntel = bateriaIntel;
        changeSupport.firePropertyChange("bateriaIntel", oldBateriaIntel, bateriaIntel);
    }

    public Double getBateriaMoura() {
        return bateriaMoura;
    }

    public void setBateriaMoura(Double bateriaMoura) {
        Double oldBateriaMoura = this.bateriaMoura;
        this.bateriaMoura = bateriaMoura;
        changeSupport.firePropertyChange("bateriaMoura", oldBateriaMoura, bateriaMoura);
    }

    public Double getSireneGLK() {
        return sireneGLK;
    }

    public void setSireneGLK(Double sireneGLK) {
        Double oldSireneGLK = this.sireneGLK;
        this.sireneGLK = sireneGLK;
        changeSupport.firePropertyChange("sireneGLK", oldSireneGLK, sireneGLK);
    }

    public Double getSireneECP() {
        return sireneECP;
    }

    public void setSireneECP(Double sireneECP) {
        Double oldSireneECP = this.sireneECP;
        this.sireneECP = sireneECP;
        changeSupport.firePropertyChange("sireneECP", oldSireneECP, sireneECP);
    }

    public Double getSensorPlus() {
        return sensorPlus;
    }

    public void setSensorPlus(Double sensorPlus) {
        Double oldSensorPlus = this.sensorPlus;
        this.sensorPlus = sensorPlus;
        changeSupport.firePropertyChange("sensorPlus", oldSensorPlus, sensorPlus);
    }

    public Double getSensorPassivo() {
        return sensorPassivo;
    }

    public void setSensorPassivo(Double sensorPassivo) {
        Double oldSensorPassivo = this.sensorPassivo;
        this.sensorPassivo = sensorPassivo;
        changeSupport.firePropertyChange("sensorPassivo", oldSensorPassivo, sensorPassivo);
    }

    public Integer getContadorCentralDSC() {
        return contadorCentralDSC;
    }

    public void setContadorCentralDSC(Integer contadorCentralDSC) {
        Integer oldContadorCentralDSC = this.contadorCentralDSC;
        this.contadorCentralDSC = contadorCentralDSC;
        changeSupport.firePropertyChange("contadorCentralDSC", oldContadorCentralDSC, contadorCentralDSC);
    }

    public Integer getContadorCentralJFL() {
        return contadorCentralJFL;
    }

    public void setContadorCentralJFL(Integer contadorCentralJFL) {
        Integer oldContadorCentralJFL = this.contadorCentralJFL;
        this.contadorCentralJFL = contadorCentralJFL;
        changeSupport.firePropertyChange("contadorCentralJFL", oldContadorCentralJFL, contadorCentralJFL);
    }

    public Integer getContadorTecladoDSC() {
        return contadorTecladoDSC;
    }

    public void setContadorTecladoDSC(Integer contadorTecladoDSC) {
        Integer oldContadorTecladoDSC = this.contadorTecladoDSC;
        this.contadorTecladoDSC = contadorTecladoDSC;
        changeSupport.firePropertyChange("contadorTecladoDSC", oldContadorTecladoDSC, contadorTecladoDSC);
    }

    public Integer getContadorTecladoParadox() {
        return contadorTecladoParadox;
    }

    public void setContadorTecladoParadox(Integer contadorTecladoParadox) {
        Integer oldContadorTecladoParadox = this.contadorTecladoParadox;
        this.contadorTecladoParadox = contadorTecladoParadox;
        changeSupport.firePropertyChange("contadorTecladoParadox", oldContadorTecladoParadox, contadorTecladoParadox);
    }

    public Integer getContadorBateriaIntel() {
        return contadorBateriaIntel;
    }

    public void setContadorBateriaIntel(Integer contadorBateriaIntel) {
        Integer oldContadorBateriaIntel = this.contadorBateriaIntel;
        this.contadorBateriaIntel = contadorBateriaIntel;
        changeSupport.firePropertyChange("contadorBateriaIntel", oldContadorBateriaIntel, contadorBateriaIntel);
    }

    public Integer getContadorBateriaMoura() {
        return contadorBateriaMoura;
    }

    public void setContadorBateriaMoura(Integer contadorBateriaMoura) {
        Integer oldContadorBateriaMoura = this.contadorBateriaMoura;
        this.contadorBateriaMoura = contadorBateriaMoura;
        changeSupport.firePropertyChange("contadorBateriaMoura", oldContadorBateriaMoura, contadorBateriaMoura);
    }

    public Integer getContadorSensorParadox() {
        return contadorSensorParadox;
    }

    public void setContadorSensorParadox(Integer contadorSensorParadox) {
        Integer oldContadorSensorParadox = this.contadorSensorParadox;
        this.contadorSensorParadox = contadorSensorParadox;
        changeSupport.firePropertyChange("contadorSensorParadox", oldContadorSensorParadox, contadorSensorParadox);
    }

    public Integer getContadorSensorPassivo() {
        return contadorSensorPassivo;
    }

    public void setContadorSensorPassivo(Integer contadorSensorPassivo) {
        Integer oldContadorSensorPassivo = this.contadorSensorPassivo;
        this.contadorSensorPassivo = contadorSensorPassivo;
        changeSupport.firePropertyChange("contadorSensorPassivo", oldContadorSensorPassivo, contadorSensorPassivo);
    }

    public Integer getContadorSireneGlk() {
        return contadorSireneGlk;
    }

    public void setContadorSireneGlk(Integer contadorSireneGlk) {
        Integer oldContadorSireneGlk = this.contadorSireneGlk;
        this.contadorSireneGlk = contadorSireneGlk;
        changeSupport.firePropertyChange("contadorSireneGlk", oldContadorSireneGlk, contadorSireneGlk);
    }

    public Integer getContadorSireneEcp() {
        return contadorSireneEcp;
    }

    public void setContadorSireneEcp(Integer contadorSireneEcp) {
        Integer oldContadorSireneEcp = this.contadorSireneEcp;
        this.contadorSireneEcp = contadorSireneEcp;
        changeSupport.firePropertyChange("contadorSireneEcp", oldContadorSireneEcp, contadorSireneEcp);
    }

    public int getIdClienteLogado() {
        return idClienteLogado;
    }

    public void setIdClienteLogado(int idClienteLogado) {
        int oldIdClienteLogado = this.idClienteLogado;
        this.idClienteLogado = idClienteLogado;
        changeSupport.firePropertyChange("idClienteLogado", oldIdClienteLogado, idClienteLogado);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCompra != null ? idCompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compraatual_1)) {
            return false;
        }
        Compraatual_1 other = (Compraatual_1) object;
        if ((this.idCompra == null && other.idCompra != null) || (this.idCompra != null && !this.idCompra.equals(other.idCompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Compraatual_1[ idCompra=" + idCompra + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
