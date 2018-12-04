package View;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
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
@Table(name = "cadastrocliente", catalog = "fenaalarmes", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cadastrocliente.findAll", query = "SELECT c FROM Cadastrocliente c")
    , @NamedQuery(name = "Cadastrocliente.findByIdcadastroCliente", query = "SELECT c FROM Cadastrocliente c WHERE c.idcadastroCliente = :idcadastroCliente")
    , @NamedQuery(name = "Cadastrocliente.findByNome", query = "SELECT c FROM Cadastrocliente c WHERE c.nome = :nome")
    , @NamedQuery(name = "Cadastrocliente.findBySobrenome", query = "SELECT c FROM Cadastrocliente c WHERE c.sobrenome = :sobrenome")
    , @NamedQuery(name = "Cadastrocliente.findByEmail", query = "SELECT c FROM Cadastrocliente c WHERE c.email = :email")
    , @NamedQuery(name = "Cadastrocliente.findByTelefone2", query = "SELECT c FROM Cadastrocliente c WHERE c.telefone2 = :telefone2")
    , @NamedQuery(name = "Cadastrocliente.findByTelefone1", query = "SELECT c FROM Cadastrocliente c WHERE c.telefone1 = :telefone1")
    , @NamedQuery(name = "Cadastrocliente.findBySenha", query = "SELECT c FROM Cadastrocliente c WHERE c.senha = :senha")
    , @NamedQuery(name = "Cadastrocliente.findByNascionalidade", query = "SELECT c FROM Cadastrocliente c WHERE c.nascionalidade = :nascionalidade")})
public class Cadastrocliente implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcadastroCliente")
    private Integer idcadastroCliente;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "sobrenome")
    private String sobrenome;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Column(name = "telefone2")
    private Integer telefone2;
    @Basic(optional = false)
    @Column(name = "telefone1")
    private int telefone1;
    @Basic(optional = false)
    @Column(name = "senha")
    private String senha;
    @Basic(optional = false)
    @Column(name = "nascionalidade")
    private String nascionalidade;

    public Cadastrocliente() {
    }

    public Cadastrocliente(Integer idcadastroCliente) {
        this.idcadastroCliente = idcadastroCliente;
    }

    public Cadastrocliente(Integer idcadastroCliente, String nome, String sobrenome, String email, int telefone1, String senha, String nascionalidade) {
        this.idcadastroCliente = idcadastroCliente;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.telefone1 = telefone1;
        this.senha = senha;
        this.nascionalidade = nascionalidade;
    }

    public Integer getIdcadastroCliente() {
        return idcadastroCliente;
    }

    public void setIdcadastroCliente(Integer idcadastroCliente) {
        Integer oldIdcadastroCliente = this.idcadastroCliente;
        this.idcadastroCliente = idcadastroCliente;
        changeSupport.firePropertyChange("idcadastroCliente", oldIdcadastroCliente, idcadastroCliente);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        String oldSobrenome = this.sobrenome;
        this.sobrenome = sobrenome;
        changeSupport.firePropertyChange("sobrenome", oldSobrenome, sobrenome);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public Integer getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(Integer telefone2) {
        Integer oldTelefone2 = this.telefone2;
        this.telefone2 = telefone2;
        changeSupport.firePropertyChange("telefone2", oldTelefone2, telefone2);
    }

    public int getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(int telefone1) {
        int oldTelefone1 = this.telefone1;
        this.telefone1 = telefone1;
        changeSupport.firePropertyChange("telefone1", oldTelefone1, telefone1);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        String oldSenha = this.senha;
        this.senha = senha;
        changeSupport.firePropertyChange("senha", oldSenha, senha);
    }

    public String getNascionalidade() {
        return nascionalidade;
    }

    public void setNascionalidade(String nascionalidade) {
        String oldNascionalidade = this.nascionalidade;
        this.nascionalidade = nascionalidade;
        changeSupport.firePropertyChange("nascionalidade", oldNascionalidade, nascionalidade);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcadastroCliente != null ? idcadastroCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cadastrocliente)) {
            return false;
        }
        Cadastrocliente other = (Cadastrocliente) object;
        if ((this.idcadastroCliente == null && other.idcadastroCliente != null) || (this.idcadastroCliente != null && !this.idcadastroCliente.equals(other.idcadastroCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Cadastrocliente[ idcadastroCliente=" + idcadastroCliente + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
