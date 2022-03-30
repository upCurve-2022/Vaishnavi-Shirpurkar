    package Exception_Handling;

    import java.util.Scanner;

    class SwiggyDelivery extends Exception {
        SwiggyDelivery(String message) {
            super(message);
        }

    }
    public class ZipCodeException {

        void checkZipCode (String zipCode){

    //        Create a regular expression to validate pin code of India as mentioned below:
    //        regex = "^[1-9]{1}[0-9]{2}\\s{0, 1}[0-9]{3}$";
    //        Where:
    //         ^ represents the starting of the number.
    //         [1-9]{1} represents the starting digit in the pin code ranging from 1 to 9.
    //         [0-9]{2} represents the next two digits in the pin code ranging from 0 to 9.
    //         \\s{0, 1} represents the white space in the pin code that can occur once or never.
    //         [0-9]{3} represents the last three digits in the pin code ranging from 0 to 9.
    //         $ represents the ending of the number.

            try {

                // Regex to check valid pin code of India.
                String regex = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";

                if(zipCode.isEmpty())
                    throw new SwiggyDelivery(" >> Exception: Delivery Zip Code can not be empty.");

                else if (!zipCode.matches(regex))
                    throw new SwiggyDelivery(" >> Exception: Entered zip code is invalid your order is non-deliverable.\n" +
                            " >> Kindly enter the valid zip code.");

                else
                    System.out.println(" >> Delivery available in your area!");
            }
            catch (SwiggyDelivery sd){
                System.out.println(sd.getMessage());
            }
        }

        public static void main(String args[])
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("\n-- WELCOME TO SWIGGY --\nPlease enter your order delivery zip code :: ");
            String  zipCode = scan.nextLine();
            ZipCodeException Z = new ZipCodeException();
            Z.checkZipCode(zipCode);
        }
    }
