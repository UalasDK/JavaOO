public class TestaConta {
    public static void main(String[] args) {
        Conta novaConta = new Conta("Raquel");
        Data data = new Data();
        int totalContas = Conta.getTotalDeContas();

        //Setando atributos da Conta
        novaConta.setTitular("Gabriel");
        novaConta.setSaldo(300);
        novaConta.setDataAbertura(data, 15, 07, 2021);
        
        System.out.println("\n---------------------------------------\n" + "ID da conta: " + novaConta.getId() + "\n---------------------------------------");

        novaConta.deposita(100);

        System.out.println("Seu saldo atual é de R$" + novaConta.getSaldo());
        System.out.println("Seu rendimento mensal é RS" + novaConta.getRendimento());

        if (novaConta.saca(70))
            System.out.println("Saque realizado com sucesso");
        else
            System.out.println("Saldo insuficiente, saque não efetivado");

        System.out.println("Seu saldo atual é: R$" + novaConta.getSaldo());
        System.out.println("Seu rendimento mensal é RS" + novaConta.getRendimento());

        System.out.println(novaConta.recuperaDadosParaImpressao());

        System.out.println("\n\n\nTotal de contas criadas: " + totalContas);

        System.out.println(novaConta.getDadosConta());
 
    }
}