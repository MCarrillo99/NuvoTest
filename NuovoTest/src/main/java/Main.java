import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Conto conto01 = new Conto(20000);
        Conto conto02 = new Conto(120000);
        Conto conto03 = new Conto(2000);

        Banca bancaCentrale = new Banca();

        List<Conto> conti = new ArrayList<>();
        conti.add(conto01);
        conti.add(conto02);
        conti.add(conto03);

        bancaCentrale.setContiCorrente(conti);

        bancaCentrale.getContiCorrente().stream().forEach(conto -> {
            if (conto.getSaldo() >= 3000){
                System.out.println(conto);
            }
        });
    }
}
