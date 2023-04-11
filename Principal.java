public class Principal {
        public static void main(String[] args) {
            ContaBancaria conta = new ContaBancaria();
            conta.setNumeroConta(0221);
            conta.setTitular("Julia Spornraft");
            conta.setSaldo(500);

            System.out.println("Saldo atual: "+conta.getSaldo());

            conta.depositaValor(500);

            System.out.println("Saldo atual:"+conta.getSaldo());

            conta.sacaValor(700);
            System.out.println("Saldo atual:"+conta.getSaldo());
        }
}
