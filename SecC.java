import java.util.Scanner;

class SecC {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr1 = new int[5];
    int[] arr2 = new int[5];

    System.out.println("Enter 5 integers for array 1:");
    for (int i = 0; i < 5; i++) {
      arr1[i] = sc.nextInt();
    }

    for (int i = 0; i < 5; i++) {
      arr2[i] = arr1[i];
    }

    System.out.print("Elements of array 1: ");
    for (int i = 0; i < 5; i++) {
      System.out.print(arr1[i] + " ");
    }
    System.out.println(); // Move to the next line

    System.out.print("Elements of array 2: ");
    for (int i = 0; i < 5; i++) {
      System.out.print(arr2[i] + " ");
    }
    System.out.println(); // Move to the next line

    sc.close();
  }
}
