
public class Cachorro extends IdAbstract{
    private String cor;
    private String porte;
    private int idade;
    private Raca raca;

    public Cachorro(){}
    public Cachorro(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return this.cor;
    }
    public String getPorte(){

        return this.porte;
    }
    public int getIdade(){
        return this.idade;
    }
    public Raca getRaca(){
        return this.raca;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
    public void setPorte(String porte){

        this.porte = porte;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setRaca(Raca raca){
        this.raca = raca;
    }

    public Cachorro(String cor, String porte, int idade, Raca raca){
        this.cor = cor;
        this.porte = porte;
        this.idade = idade;
        this.raca = raca;
    }
}