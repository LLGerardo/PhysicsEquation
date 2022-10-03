public class Lauraplayground_week_3_Assig_2 {
    public static void main(String[] args) {
       /*Instructions for assignment - Write code for this assignment to declare variables for s, t, s0, v0, and a,
        then use Console to get input from the user to give a value for each of the variables t, s0, v0, and a.*/

        //making variables so I can use prompt later //
        double s;
        double t = Console.promptDouble("t = ");
        double s0 = Console.promptDouble("s0 = ");
        double v0 = Console.promptDouble("v0 = ");
        double a = Console.promptDouble("a = ");
        // using prompt so its like a personalized calculator//


        //Calculate the resulting value of s with the inputted values//
        s = (s0 + (v0 * t) + (0.5 * a * t * t));
        //printing the results//
        System.out.println("The position of s is " + s);
    }
}
