package br.ufba.dcc.mata62.exercicios.state;

/**
 *
 * @author Jeferson Lima
 */
class ComSenha implements Estado {

    public ComSenha() {}

    @Override
    public void inserirCartao(CaixaAutomatico cx) {
         System.out.println("Voce so pode inserir um cartao por vez");
    }

    @Override
    public void ejetarCartao(CaixaAutomatico cx) {
        System.out.println("Aqui esta o cartao");
        cx.setEstado(new SemCartao());
    }

    @Override
    public void retirarDinheiro(CaixaAutomatico cx) {
        System.out.println("Aqui esta seu dinheiro");
        System.out.println("Aqui esta seu cartao");
        cx.setEstado(new SemCartao());
    }

    @Override
    public void digitarSenha(CaixaAutomatico cx) {
        System.out.println("Voce ja digitou sua senha");
    }
    
}
