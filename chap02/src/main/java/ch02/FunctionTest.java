package ch02;


public class FunctionTest {

    public  static  int addNum(int num1,int num2){  //매개변수 반환값있음
        int result;
        result = num1 + num2;
        return result;
    }

    public  static void sayHello(String greeting){  //매개변수만 있음
        System.out.println(greeting);
    }

    public static int calSum(){  //반환값만 있음
        int sum = 0;
        int i;

        for(i=0;i<=100;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[]args){
        int n1 = 10;
        int n2 =20;

        int total = addNum(n1,n2);
        System.out.println(total);

        sayHello("안녕");

        total = calSum();
        System.out.println(total);
    }
}
