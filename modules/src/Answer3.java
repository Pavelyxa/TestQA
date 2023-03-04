public class Answer3 {
    public static void main(String[] args) {
        int[] array={1, 3, 6, 7, 9, 11, 14, 15};
        checkArray(array);
    }
    public static void checkArray(int[] array){
        for (int j : array) {
            if (j % 3 == 0) {
                System.out.println(j);
            }
        }
    }
}
