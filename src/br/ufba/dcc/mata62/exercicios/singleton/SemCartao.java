package br.ufba.dcc.mata62.exercicios.singleton;

/**
 *
 * @author Jeferson Lima
 */
class SemCartao implements Estado {
    private static SemCartao instance = null;
    
    private SemCartao() {}

    public static SemCartao getInstance(){
        if(instance == null){
            instance = new SemCartao();
        }
        
        return instance;
    }
    
    @Override
    public void inserirCartao() {
        System.out.println("Digite sua senha");
        CaixaAutomatico cx = CaixaAutomatico.getInstance();
        cx.setEstado(ComCartao.getInstance());
    }

    @Override
    public void ejetarCartao() {
        System.out.println("Nao ha cartao na maquina");
    }

    @Override
    public void retirarDinheiro() {
        System.out.println("Voce nao inseriu o cartao");
    }

    @Override
    public void digitarSenha() {
        System.out.println("Insira o cartao primeiro");
    }
    
}
