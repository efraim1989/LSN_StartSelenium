package oop;

public class Chain {

    public static void main(String[] args) {

        int a, b = 0;
        a = sum(3, 4);
        b = a + sum(2,6);

        String str = "    Hello, World!   ";
 //      str = str.trim();
 //      str = str.toLowerCase();
 //       System.out.println(str);

        char c = str.toLowerCase().trim().substring(3,8).charAt(1);
        System.out.println(c);
        System.out.println(str);
    }







    public static int sum(int x, int y){
        return x+y;

    }


}
