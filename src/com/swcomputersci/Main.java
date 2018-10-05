package com.swcomputersci;



// G.PASS:  HI I LEFT YOU A NOTE RUN YOUR PROGRAM TO SEE IT.

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("If you provide me some information I will provide a Science Fiction name for you.");
        System.out.println("Please have all responses  be at least three characters long.");
        System.out.println("For best results, user lowercase letters with no spaces.\n");

        // notice this methd (print) does not print a newline
        System.out.print("Enter your first name: ");
        String firstName = UserInput.getString();
        System.out.print("Enter your last name: ");
        String lastName = UserInput.getString();
        System.out.print("Enter the city where you or one of your parents were born: ");
        String city = UserInput.getString();
        System.out.print("Enter the name of your grammar school: ");
        String school = UserInput.getString();
        System.out.print("Enter the first name of a sibling or other relative: ");
        String relativeName1 = UserInput.getString();
        System.out.print("Enter the first name of a second sibling or relative: ");
        String relativeName2 = UserInput.getString();

        // generate a sciFi name
        // these create the scifi first name
        String firstSciFiName = firstName.substring(0, 3);
        String lastSciFiName = lastName.substring(0,2);
        String scifiFirstName = firstSciFiName + lastSciFiName;
       // these create scifi last name
        String cityName = city.substring(0,2);
        String schoolName = school.substring(0,3);
        String sciFiLastName = cityName + schoolName;

        double r = Math.random()* (relativeName1.length() - 1);
        int i = (int) r + 1;

        String sciFirelativeName1 = relativeName1.substring (i,relativeName1.length());

        double x = Math.random()* (relativeName2.length() - 1);
        int b = (int) x + 1;

        String sciFirelativeName2 = relativeName2.substring (i,relativeName2.length());

        String sciFiPlaceOfOrigin = sciFirelativeName1 + sciFirelativeName2;

        System.out.print("Hello " + scifiFirstName + sciFiLastName + " of " + sciFiPlaceOfOrigin + ". Welcome!");
        System.out.print("Hello " + scifiFirstName + sciFiLastName  + '\n' + '\n' + " I figured out what your problem was with GitHub on Friday!" + '\n' + '\n' + '\n' + '\n'
                + "It's is really rediculous, but also very informative." + '\n' + '\n'
                + "When we were editing your \".gitignore\" file, we accidently added an asterisk * at the end of the document!" + '\n' + '\n'
                + "What do you think that would do?" + '\n' + '\n' + "Type yor answer...");
        String yourAnswer = UserInput.getString();
        System.out.println('\n' + '\n' +  + '\n' + '\n' + "Good thinking!    That asterisk * is called a \"wild-card\".  if I typed *.idea then .gitignore will ignore everything that ends in .idea." + '\n'
                + "So if I put the asterisk * by it self that means...  Ignore everything. "+ '\n' +"That is exactly what GitHub was doing!!!  LOL! "+ '\n' + '\n' + "Have a good weekend!" + '\n' + "G. Pass");















    }



        }



