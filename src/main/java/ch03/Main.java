package ch03;

import java.util.Scanner;

public class Main {
    public static void main(String []args){

        int num1 = 1;
        int sum=0;
        String str = "ABCDEFG";

        System.out.println(str.substring(3));
        System.out.println(str.substring(3,6));

        while (num1<=10){
            sum += num1;
            num1++;

        }
        System.out.println(sum);
        System.out.println(num1);

        // Scanner scanner = new Scanner(System.in);

        int input;
        int sum1=0;

        /*input= scanner.nextInt();

        while (input !=0){

            sum1+=input;
            input=scanner.nextInt();
        }
        System.out.println(sum1);



        do{
            input =scanner.nextInt();
            sum1+=input;

        }while (input!=0);
            System.out.println(sum1);
        */
        int count =1;
        int sum2=0;

        for(int i =0 ; i<10;i++){
            sum2+=count;
            count++;
        }
        System.out.println(sum2);
        System.out.println(count);

//        int dan =2;
//        int count1 = 0;

//        for(dan =2 ; dan<10;dan++){
//            for(int i = 1;i<10;i++){
//                count1 = dan*i;
//
//                System.out.println(dan +"단 : "+ dan+"*"+i+":" +count1);
//
//            }
//        }
        int dan=2;
        int count1=1;

        while (dan<10){

            count1= 1;     // 밑에서 이미 10이 되었기에 초기화 해서 다시 들어가야함
            while (count1<10){
                System.out.println(dan +"x"+  count1 +"="+dan*count1);
                count1++;

            }
            dan++;
            System.out.println();
        }

        int num2 =0;
        for(num2=0;num2<100;num2++){
            if( (num2 % 3) !=0 ){
                continue;

            }
            System.out.println(num2);
        }

    }
}

