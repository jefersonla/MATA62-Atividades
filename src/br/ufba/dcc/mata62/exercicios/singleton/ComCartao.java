package br.ufba.dcc.mata62.exercicios.singleton;

/**
 *
 * @author Jeferson Lima
 */
class ComCartao implements Estado {
    private static ComCartao instance;
    
    private ComCartao() {}

    public static ComCartao getInstance(){
        if(instance == null){
            instance = new ComCartao();
        }
        
        return instance;
    }
    
    @Override
    public void inserirCartao() {
        System.out.println("Voce so pode inserir um cartao por vez");
    }

    @Override
    public void ejetarCartao() {
        System.out.println("Aqui esta o cartao");
        CaixaAutomatico cx = CaixaAutomatico.getInstance();
        cx.setEstado(SemCartao.getInstance());
    }

    @Override
    public void retirarDinheiro() {
        System.out.println("Voce nao digitou sua senha");
    }

    @Override
    public void digitarSenha() {
        System.out.println("Senha digitada corretamente");
        CaixaAutomatico cx = CaixaAutomatico.getInstance();
        cx.setEstado(ComSenha.getInstance());
    }
    
}
