package Companies;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class HoldingCompany extends BaseCompany {
    protected List<Company> childrens = new ArrayList<>();

    public HoldingCompany(String name, String address, String nip, float grossIncome, float netIncome, List<String> contractors) {
        super(name, address, nip, grossIncome, netIncome, contractors);
    }
    
    public void add(Company children) {
        childrens.add(children);
    }

    public void remove(Company children) {
        childrens.remove(children);
    }

    public void clear() {
        childrens.clear();
    }

    public void awardPrizes() {
        for (Company company : childrens) {
            if (allOddNumbers(company.getNIP())) {
                System.out.println("The " + company.getName() + " receives a prize of PLN 50!");
            }

            if (halfNumbersDiv3(company.getNIP())) {
                System.out.println("The " + company.getName() + " receives a prize of PLN 100!");
            }

            if (nipContainCurrentDate(company.getNIP())) {
                System.out.println("The " + company.getName() + " receives a prize of PLN 15!");
            }

            if (nipEqualsDateMultipled3(company.getNIP())) {
                System.out.println("The " + company.getName() + " receives a prize of PLN 550!");
            }

            if (differencesEqualTo50(company.getNIP())) {
                System.out.println("The " + company.getName() + " receives a prize of PLN 200!");
            }
        }
    }

    private boolean allOddNumbers(String nip) {
        for (int i = 0; i < nip.length(); i++) {
            if(Character.getNumericValue(nip.charAt(i)) % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    private boolean halfNumbersDiv3(String nip) {
        int num = 0;
        for (int i = 0; i < nip.length(); i++) {
            if(Character.getNumericValue(nip.charAt(i)) % 3 == 0) {
                num++;
            }
        }
        return num >= nip.length() / 2;
    }

    private boolean nipContainCurrentDate(String nip) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMdd");
        LocalDateTime now = LocalDateTime.now();  
        String date = dtf.format(now);

        return nip.contains(date);
    }

    private boolean nipEqualsDateMultipled3(String nip) {
        DateTimeFormatter dtfM = DateTimeFormatter.ofPattern("MM");
        DateTimeFormatter dtfD = DateTimeFormatter.ofPattern("dd");
        LocalDateTime now = LocalDateTime.now();  

        int dateSum = Integer.parseInt(dtfM.format(now)) + Integer.parseInt(dtfD.format(now));
        
        int nipSum = 0;
        for (int i = 0; i < nip.length(); i++) {
            nipSum += Character.getNumericValue(nip.charAt(i));
        }

        return dateSum * 3 == nipSum;
    }

    private boolean differencesEqualTo50(String nip) {
        int nipSum = 0;
        for (int i = 1; i < nip.length(); i++) {
            nipSum += Math.abs(Character.getNumericValue(nip.charAt(i-1)) - Character.getNumericValue(nip.charAt(i)));
        }

        return nipSum > 50;
    }
}
