public class Conto {

    private double saldo;

    public Conto(double saldo){
        this.saldo = saldo;
    }

    public double preleva(double cifraDaPrelevare){
        this.saldo -= cifraDaPrelevare;
        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conto{" +
                "saldo=" + saldo +
                '}';
    }
}
