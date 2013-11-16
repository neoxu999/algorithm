package sort;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

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

    /****
     *
     * @return most common integer
     */
    public int getCommonInt(int[] sumArray){
        int commonInt = 0;

        AtomicReference<Map> hashMap = new AtomicReference<Map>();
        hashMap.set(new HashMap());
        for(int i=0;i<sumArray.length;i++) {
            for (int j = 1; j < sumArray.length; j++) {
                int sum = sumArray[i] + sumArray[j];
                if (!hashMap.get().containsKey(sum)) {
                    hashMap.get().put(sum, 0);
                } else {
                   int count = (int) hashMap.get().get(sum);
                    hashMap.get().put(sum, hashMap.get().get(sum) + 1)    ;
                }
        }

        }
        return commonInt;
        }



}
