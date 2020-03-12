import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListAndArray {
    private int[] b = new int[5];
    private static int[] e = new int[]{1,2,3,4,5,6,7,8,9,10};;
    private List<String> c;
    {
        c = new ArrayList<>();
    }
    private int[] d = {5,6,7,8,9};

    public ListAndArray(int[] eingabe, List<String> c) {
        b = eingabe;
        this.c = c;
        d = new int[]{31, 28, 56, 20, 29, 18, 90, 68, 100, 76};
    }



    public void Read(int[] a) {
        int k = d.length;
        if (a.length == d.length) {
            for (int i = 0; i < a.length; i++) {
            a[i] = d[i];
            System.out.println(a[i]);
            }
        } else {
            throw new NullPointerException("Arrays nicht gleich d groß!");
        }
    }

    public static void changeA(int[] a) {
        a[0] = 1;
    }
    public void changeD() {
        d[2] = 5;
    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(0, 1); // adds 1 at 0 index
        l1.add(1, 2); // adds 2 at 1 index
        System.out.println(l1);
        int[] a = e;
        List<String> e = new ArrayList<String>();
        e.add(0,"adc");
        e.add(1, "abe");
        e.add(2, "eoc");
        ListAndArray x = new ListAndArray(a,e);
        System.out.println(x.d);
        System.out.println(x.c);
        System.out.println(Arrays.toString(x.b)); //hier printen wir b aus, das oben als a übergeben wurde, a wurde vorher gleich e gesetzt, dass wiederum in der KLasse definiert ist.
        x.Read(x.b);
        x.changeD();
        x.Read(x.b);
        changeA(x.b);
        System.out.println(Arrays.toString(x.b));
        System.out.println(Arrays.toString(Sort.mergeSort(x.b)));
    }
}

