import java.util.Random;
import java.util.Scanner;

/**
 * Created by johnsabilla on 7/2/17.
 */
public class MadLibs {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    String name;
    String story;
    String adjective1;
    String adjective2;
    String noun1;
    String noun2;
    String noun3;
    String adverb;
    String randomNums;


    public MadLibs(){}

    /**
     *
     * @return
     */
    public String getStory(){
        return this.story;
    }

    /**
     *
     * @return
     */
    public String getName(){
        return this.name;
    }

    /**
     *
     * @return
     */
    public String getAdjective1(){
        return this.adjective1;
    }

    /**
     *
     * @return
     */
    public String getAdjective2(){
        return this.adjective2;
    }

    /**
     *
     * @return
     */
    public String getNoun1(){
        return this.noun1;
    }

    /**
     *
     * @return
     */
    public String getNoun2(){
        return this.noun2;
    }

    /**
     *
     * @return
     */
    public String getNoun3(){
        return this.noun3;
    }

    /**
     *
     * @return
     */
    public String getAdverb(){
        return this.adverb;
    }

    /**
     *
     * @return
     */
    public String getRandomNums(){
        return this.randomNums;
    }

    /**
     *
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     *
     * @param story
     */
    public void setStory(String story) {
        this.story = story;
    }

    /**
     *
     * @param adjective1
     */
    public void setAdjective1(String adjective1) {
        this.adjective1 = adjective1;
    }

    /**
     *
     * @param adjective2
     */
    public void setAdjective2(String adjective2) {
        this.adjective2 = adjective2;
    }

    /**
     *
     * @param noun1
     */
    public void setNoun1(String noun1) {
        this.noun1 = noun1;
    }

    /**
     *
     * @param noun2
     */
    public void setNoun2(String noun2) {
        this.noun2 = noun2;
    }

    /**
     *
     * @param noun3
     */
    public void setNoun3(String noun3) {
        this.noun3 = noun3;
    }

    /**
     *
     * @param adverb
     */
    public void setAdverb(String adverb) {
        this.adverb = adverb;
    }


    public void enterName(){
        this.setName(scanner.nextLine());
    }

    public void enterNoun1(){
        System.out.println("Give me a noun.");
        this.setNoun1(scanner.nextLine());
    }

    public void enterNoun2(){
        System.out.println("Give me another noun.");
        this.setNoun2(scanner.nextLine());
    }

    public void enterNoun3(){
        System.out.println("Give me the last noun.");
        this.setNoun3(scanner.nextLine());
    }

    public void enterAdjective1(){
        System.out.println("Give me an adjective.");
        this.setAdjective1(scanner.nextLine());
    }

    public void enterAdjective2(){
        System.out.println("Give me another adjective.");
        this.setAdjective2(scanner.nextLine());
    }

    public void enterAdverb(){
        System.out.println("Give me an adverb.");
        this.setAdverb(scanner.nextLine());
    }

    public void setRandomNums() {
        int num = Math.abs(random.nextInt()) % 100;
        int[] numberHolder = new int[3];
        for(int x = 0; x < numberHolder.length; x++) {
            numberHolder[x] = num + x;
        }

        randomNums = "Not " + numberHolder[0] + " not " + numberHolder[1] + ", but " + numberHolder[2];
    }

    public void play(){
        enterName();
        enterNoun1();
        enterAdjective1();
        enterAdjective2();
        enterNoun2();
        enterAdverb();
        enterNoun3();
        setRandomNums();
        putStoryTogether();
        System.out.println(getStory());
    }

    public void printIntstructions(){
        System.out.println("Welcome to the madlibs game. If you in words " +
                ", we'll give you a story. Start by typing a name.");
    }

    public void putStoryTogether(){
        String story;

        int num = Math.abs(random.nextInt()) %2;

        if(num == 0 ) {
            story = "Jesse and her bestfriend " + this.getName() + " went to Disney World today!" +
                    " They saw a " + this.getNoun1() + " in a show at the Magic Kingdom " +
                    "and ate a " + this.getAdjective1() + " feast for dinner. The next day, I" +
                    " ran " + this.getAdverb() + " to meet Mickey Mouse in his " + this.getNoun2() +
                    " and then that night I gazed at the " + this.getRandomNums() + " " + this.getAdjective2() +
                    " fireworks shooting from the " + this.getNoun3() + ".";
        }else{
            story = "Amanda and her frenemy " + getName() + " went to the zoo last summer. " +
                    "They saw a huge " + getNoun1() + " and a tiny little " + getNoun2() + ". That night " +
                    "They decided to climb " + getAdverb() + "into the " + getNoun3() + " to get a closer look. " +
                    "The zoo was " + getAdjective1() + " at night, but they didn't care... until " + getRandomNums() +
                    getAdjective2() + " apes yelled in their faces, making Amanda and " + getName() + " sprint all the way " +
                    "back home.";
        }
        this.setStory(story);
    }
    public static void main (String[] args){

        MadLibs madLibs = new MadLibs();
        madLibs.printIntstructions();
        madLibs.play();

    }
}
