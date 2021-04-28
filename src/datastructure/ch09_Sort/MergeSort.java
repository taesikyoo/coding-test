package datastructure.ch09_Sort;

public class MergeSort {

    public void sort(int a[]) {
        int[] b = new int[a.length];
        sort(a, b, 0, a.length - 1);
    }

    private void sort(int[] a, int[] b, int low, int high) {
        if (high < low) return;
        int mid = low + (high - low) / 2;
        sort(a, b, low, mid); // 앞부분 재귀호출
        sort(a, b, mid + 1, high); // 뒷부분 재귀호출
        merge(a, b, low, mid, high); // 합병 수행
    }

    private void merge(int[] a, int[] b, int low, int mid, int high) {
        int i = low; // 첫 번째 파티션의 시작 인덱스
        int j = mid + 1; // 두 번째 파티션의 시작 인덱스
        for (int k = low; k <= high; k++) {
            if (i > mid) b[k] = a[j++]; // 앞부분이 먼저 소진된 경우
            else if (j > high) b[k] = a[i++]; // 뒷부분이 먼저 소진된 경우
            else if (a[j] < a[i]) b[k] = a[j++]; // a[j]가 승자
            else b[k] = a[i++]; // a[i]가 승자
        }

        for (int k = low; k <= high ; k++) {
            a[k] = b[k];
        }
    }
}
