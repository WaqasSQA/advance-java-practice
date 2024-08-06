public class stringBuffer {
    public static void main(String[] args) {
        // Inefficent
        String info = " ";
        info += "I am yousma.";
        info += " ";
        info += "I am SDET.";

        //System.out.println(info);

        // Better
        StringBuilder sb = new StringBuilder();
        sb.append("I am yousma");
        sb.append(" ");
        sb.append("I am SDET");

       //System.out.println(sb.toString());

        //becuase this append return reference to String Builder
        // object so we can apply method chaining
        StringBuilder s = new StringBuilder();
        s.append("I am yousma siddiqui").append(" ")
                .append("I am QA Engineer").append(" ")
                .append("I am proud of it");
        //System.out.println(s.toString());


        //////Formatting//////////////////////////
        //System.out.print("This is the line \tThat was a tab \nThat is a new line");

        //System.out.printf("Total cost %-10d: Quantity %-10d:", 5, 16);

        for (int i=0; i<=20; i++){
            System.out.printf("%-2d: %s\n", i, "Text after int");
        }
        System.out.printf("Number is %-6.1f ", 590.7890);
    }
}
