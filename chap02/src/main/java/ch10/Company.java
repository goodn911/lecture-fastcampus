package ch10;

public class Company {

    private static Company instance = new Company();

    private Company(){

    }
    public static Company getInctance(){
        if(instance==null){
            instance = new Company();
        }
        return instance;
    }
}
