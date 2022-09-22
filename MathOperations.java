/* PATTERNS - Addition, Subtraction, Mutliplcation and Division
 * A math operation between whole numbers always returns a whole number
 * A math operation between decimals will always preserve the decimal
 * 
 */
public class MathOperations {
    public static void main(String[] args) {
        int bagOfSweets1 = 5;
        int bagOfSweets2 = 10;

        long starsInMilkyWay = 2500000000L;
        long starsInAndromeda = 10000000000000L;

        double testScore = 6.7;
        double bonusMarks = 2.5;


        //Adding
        System.out.println("Fred and George collected " + (bagOfSweets1 + bagOfSweets2) + " sweets");
        System.out.println("There are " + (starsInMilkyWay + starsInAndromeda) + " stars in the Milky Way and Andromeda galaxies.");
        System.out.println("With bonus marks, Ron scored " + (testScore + bonusMarks) + "/10 on his potions test. Snape wasn't too thrilled"); 

        //Subtracting
        System.out.println("Fred has " + (bagOfSweets2 - bagOfSweets1) + " more sweets than George");
        System.out.println("The Andromeda Galaxy has " + (starsInAndromeda - starsInMilkyWay) + " more stars than the Milky Way");
        System.out.println("Snape ended up removing marks. Ron actually scored " + (testScore - bonusMarks) + " on his potions test");
        
        //Multiplying
        System.out.println("Fred and George used a special spell to multiply their sweets to: " + (bagOfSweets1 * bagOfSweets2));
        System.out.println("Snape made an error on his excel, accidentally multiplying Ron's score to: " + (testScore * bonusMarks)+ "/10");

        System.out.println("Originally, Fred had " + (bagOfSweets2 / bagOfSweets1) + " times more sweets than George");
        System.out.println("Andromeda has " + (starsInAndromeda / starsInMilkyWay) + " times more stars");
        System.out.println("Snape caught the error. Furious, he divided Ron's score to: " + (testScore / bonusMarks));

        // Modulus
        System.out.println("10 is an even number, since dividing 10 by 2 has a remainder of: " + (10 % 2));
        System.out.println("5 is an odd number, since dividing 5 by 2 has a remainder of: " + (5 % 2));

        // ++ Operator 
        int counter = 0;
        counter ++;
        counter ++;
        counter ++;
        System.out.println("I count: " + counter);

        // -- Operator 
        counter --;
        counter --;
        counter --;
        System.out.println("I count: " + counter);

        // += Operator adds the value on the right
        // -= Operator subtracts the value on the right 

    }
}




//ADDITION
// Fred and George collected <result> sweets

// There are <result> stars in the Milky Way and Andromeda galaxies.

// With bonus marks, Ron scored <result>/10 on his potions test. Snape wasn't too thrilled


// SUBTRACTION
// Fred has  <result>  more sweets than George

// The Andromeda Galaxy has <result> more stars than the Milky Way

// Snape ended up removing marks. Ron actually scored <result> on his potions test


// MULTIPLICATION
// Fred and George used a special spell to multiply their sweets to: <result>

// Snape made an error on his excel, accidentally multiplying Ron's score to: <result>/10


//DIVISION 
// Originally, Fred had  <result> times more sweets than George

// Andromeda has <result> times more stars

// Snape caught the error. Furious, he divided Ron's score to: <result>



// 10 is an even number, since dividing 10 by 2 has a remainder of: <remainder>

// 5 is an odd number, since dividing 5 by 2 has a remainder of: <remainder>