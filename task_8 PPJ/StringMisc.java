
public class StringMisc {
    public static String norm(String name) {
        name = name.toUpperCase().substring(0, 1) + name.substring(1).toLowerCase();
        return name;
    }


    public static String init(String name) {
        String[] word = name.split(" ");
        for (int i = 0; i < word.length; i++)
            word[i].replace(".", "");
        String result = word[0].toUpperCase().substring(0, 1) + ". ";

        if (word.length == 3) {
            result += word[1].toUpperCase().substring(0, 1) + ". ";
            result += norm(word[2]);
        } else
            result += norm(word[1]);


        return result;
    }

    public static String tr(String s,
                            String from, String to) {
        if (from.length() != to.length()){
            return "Invalid parameters";
        }
        char[] fromCharArray = new char[from.length()];
        char[] toCharArray = new char[to.length()];
        for (int j = 0; j < from.length(); j++) {
            fromCharArray[j] = from.charAt(j);
        }
        for (int i = 0; i < to.length(); i++) {
            toCharArray[i] = to.charAt(i);
        }

        for (int k = 0; k < from.length(); k++) {
            s = s.replaceAll(String.valueOf(fromCharArray[k]), String.valueOf(toCharArray[k]));
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(norm("caravaggio"));
        System.out.println(norm("VERMEER"));
        System.out.println(init("johann sebastian bach"));
        System.out.println(init("i. babeL"));
        System.out.println(init("jorge LUIS BORGES"));
        System.out.println(init("WOLFGANG a. mozart"));
        System.out.println(tr("November 2016",
                "abcdefghijklmnopqrstuvwyz",
                "ABCDEFGHIJKLMNOPQRSTUVWYZ"));
        System.out.println(tr("abcXYZ", "aZcX", "||Cx"));
    }


}
