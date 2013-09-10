/**
 * Created with IntelliJ IDEA.
 * User: michael
 * Date: 10/09/2013
 * Time: 19:36
 * To change this template use File | Settings | File Templates.
 */
public class FizzBuzz {

    public static void main(String[] args) {
        int i = 0;
        while (i <= 100) {
            i++;
            if ((i % 3 == 0 && i % 5 == 0))
                System.out.print("fizz buzz, ");
            else if ((i % 3 == 0)) {
                System.out.print(" fizz, ");
            }
            else if (i % 5 == 0)
                System.out.print(" buzz, ");

            else {
                System.out.print(i + ", ");
            }
        }
    }

}
