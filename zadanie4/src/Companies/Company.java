package Companies;

import java.util.List;

public interface Company {
    String getName();
    String getAddress();
    String getNIP();
    float getGrossIncome();
    float getNetIncome();
    List<String> getContractors();
}
