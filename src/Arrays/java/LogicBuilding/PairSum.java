package Arrays.java.LogicBuilding;

public class PairSum {
        public static int PairSum(int arr[], int target) {
            int PairCount = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == target) {
                        PairCount++;
                    }
                }
            }
            return PairCount;
        }
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int target = 5;
            int result = PairSum(arr, target);
            System.out.println("Pair Count = " + result);
        }
    }
    