package br.ufba.dcc.mata62.exercicios.singleton;

/**
 *
 * @author Jeferson Lima
 */
public class CaixaAutomatico {
    private Estado meuestado;
    private static CaixaAutomatico instance = null;
    
    private CaixaAutomatico(){
        meuestado = SemCartao.getInstance();
    }
    
    public static CaixaAutomatico getInstance(){
        if(instance == null){
            instance = new CaixaAutomatico();
        }
        
        return instance;
    }
    
    public void setEstado(Estado novoestado){
        meuestado = novoestado;
    }
    
    public void inserirCartao(){
        meuestado.inserirCartao();
    }
    
    public void ejetarCartao(){
        meuestado.ejetarCartao();
    }
    
    public void retirarDinheiro(){
        meuestado.retirarDinheiro();
    }
    
    public void digitarSenha(){
        meuestado.digitarSenha();
    }
}
