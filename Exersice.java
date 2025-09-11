public class Exersice {
    public static void main(String[] args) {
        //question 1
        //int, char, string

        //question 2
        //since switch is set to 3 to goes to case 3 which has nothin in it so it goes to 4 which is y = y + --p (y = -8 + 4; y = -4). Since there is a break it ends and prints out y which is -4

        //question 3
        char myChar = 'G'; // example character
        int y = 0;         // example starting value

        switch (myChar) {
        case 'G':
        case 'g':
        y++;       // increment y if myChar is G or g
        break;

        case 'M':
        case 'm':
        y--;       // decrement y if myChar is M or m
        break;

        default:
        y += 100;  // add 100 to y for any other character
        break;
        }

        System.out.println("y = " + y); //prints y = (value of y)

        //question 4
        //prints 3 because it adds 1, 4 times becauses there is no breaks and at the println it minuses 1 

        //question 5
        char chr = 'z'; //sets chr to equal z
        System.out.println(chr); //prints z

        //question 6
        //prints the sum is 1012 and the sum is 22. the reason it prints 1012 is because it prints x and y's act values and combines them. it prints 22 becaue it is in () so it adds

        //question 7
        int speed = 70; // example value

        switch (speed) {
        case 75:
            System.out.println("Exceeding speed limit");
            break;

        case 69:
        case 70:
            System.out.println("Getting close"); //prints getting close becuase speed is set to 70 and it breaks
            break;

        case 65:
            System.out.println("Cruising");
            break;

        default:
            System.out.println("Very slow");
            break;
        }

        //question 8
        //no. it only runs if none of the previous cases work or there is a flow. if it isnt there and a value doesnt fit then it just doesnt do anything 

        //question 9
        String s = "X";
        char chair = s.charAt(0); //makes string s int a char to store the letter X 

    }
}
