import java.util.List;

public class Banca {

    private List<Conto> contiCorrente;
    private String nome;
    private String sedeDellaFiliale;

    public List<Conto> getContiCorrente() {
        return contiCorrente;
    }

    public void setContiCorrente(List<Conto> contiCorrente) {
        this.contiCorrente = contiCorrente;
    }

    public String getSedeDellaFiliale() {
        return sedeDellaFiliale;
    }

    public void setSedeDellaFiliale(String sedeDellaFiliale) {
        this.sedeDellaFiliale = sedeDellaFiliale;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
