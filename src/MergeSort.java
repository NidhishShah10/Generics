import java.util.List;
import java.util.ArrayList;

public class MergeSort<T extends Comparable<T>> {

    public void sort(List<T> arr) {
        if (arr.size() <= 1)
            return;

        int mid = arr.size() / 2;
        List<T> left = new ArrayList<>(arr.subList(0, mid));
        List<T> right = new ArrayList<>(arr.subList(mid, arr.size()));

        sort(left);
        sort(right);

        merge(arr, left, right);
    }

    private void merge(List<T> arr, List<T> left, List<T> right) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).compareTo(right.get(j)) <= 0) {
                arr.set(k++, left.get(i++));
            } else {
                arr.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) {
            arr.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            arr.set(k++, right.get(j++));
        }
    }

    // Method to print the array
    public void printArray(List<T> arr) {
        for (T value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeSort<Integer> mergeSort = new MergeSort<>();
        List<Integer> list = List.of(14, 31, 52, 21, 29, 42, 81);
        mergeSort.sort(list);
        System.out.println("Sorted array:");
        mergeSort.printArray(list);
    }
}
