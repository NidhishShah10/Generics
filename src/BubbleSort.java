import java.util.List;

public class BubbleSort<T extends Comparable<T>> {

    public void sort(List<T> arr) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr.get(j).compareTo(arr.get(j + 1)) > 0) {
                    T temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }

    public void printArray(List<T> arr) {
        for (T value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        List<Integer> list = List.of(14, 31, 52, 21, 29, 42, 81);
        bubbleSort.sort(list);
        System.out.println("Sorted array:");
        bubbleSort.printArray(list);
    }
}
