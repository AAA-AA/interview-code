import org.junit.Test;

/**
 * @Author: renhongqiang
 * @Date: 2020/6/25 10:43 上午
 **/
public class ExerciseTest {


    @Test
    public void testBubble() {
        Integer[] arr = {23, 12, 4, 232, 17, 732, 34};

        bubbleSort(arr);
        System.out.println(arr);
    }

    private void bubbleSort(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapArr(arr, j, j+1);
                }
            }
        }



    }

    private void swapArr(Integer[] arr, int j, int i) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
