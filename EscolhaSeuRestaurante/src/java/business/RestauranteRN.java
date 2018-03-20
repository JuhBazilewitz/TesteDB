package java.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RestauranteRN {

    private String restauranteVotado = new String();
    private List<String> listaRestaurantesVotados;

    public RestauranteRN(){
        listaRestaurantesVotados = new ArrayList<>();
    }
    
    public Boolean realizaVotacao(String restaurante, String nomeProfissional) {
        Boolean bol = false;
        if(verificaRestaurantes(restaurante)){
            armazenaVoto(restaurante, nomeProfissional);
            bol = true;
        }
        return bol;
    }

    public String obtemDiaHoje() {
        Date date = new Date();
        date.getDate();
        return date.toString();
    }

    public Boolean verificaRestaurantes(String nomeRestaurante) {
        Boolean bol = false;
        if (listaRestaurantesVotados != null) {
            for (int aux = 0; aux <= listaRestaurantesVotados.size(); aux++) {
                if (listaRestaurantesVotados.contains(nomeRestaurante)) {
                    bol = false;
                } else {
                    bol = true;
                }
            }
        }
        return bol;
    }

    public void armazenaVoto(String nomeRestaurante, String nomeProfissional) {
        if(listaRestaurantesVotados == null){
            listaRestaurantesVotados = new ArrayList<>();
        }
        
        this.listaRestaurantesVotados.add(nomeRestaurante);
        System.out.println(listaRestaurantesVotados.toString() + " " + nomeProfissional);
        
    }

    public String getRestauranteVotado() {
        return restauranteVotado;
    }

    public void setRestauranteVotado(String restauranteVotado) {
        this.restauranteVotado = restauranteVotado;
    }
}
