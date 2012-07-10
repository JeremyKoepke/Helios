package Emotion.Primary.Dyads;

import Emotion.Emotion;
import Emotion.Prototype.Fear;
import Emotion.Prototype.Surprise;

/**
 * @author Jeremy Koepke
 *
 * Defines the PRIMARY DYAD emotion Alarm.
 */
public class Alarm extends Emotion{
    public EmotionType type = EmotionType.PRIMARY_DYAD;
    public boolean canSetActive;

    //Constructs alarm emotion.
    public Alarm(){
        emotionName = "Alarm";
        emotionLevel = 0;
        isActive = false;
    }

    //Attempts to set alarm as an active emotion.
    public void setActive(Fear fear, Surprise surprise){
        canSetActive(fear, surprise);

        if(canSetActive == true){
            setActive();
            System.out.println("Alarm was set to Active.");
        } else if(canSetActive == false){
            setDeactive();
            System.out.println("Alarm was not set to Active.");
        } else {
            System.out.println("Error in setting Alarm as Active.");
        }
    }

    //Tests to see if alarm's dependent emotions are active.
    public boolean canSetActive(Fear fear, Surprise surprise){
        if(fear.isActive == false || surprise.isActive == false){
            canSetActive = false;
            return(false);
        } else {
            canSetActive = true;
            return(true);
        }
    }
}