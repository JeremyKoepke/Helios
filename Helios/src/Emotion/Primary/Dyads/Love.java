package Emotion.Primary.Dyads;

import Emotion.Emotion;
import Emotion.Prototype.Joy;
import Emotion.Prototype.Trust;

/**
 * @author Jeremy Koepke
 *
 * Defines the PRIMARY DYAD emotion Love.
 */
public class Love extends Emotion{
    public EmotionType type = EmotionType.PRIMARY_DYAD;
    public boolean canSetActive;

    //Constructs love emotion.
    public Love(){
        emotionName = "Love";
        emotionLevel = 0;
        isActive = false;
    }

    //Attempts to set love as an active emotion.
    public void setActive(Joy joy, Trust trust){
        canSetActive(joy, trust);

        if(canSetActive == true){
            setActive();
            System.out.println("Love was set to Active.");
        } else if(canSetActive == false){
            setDeactive();
            System.out.println("Love was not set to Active.");
        } else {
            System.out.println("Error in setting Love as Active.");
        }
    }

    //Tests to see if love's dependent emotions are active.
    public boolean canSetActive(Joy joy, Trust trust){
        if(joy.isActive == false || trust.isActive == false){
            canSetActive = false;
            return(false);
        } else {
            canSetActive = true;
            return(true);
        }
    }
}