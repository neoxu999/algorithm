/**
 * Created with IntelliJ IDEA.
 * User: neo
 * Date: 12/10/13
 * Time: 12:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sort {

    //bubble sort
    public void bubbleSort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {

            for (int j = a.length - 1; j > i; j--) {
                if (a[j] < a[j - 1]) {
                    int tem = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = tem;
                }

            }


        }

        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + ",");
        System.out.println("****bubble sort");
    }


    // insertion sort
    public void insertion(int a[]) {

        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j;
            for (j = i - 1; j >= 0 && key < a[j]; j--) {
                a[j + 1] = a[j]; // move the greater number to the right
            }
            a[j + 1] = key; //assign stopped position value

        }

        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + ",");

        System.out.println("****insertion sort");
    }

    public void heapSort(int a[]){


    }


}
