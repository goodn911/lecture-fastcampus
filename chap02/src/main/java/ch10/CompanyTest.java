package ch10;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[]args){

    Company company1 = Company.getInctance();
    Company company2 = Company.getInctance();

    Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(company1);
        System.out.println(company2);
}
}
