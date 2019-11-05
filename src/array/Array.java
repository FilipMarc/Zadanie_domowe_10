package array;

public class Array {

    public int[] rightArray(int[] tab, int N){
        int[] arr = new int[tab.length];

        if (N == tab.length){
            return tab;

        }else if (tab==null) {
            return null;
        } else
            {
            for (int i = 0; i < tab.length; i++) {
                if (i < N) {
                    arr[tab.length- N + i] = tab[i];
                } else arr[i-N] = tab[i];
            }
            return arr;
        }
    }
}
