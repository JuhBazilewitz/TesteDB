package java.entity;

public class Restaurante {
    
    private String nome = new String();
    private Integer id;
    private String nomeFuncionario = new String();

    public Restaurante(String nome){
        this.nome = nome;
    }
    
    public Restaurante(){
        this.nome = "Apetito";
        this.nomeFuncionario = "Sandro";
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
     public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }
}
