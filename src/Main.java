import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Accounts accounts =  new Accounts();
        accounts.setToalMoney(BigDecimal.valueOf(0));


        person a1 = new person("pipi", accounts, BigDecimal.valueOf(50), BigDecimal.valueOf(30));
        person a2 = new person("pipi", accounts, BigDecimal.valueOf(20), BigDecimal.valueOf(30));
        person a3 = new person("pipi", accounts, BigDecimal.valueOf(10), BigDecimal.valueOf(80));
        new Thread(a1).start();
        new Thread(a2).start();
        new Thread(a3).start();


        //Accounts accounts = new Accounts();

        accounts.setToalMoney(BigDecimal.valueOf(23.44));
        accounts.takeMoney(BigDecimal.valueOf(1.44));

        BigDecimal a = BigDecimal.valueOf(1.00);

        BigDecimal b = BigDecimal.valueOf(2.00);

        System.out.println(b.compareTo(a));
    }
}

