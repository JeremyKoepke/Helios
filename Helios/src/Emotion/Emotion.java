package Emotion;

/**
 * @author Jeremy Koepke
 *
 * Description: This class creates a generic emotion that can be extended.
 * The emotion can change its level between 1 and 3.
 * When the Helios AI is activated it is automatically in Blank emotion.
 * Other states of emotion are activated when a previous state is loaded.
 */
public class Emotion {
    public enum EmotionType {
        NEUTRAL, PROTOTYPE, PRIMARY_DYAD, SECONDARY_DYAD, TERTIARY_DYAD, CONFLICT;
    }

    public EmotionType type = EmotionType.NEUTRAL;
    public int emotionLevel;
    public String emotionName;
    public boolean isActive;

    //Constructs a generic emotion.
    public Emotion(){
        emotionLevel = 1;
        emotionName = "Blank";
        isActive = true;
    }

    /**
     * @param newLevel
     * This method sets the emotion's level between 1 and 3.
     * Deactivates the emotion if level is 0.
     */
    public void setLevel(int newLevel){
        if(newLevel <= 3 && newLevel > 0){
            emotionLevel = newLevel;
        } else if(newLevel == 0) {
            setDeactive();
        } else {
            System.out.println("You can't have emotion at level " + newLevel);
        }
    }

    /**
     * Description: Sets the current emotion to actived.
     */
    public void setActive(){
        isActive = true;
    }

    /**
     * Description: Sets the current emotion to deactivated.
     */
    public void setDeactive(){
        isActive = false;
    }
}