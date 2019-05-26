package Principal;

public class Mundo {
    private String mensagem;
    
    public Mundo(String mensagem){
        this.mensagem = mensagem;
    }
    
    public void gritar(){
        System.out.println(mensagem.toUpperCase());
    }
}
