
public class divisionWithoutOperator {
    public static void main(String[] args) {

    }

    public static void divide(int a, int b){

        int count = 1;
        int c = b;

        if (a>=b){
            while (b<a){
                count++;
                b += c;
            }

        }
        System.out.println(count);
    }
}