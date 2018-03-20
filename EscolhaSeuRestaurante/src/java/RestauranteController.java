package java;

import java.business.RestauranteRN;
import java.entity.Restaurante;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class RestauranteController {
    
    private String nomeProfissional = new String();
    private Restaurante restaurante = new Restaurante();
    private String option = new String();

    private final RestauranteRN restauranteRN = new RestauranteRN();

    public void init(){
        restauranteRN.obtemDiaHoje();
        limpar();
    }
    
    public void votar(){
        if(restauranteRN.realizaVotacao(restaurante.getNome(), nomeProfissional)){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Info", "Você votou no restaurante: "+restaurante.getNome()));
        } else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Info", "O restaurante: "+restaurante.getNome()+" já foi votado. Por favor, escolha outro."));
        }
        limpar();
    }
    
    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }
    
    public String getNomeProfissional() {
        return nomeProfissional;
    }

    public void setNomeProfissional(String nomeProfissional) {
        this.nomeProfissional = nomeProfissional;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    private void limpar() {;
        setNomeProfissional(null);
    }
    
}
