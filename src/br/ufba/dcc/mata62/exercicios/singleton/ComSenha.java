package br.ufba.dcc.mata62.exercicios.singleton;

/**
 *
 * @author Jeferson Lima
 */
class ComSenha implements Estado {
    private static ComSenha instance = null;
        
    private ComSenha() {}

    public static ComSenha getInstance(){
        if(instance == null){
            instance = new ComSenha();
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
        System.out.println("Aqui esta seu dinheiro");
        System.out.println("Aqui esta seu cartao");
        CaixaAutomatico cx = CaixaAutomatico.getInstance();
        cx.setEstado(SemCartao.getInstance());
    }

    @Override
    public void digitarSenha() {
        System.out.println("Voce ja digitou sua senha");
    }
    
}
