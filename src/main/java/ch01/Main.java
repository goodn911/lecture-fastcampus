package ch01;

public class Main {
    public static void main (String [] args){
            int num = 10;
            int bNum = 0B1010;
            int oNum = 012;
            int xNum = 0XA;

        System.out.println(num);
        System.out.println(bNum);
        System.out.println(oNum);
        System.out.println(xNum);

        byte bnum = 127;
//        int num = 12345678900;
        long lNum = 12345678900L;
        System.out.println(lNum);

        double dnum =1;
        float fnum = 3.14f;

        System.out.println(dnum);
        System.out.println(fnum);


        for(int i=0; i<10000;i++){
            dnum+=0.1;
        }

        System.out.println(dnum);


        char ch1 = 'a';
        System.out.println(ch1);
        System.out.println((int) ch1);

        char ch2 = 66;
        System.out.println(ch2);
        System.out.println((char)ch2);

        int ch3 =98;
        System.out.println(ch3);
        System.out.println((char) ch3);

        double dd = 1.2;
        float ff =0.9f;

        int ii = (int)dd+(int)ff;
        int ii2 =(int)(dd+ff);

        System.out.println(ii);
        System.out.println(ii2);

        int myNum = 10;
        int yourNum =  20;

        myNum +=yourNum;
        System.out.println(myNum);

        int gameScore =150;
        int lastScore = gameScore++;  //gameScore +=1;  gameScore = gameScore +1;
        System.out.println(lastScore);
        System.out.println(gameScore);

        int num1 =5;
        int num2 =10;

        System.out.println(num1 |num2);
        System.out.println(num1 &num2);
        System.out.println(num1 ^num2);
        System.out.println( ~num2);

    }
}
