public class Conta {
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private Data dataAbertura = new Data();
    private static int totalDeContas;
    private static int id;

    //INICIO CONSTRUTORES
    Conta(String nomeTitular) {
        this.titular = nomeTitular;
        Conta.totalDeContas = Conta.totalDeContas + 1;
        Conta.id = Conta.id + 1;
        System.out.println("******************************************\nA nova conta foi criada: ***CONSTRUCT***\n******************************************\n");
    }

    Conta() {
        Conta.totalDeContas = Conta.totalDeContas + 1;
        Conta.id = Conta.id + 1;
        System.out.println("******************************************\nA nova conta foi criada: ***CONSTRUCT***\n******************************************\n");
    }
    //FIM CONSTRUTORES

    //início Gets e Setters
    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }

    String getDadosConta() {
        String dados = "\n\nTitular: " + this.titular;
        dados += "\nNumero: " + this.numero;
        dados += "\nAgência: " + this.agencia;
        dados += "\nData de abertura da conta: " + this.dataAbertura.getData();

        return dados;
    }

    void setTitular(String nomeTitular) {
        this.titular = nomeTitular;
    }

    void setSaldo(double Saldo) {
        this.saldo = Saldo;
    }

    double getSaldo() {
        return this.saldo;
    }



    void setDataAbertura(Data objDataAbertura, int dia, int mes, int ano) {
        this.dataAbertura = objDataAbertura;
        this.dataAbertura.setData(dia, mes, ano);
    }

    double getRendimento() {
        return (this.saldo * 0.1);
    }

    int getId() {
        return Conta.id;
    }
    //Fim Gets e Setters


    //Outros metódos
    boolean saca(double valor) {
        if(this.saldo < valor)
            return false;
        else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }

    void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    String recuperaDadosParaImpressao() {
        String dados = "\n\nTitular: " + this.titular;
        dados += "\nNumero: " + this.numero;
        dados += "\nAgência: " + this.agencia;
        dados += "\nData de abertura da conta: " + this.dataAbertura.getData();
        dados += "\n\nSaldo atual: " + this.saldo;
        dados += "\nRendimento: " + getRendimento();

        return dados;
    }

}