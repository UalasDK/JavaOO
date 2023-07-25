public class Data {
    private int dia;
    private int mes;
    private int ano; 

    Data() {
        //Construtor da classe
    }

    void setData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    String getData() {
        String data = dia + "/" + mes + "/" + ano;
        return data;
    }
}
