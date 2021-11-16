package ch08;

public class Subway {

    int subwayNumber;
    int passengerCount;
    int money;

    public Subway(int subwayNumber){

        this.subwayNumber=subwayNumber;
    }

    public void take(int money){
        this.money += money;
        passengerCount++;
    }

    public void showSubwayInfo(){

        System.out.println(subwayNumber+"수는"+passengerCount+"명"+money+"수입");
    }
}
