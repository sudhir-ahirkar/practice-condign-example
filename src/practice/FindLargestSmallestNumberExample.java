package practice;

public class FindLargestSmallestNumberExample {

    public static void main(String[] args) {
        //array of 10 numbers
        int numbers[] = {32, 43, 53, 54, 32, 65, 63, 98, 43, 23};

        //assign first element of an array to largest and smallest
        int smallest = numbers[0];
        int largetst = numbers[0];

        for (int num : numbers) {
            if (num > largetst) {
                largetst = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("largetst==>" + largetst + "  smallest===>" + smallest);
    }
}
