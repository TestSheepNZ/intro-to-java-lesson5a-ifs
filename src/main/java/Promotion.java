public class Promotion {

    public static Boolean eligibleByCountry (String country) {
        Boolean eligible = Boolean.FALSE;

        switch (country) {
            case "NZ":
            case "AU":
            case "CA":
            case "UK":
            case "US":
                eligible = Boolean.TRUE;
                System.out.println("Eligible");
                break;
            default:
                eligible = Boolean.FALSE;
                System.out.println("Ineligible");
                break;
        }

        return eligible;
    }

    public static Boolean eligibleByAge (int age) {
        Boolean eligible = Boolean.FALSE;
        if ( (age >= 18) && (age <= 30)  ) {
            eligible = Boolean.TRUE;
        }
        return eligible;
    }

    public static void main(String[] args) {
        // Print eligibility
        System.out.println("Eligible for promotion at 18 " + eligibleByAge(18));
        System.out.println("Eligible for promotion at 17 " + eligibleByAge(17));
        System.out.println("Eligible for promotion at 19 " + eligibleByAge(19));

        System.out.println("Eligible for promotion at 29 " + eligibleByAge(29));
        System.out.println("Eligible for promotion at 30 " + eligibleByAge(30));
        System.out.println("Eligible for promotion at 31 " + eligibleByAge(31));
        

        //Eligibility by country
        System.out.println("Eligible for promotion from NZ " + eligibleByCountry("NZ"));
        System.out.println("Eligible for promotion from US " + eligibleByCountry("US"));
        System.out.println("Eligible for promotion from UK " + eligibleByCountry("UK"));
        System.out.println("Eligible for promotion from DE " + eligibleByCountry("DE"));
    }
}
