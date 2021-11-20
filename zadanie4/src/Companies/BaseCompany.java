package Companies;

import java.util.List;

public abstract class BaseCompany implements Company {
    private String name;
    private String address;
    private String nip;
    private float grossIncome;
    private float netIncome;
    private List<String> contractors;

    public BaseCompany(String name, String address, String nip, float grossIncome, float netIncome, List<String> contractors) {
        this.name = name;
        this.address = address;
        this.nip = nip;
        this.grossIncome = grossIncome;
        this.netIncome = netIncome;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getNIP() {
        return nip;
    }

    @Override
    public float getGrossIncome() {
        return grossIncome;
    }

    @Override
    public float getNetIncome() {
        return netIncome;
    }

    @Override
    public List<String> getContractors() {
        return contractors;
    }
}
