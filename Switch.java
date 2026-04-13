import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // String fruit = in.next();

        // switch (fruit) {
        //     case "Mango":
        //         System.out.println("Mango is the king of Fruit");
        //         break;
        //     case "Apple":
        //         System.out.println("A sweet red fruit");
        //         break;
        //     case "Orange":
        //         System.out.println("Earthed shape fruit");
        //         break;
        //     case "Grapes":
        //         System.out.println("My favourite fruit");
        //         break;
        //     default:
        //         System.out.println("Please enter a valid fruit");

                /// java 14

                // case "Mango" -> System.out.println("Mango is the king of all fruits");
                // case "Apple" -> System.out.println("A sweet red fruit");
                // case "Orange" -> System.out.println("Earth shaped fruit");
                // case "Grapes" -> System.out.println("My favourite fruit");
                // default -> System.out.println("Plz enter a valid fruit");

                int day = in.nextInt();
                switch (day) {

    
                    // case 1 -> System.out.println("Monday");
                    // case 2 -> System.out.println("Tuesday");
                    // case 3 -> System.out.println("Wednesday");
                    // case 4 -> System.out.println("Thursday");
                    // case 5 -> System.out.println("Friday");
                    // case 6 -> System.out.println("Saturday");
                    // case 7 -> System.out.println("Sunday");


                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    System.out.println("Weekday");
                    break;
                    case 6:
                    case 7:
                    System.out.println("Weekend");
                    break;
                       
                    //  Another  advanced way of switch  case

                    // case 1,2 , 3, 4 ,5 -> System.out.println("Weekdays");
                    // case 6,7 ->System.out.println("Weekend");


                }

        }

    }


