import java.util.ArrayList;

public class Sorter {
    public static void selectionSort(ArrayList<Msg> list) {
        for (int i = 0; i < list.size(); i++) {
            int idxMin = i;
            for (int scan = i + 1; scan < list.size(); scan++) {
                if (list.get(idxMin).compareTo(list.get(scan)) > 0) {
                    idxMin = scan;
                }
                Msg a = list.get(i);
                list.set(i, list.get(idxMin));
                list.set(idxMin, a);
            }
        }

    }
    public static void ContentSort(ArrayList<Msg> list) {
        for (int i = 0; i < list.size(); i++) {
            int idxMin = i;
            for (int scan = i + 1; scan < list.size(); scan++) {
                if ((byte)list.get(idxMin).getContent()-(byte)(list.get(scan).getContent()) > 0) {
                    idxMin = scan;
                }
                Msg a = list.get(i);
                list.set(i, list.get(idxMin));
                list.set(idxMin, a);
            }
        }
    }
}
