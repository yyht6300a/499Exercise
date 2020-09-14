import java.util.ArrayList;

public class MSGtester {
    public static void main(String[] args) {
        ArrayList<Msg> list=new ArrayList<>(5);
        list.add(new Msg('a',"2020/9/14"));
        list.add(new Msg('e',"2020/9/4"));
        list.add(new Msg('d',"2020/9/1"));
        list.add(new Msg('c',"2020/9/17"));
        list.add(new Msg('b',"2020/9/29"));
        System.out.print("Before sorting: \n"+list);
        Sorter.selectionSort(list);
        System.out.print("\nAfter sorted by time \n"+list);
//        Sorter.ContentSort(list);
//        System.out.print("\nAfter sorted by content \n"+list);


    }
}
