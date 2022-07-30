package Array;

import java.util.Arrays;

public class ArrayClassProperties {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4};
        int[] list2 = {5, 67, 78, 2, 13, 1};
        // toString() = elemanları ekrana yazdırıyor.
        System.out.println(Arrays.toString(list));
        // Arrays.fill = dizinin belirli bölüme değer atar.
        Arrays.fill(list,10); // tüm elemanlar 10 oldu.
        System.out.println(Arrays.toString(list));
        Arrays.fill(list2,1,3,10); // Arrayın 1. indexinden 3. indexine kadar 10 yap.
        System.out.println(Arrays.toString(list2));
        System.out.println();

        list[0] =1;         list[1] =2;         list[2] =3;         list[3] =4;

        HelperArray.prinln(list2,0,3,23);// Kendi yazdığım program yukardaki ile aynı, yukarıdaki direk tek satırda bitirdi.
        //Arrays.sort() = Elemanları sıralar.
        Arrays.sort(list2); // Kucukten buyuge sıralar.
        System.out.println(Arrays.toString(list2));
        System.out.println();

        // Arrays.binarySearch() = belirledigin değerin, indis numarasını döndürür.
       int a = Arrays.binarySearch(list2,12); // Dizinin sıralı olması gerekmektedir.
        System.out.println(a);
        System.out.println();

        /*Arrays.copyOf() ve Arrays.copyOfRange() =Mevcut diziden belli bir uzunlukta yeni bir dizi oluşturmak için Arrays.copyOf() metotu kullanılır
        Mevcut diziden belli bir aralıkta yeni bir dizi oluşturmak için ise Array.copyOfRange() metodu kullanılır.
         */
        int[] copyList = Arrays.copyOf(list,6);
        System.out.println(Arrays.toString(copyList));
        System.out.println();

        //Arrays.equals() = ava'da iki dizinin eşitliğini kontrol etmek için Arrays.equals() metotu kullanılır.


    }
}
