package Companies;

import java.util.List;

public class BigCompany extends BaseCompany {

    public BigCompany(String name, String address, String nip, float grossIncome, float netIncome, List<String> contractors) {
        super(name, address, nip, grossIncome, netIncome, contractors);
    }
}
