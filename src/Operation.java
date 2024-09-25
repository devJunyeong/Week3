public class Operation {
    public static void main(String[] args) {

        int result = (5 + 3) * 2; // 16

        int x = 5;
        int y = ++x;

        System.out.println("Y: " + y);

        int z = ++x;
        System.out.println("Z: " + z);

        boolean flag = false;
        boolean notFlag = !flag;

        System.out.println("notFlag = " + notFlag);
        boolean flag2 = !notFlag;
        System.out.println("flag2 = " + flag2);

        int a = 10;
        int b = 3;
        int product =  a * b;
        int quotient = a / b;
        int remainder = a % b;

        int bit1 = 4 << 2;
        int bit2 = 16 >> 2;

        System.out.println("bit1 = " + bit1);
        System.out.println("bit2 = " + bit2);

        boolean isLess = (5 < 10);
        boolean isNotEqual = (10 >= 10);

        boolean isGEqual = (5 == 5);
        boolean isLessEqual = (5 != 3);


    }
}
