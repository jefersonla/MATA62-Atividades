package br.ufba.dcc.mata62.exercicios.state;

/**
 *
 * @author Jeferson Lima
 */
class SemCartao implements Estado {

    public SemCartao() {}

    @Override
    public void inserirCartao(CaixaAutomatico cx) {
        System.out.println("Digite sua senha");
        cx.setEstado(new ComCartao());
    }

    @Override
    public void ejetarCartao(CaixaAutomatico cx) {
        System.out.println("Nao ha cartao na maquina");
    }

    @Override
    public void retirarDinheiro(CaixaAutomatico cx) {
        System.out.println("Voce nao inseriu o cartao");
    }

    @Override
    public void digitarSenha(CaixaAutomatico cx) {
        System.out.println("Insira o cartao primeiro");
    }
    
}
