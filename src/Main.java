public class Main {
    public static void main(String[] args) {
        //Declarations
        String num, sqr, cub;

        int num1, num2, num3, num4, num5,
                num6, num7, num8, num9, num10;
        double sqr2;


//Input
        num="Number";
        sqr="Square";
        cub="Cube";


//Process


        //Math.pow(number, exponent);

        num1= 1;
        num2= 2;
        num3= 3;
        num4= 4;
        num5= 5;
        num6=6;
        num7=7;
        num8=8;
        num9=9;
        num10=10;
        sqr2= Math.pow(2,2);

//Output

        System.out.printf("%10s  %10s  %10s\n",num,sqr,cub);
        System.out.println(); //line break
        System.out.printf("%10d  %10.0f  %10.0f\n",num1, Math.pow(num1,2), Math.pow(num1,3));


        System.out.printf("%10d  %10.0f  %10.0f\n",num2,sqr2, Math.pow(num2,3));
        System.out.printf("%10d  %10.0f  %10.0f\n",num3,Math.pow(num3,2), Math.pow(num3,3));
        System.out.printf("%10d  %10.0f  %10.0f\n",num4,Math.pow(num4,2), Math.pow(num4,3));
        System.out.printf("%10d  %10.0f  %10.0f\n",num5,Math.pow(num5,2), Math.pow(num5,3));
        System.out.printf("%10d  %10.0f  %10.0f\n",num6,Math.pow(num6,2), Math.pow(num6,3));
        System.out.printf("%10d  %10.0f  %10.0f\n",num7,Math.pow(num7,2), Math.pow(num7,3));
        System.out.printf("%10d  %10.0f  %10.0f\n",num8,Math.pow(num8,2), Math.pow(num8,3));
        System.out.printf("%10d  %10.0f  %10.0f\n",num9,Math.pow(num9,2), Math.pow(num9,3));
        System.out.printf("%10d  %10.0f  %10.0f\n",num10,Math.pow(num10,2), Math.pow(num10,3));


    }
}