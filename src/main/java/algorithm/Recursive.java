package algorithm;

/**
 * Created with IntelliJ IDEA.
 * User: neo
 * Date: 15/10/13
 * Time: 9:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class Recursive {



    public int factorial(int n){
        if(n==1) return 1;
           return n*factorial(n-1);
    }

    public int fibonacci(int n){
        if(n==1||n==2)return 1;
        return fibonacci(n-1)+fibonacci(n-2);

    }
}
