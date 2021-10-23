public class BooleanPractices {
    public static void main(String[] args) {
        boolean result1 = isBiggerThan(3, 5);
        System.out.println(result1); // expected: false

        boolean result2 = isContiguous(1, 2, 4);
        System.out.println(result2); // expected: false
    }

    // TODO implement
    //  @params target my variable
    //  @params compareTo compare to this
    //  @returns if target is bigger than compareTo, return true. else return false
    static boolean isBiggerThan(int target, int compareTo) {
        if(target>compareTo){
            return true;
        }
        else{
            return false;
        }
    }

    // TODO implement
    //  @params a first number
    //  @params b second number
    //  @params c third number
    //  @returns true if a, b, c are contiguous and a < b < c
    static boolean isContiguous(int a, int b, int c) {
        if(a+1==b && b+1==c){
            return true;
        }
        else{
            return false;
        }
    }
}
