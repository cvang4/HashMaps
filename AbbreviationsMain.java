/**
 * Abbreviations Exercise
 */

package HashMaps;

public class AbbreviationsMain {
    
    public static void main(String[] args) {

        //Adding abbreviations to hash map
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("ex", "example");
        abbreviations.addAbbreviation("LOL", "laugh out loud");
        abbreviations.addAbbreviation("AFK", "away from keyboard");

        //Checking true or false if abbreviation exists
        System.out.println(abbreviations.hasAbbreviation("ex"));
        System.out.println(abbreviations.hasAbbreviation("WTF"));

        //Checking the value
        System.out.println(abbreviations.findExplanationFor("AFK"));
    }
}
