package datastructure;

/**
 * Created with IntelliJ IDEA.
 * User: neo
 * Date: 13/10/13
 * Time: 4:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class Stack {
    int[] data;
    int maxSize;
    int top;

    public Stack(int maxSize){
        this.maxSize = maxSize;
        data = new int[maxSize];
        top = -1;
    }

    // add data by order
    public boolean push(int data){
        if(top+1==maxSize){
            System.out.println("Stack is full");
            return false;
        }
        this.data[++top] =data;
        return true;
    }


    // retrieve data
    public  int pop() throws Exception{
        if(top==-1){
            throw new Exception("Stack is empty");

        }
        return this.data[top--];

    }



}
