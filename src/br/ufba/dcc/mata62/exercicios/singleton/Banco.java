package br.ufba.dcc.mata62.exercicios.singleton;

/**
 *
 * @author Jeferson Lima
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CaixaAutomatico caixa = new CaixaAutomatico();
        CaixaAutomatico caixa = CaixaAutomatico.getInstance();
        
        
        // Mensagens de erro
        caixa.ejetarCartao();
        caixa.digitarSenha();
        caixa.retirarDinheiro();
        
        // Muda o estado | SemCartao -> ComCartao
        caixa.inserirCartao();
        
        // Mensagens de erro
        caixa.inserirCartao();
        caixa.digitarSenha();
        caixa.retirarDinheiro();
        
        // Muda o estado | ComCartao -> SemCartao
        caixa.ejetarCartao();
        
        // Muda o estado | SemCartao -> ComCartao
        caixa.inserirCartao();
        
        // Muda o estado | ComCartao -> ComSenha
        caixa.digitarSenha();
                
        // Mensagens de erro
        caixa.inserirCartao();
        caixa.digitarSenha();
        
        // Muda o estado | ComSenha -> SemCartao
        caixa.ejetarCartao();
        
        // Muda o estado | SemCartao -> ComCartao
        caixa.inserirCartao();
        
        // Muda o estado | ComCartao -> ComSenha
        caixa.digitarSenha();
        
        // Muda o estado | ComSenha -> SemCartao
        caixa.retirarDinheiro();
    }
    
}
