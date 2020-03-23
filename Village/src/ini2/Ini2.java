package ini2;

public class Ini2 {

    public void exec(){
        //815 908
        int a = 815;
        int b = 908;

        System.out.print(hipotenusa(a, b));
    }

    static double hipotenusa(int a, int b) {
        int exponent = 2;
        double c = (Math.pow(a, exponent) + Math.pow(b, exponent));
        return c;
    }
}
