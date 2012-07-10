package Emotion.Primary.Dyads;

import Emotion.Emotion;
import Emotion.Prototype.Surprise;
import Emotion.Prototype.Sadness;

/**
 * @author Jeremy Koepke
 *
 * Defines the PRIMARY DYAD emotion Disappointment.
 */
public class Disappointment extends Emotion{
    public EmotionType type = EmotionType.PRIMARY_DYAD;
    public boolean canSetActive;

    //Constructs disappointment emotion.
    public Disappointment(){
        emotionName = "Disappointment";
        emotionLevel = 0;
        isActive = false;
    }

    //Attempts to set disappointment as an active emotion.
    public void setActive(Surprise surprise, Sadness sadness){
        canSetActive(surprise, sadness);

        if(canSetActive == true){
            setActive();
            System.out.println("Disappointment was set to Active.");
        } else if(canSetActive == false){
            setDeactive();
            System.out.println("Disappointment was not set to Active.");
        } else {
            System.out.println("Error in setting Disappointment as Active.");
        }
    }

    //Tests to see if contempt's dependent emotions are active.
    public boolean canSetActive(Surprise surprise, Sadness sadness){
        if(surprise.isActive == false || sadness.isActive == false){
            canSetActive = false;
            return(false);
        } else {
            canSetActive = true;
            return(true);
        }
    }
}