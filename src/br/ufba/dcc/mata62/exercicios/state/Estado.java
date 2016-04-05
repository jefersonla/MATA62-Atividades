package br.ufba.dcc.mata62.exercicios.state;

/**
 *
 * @author Jeferson Lima
 */
public interface Estado {
    public void inserirCartao(CaixaAutomatico cx);
    public void ejetarCartao(CaixaAutomatico cx);
    public void retirarDinheiro(CaixaAutomatico cx);
    public void digitarSenha(CaixaAutomatico cx);
}
