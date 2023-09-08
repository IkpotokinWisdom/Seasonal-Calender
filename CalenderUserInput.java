package calender;

import java.util.Scanner;


public class CalenderUserInput {
    public static void seasons (){
    String season;
    Scanner takeInput = new Scanner(System.in);
    System.out.println("Please write a Month of the Year");
   
    season = takeInput.nextLine();
    
    if ("January".equalsIgnoreCase(season)){
        System.out.println(season+" is a Winter Season");
    }
    else if ("Febuary".equalsIgnoreCase(season)){
        System.out.println(season+" is a Winter Season");
    }
    else if ("December".equalsIgnoreCase(season)){
        System.out.println(season+" is a Winter Season");
    }
    else if ("March".equalsIgnoreCase(season)){
        System.out.println(season +" is a Spring Season");
    }
    else if ("April".equalsIgnoreCase(season)){
        System.out.println(season +" is a Spring Season");
    }
    else if ("May".equalsIgnoreCase(season)){
        System.out.println(season+" is a Spring Season");
    }
    else if ("June".equalsIgnoreCase(season)){
        System.out.println(season +" is Summer Season");
    }
    else if ("July".equalsIgnoreCase(season)){
        System.out.println(season+" is a Summer Season");
    }
    else if ("August".equalsIgnoreCase(season)){
        System.out.println(season+" is a Summer Season");
    }
    else if ("September".equalsIgnoreCase(season)){
        System.out.println(season+" is a Autumn Season");
    }
    else if ("October".equalsIgnoreCase(season)){
        System.out.println(season+" is a Autumn Season");
    }
    else if ("Novermber".equalsIgnoreCase(season)){
        System.out.println(season+" is a Autumn Season");
    }
    else{
        System.out.println("Bogus Month\nPlease try again");
        seasons();
    }
  }
}
