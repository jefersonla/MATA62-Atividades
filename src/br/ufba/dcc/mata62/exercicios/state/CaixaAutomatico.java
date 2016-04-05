package br.ufba.dcc.mata62.exercicios.state;

/**
 *
 * @author Jeferson Lima
 */
public class CaixaAutomatico {
    private Estado meuestado;
    
    public CaixaAutomatico(){
        meuestado = new SemCartao();
    }
    
    public void setEstado(Estado novoestado){
        meuestado = novoestado;
    }
    
    public void inserirCartao(){
        meuestado.inserirCartao(this);
    }
    
    public void ejetarCartao(){
        meuestado.ejetarCartao(this);
    }
    
    public void retirarDinheiro(){
        meuestado.retirarDinheiro(this);
    }
    
    public void digitarSenha(){
        meuestado.digitarSenha(this);
    }
}
