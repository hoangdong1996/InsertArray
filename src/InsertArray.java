import java.util.Scanner;

public class InsertArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size;
        do {
            System.out.print("Enter size: ");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);

        int[] array;
        array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = input.nextInt();
            i++;
        }

        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        int newValue;
        int index;
        System.out.printf("%-20s%s", "Enter new value: ", "");
        newValue = input.nextInt();
        System.out.println("Enter index: ");
        index = input.nextInt();
        if (index < 0 || index > array.length) {
            System.out.println("Do not insert in array!");
        } else {
            for (int j = size; j > index; j--) {
                array[j] = array[j - 1];
                array[j - 1] = newValue;
            }
            size += 1;
        }

        System.out.println("Array then insert: ");
        for (int j = 0; j < size; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
