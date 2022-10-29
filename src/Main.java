public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (var index = 0; index < array.length; index++) {
            array[index] = (int) (Math.random() * 100);
        }
        for (var index = 0; index < array.length; index++) {
            for (int sosindex = 0; sosindex < array.length - index - 1; sosindex++) {
                if (array[sosindex] < array[sosindex + 1]) {
                    var buffer = array[sosindex];
                    array[sosindex] = array[sosindex + 1];
                    array[sosindex + 1] = buffer;
                }
            }
        }
    }
}