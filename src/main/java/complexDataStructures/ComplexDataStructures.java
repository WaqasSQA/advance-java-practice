package complexDataStructures;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class ComplexDataStructures {

    public static String [] teamDomain = {"FE", "BE", "QA"};

    public static String [][] engineers = {
            {"Bob", "Sue", "Jon"},
            {"Mike", "Shawn", "Ryan", "Alexa"},
            {"Bran", "Lui"}
    };

    public static void main(String[] args) {
        Map<String, Set<String>> team = new HashMap<>();

        for (int i=0; i<teamDomain.length; i++){
            String domain = teamDomain[i];
            String [] engineersList = engineers[i];

            Set<String> engineersSet = new LinkedHashSet<>();
            for(String engineer : engineersList){
                engineersSet.add(engineer);
            }

            team.put(domain, engineersSet);
        }

        Set<String> engineersList = team.get("BE");
        for (String engineer: engineersList){
           // System.out.println(engineer);
        }
        for(String teamDomain: team.keySet()){

            System.out.print(teamDomain);
            System.out.print(" : ");

            Set<String> engineers = team.get(teamDomain);
            for(String engineer : engineers){
                System.out.print(engineer);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
