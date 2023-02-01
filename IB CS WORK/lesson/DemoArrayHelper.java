package lesson;

import Helpers.ArrayHelper;
import Helpers.Keyboard;

public class DemoArrayHelper {

      public static void main(String[] args) {
            // declare one variable for one number
            // assign myNumber to 5
            int acc0bal = 10;
            int acc1bal = 30;
            // declare array for 100 numbers
            // assign memory locatins
            int[] accNumbers = new int[100];

            // putting myNumber in the first slot
            accNumbers[0] = acc0bal;
            accNumbers[1] = acc1bal;

            System.out.println(accNumbers[1]);

            // using array helpers
            ArrayHelper.fill(accNumbers, acc0bal);

            boolean found = ArrayHelper.contains(accNumbers, acc0bal);
            System.out.println(found);
            boolean notFound = ArrayHelper.contains(accNumbers, 50);
            System.out.println(notFound);

      }

      public static int[] replace(int[] arr, int find, int replace, int fromIndex) {
            for (int i = fromIndex; i < arr.length; i++) {
                  if (arr[i] == find) {
                        arr[i] = replace;
                  }
            }
            return arr;
      }

      public static void main(String[] args) {

            double bal = 100.00;
            double nbal;

            ArrayHelper.replace(bal, nbal);

            nbal = Keyboard.readDouble();

            System.out.print(nbal);

      }

}