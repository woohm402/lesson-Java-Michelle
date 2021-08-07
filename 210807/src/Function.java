public class Function {
    public static void main(String[] args) {
        int a = 3, b = 5, c = 7;

        System.out.println("a * b * c = " + multiple(a, b, c));
    }

    static int multiple (int a, int b, int c) {
        return a*b*c;
    }

    static double min(double a, double b, double c)
    {
        if(a>=b)
        {
            return Math.min(b, c);
        }
        else
        {
            return Math.min(a, c);
        }
    }
}

/*

함수 이름: minOf3
파라미터: 실수 (double) 세 개
리턴값: 그 중 가장 작은 거

 */

/*

# C
int add (int a, int b) {
  return a + b;
}

# JAVA
int add (int a, int b) {
  return a + b;
}

# Python
def add(a, b):
  return a + b

# Javascript
function add(a, b) {
  return a + b;
}

const add = (a, b) => a + b;

 */

