package aula07;

class ObraDigital extends Obra {

    private String block;
    private String adress;

    ObraDigital(String nome, String autor, double pr, String block, String adress){
    super(nome, autor, pr);
    block = this.block;
    adress = this.adress;
    
    }

    public String getBlock(){return block;}
    public String getAdress(){return adress;}





}
