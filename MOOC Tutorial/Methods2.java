public class Methods2 {
    public static void main(String[] args) {

        Methods2 methods = new Methods2();
        System.out.println(methods.sumOfFour(5, 5, 5, 5));
        System.out.println(methods.least(4, 5));
        System.out.println(methods.greatest(4, 5));
        System.out.println(methods.average(1, 2, 7, 4));






    }

    double average(int n1, int n2, int n3, int n4) {
        double average = ( n1 + n2 + n3 + n4) / 4.0;
        return average;
    }

    int greatest(int a, int b) {
        return Math.max(a, b);
    }

    int least(int a, int b) {
        return Math.min(a, b);
    }

    int sumOfFour(int n1, int n2, int n3, int n4) {
        int sum = n1 + n2 + n3 + n4;
        return sum;
    }

    public Methods2() {
    }
}
