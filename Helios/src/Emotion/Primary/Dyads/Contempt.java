package Emotion.Primary.Dyads;

import Emotion.Emotion;
import Emotion.Prototype.Disgust;
import Emotion.Prototype.Anger;

/**
 * @author Jeremy Koepke
 *
 * Defines the PRIMARY DYAD emotion Contempt.
 */
public class Contempt extends Emotion{
    public EmotionType type = EmotionType.PRIMARY_DYAD;
    public boolean canSetActive;

    //Constructs contempt emotion.
    public Contempt(){
        emotionName = "Contempt";
        emotionLevel = 0;
        isActive = false;
    }

    //Attempts to set contempt as an active emotion.
    public void setActive(Disgust disgust, Anger anger){
        canSetActive(disgust, anger);

        if(canSetActive == true){
            setActive();
            System.out.println("Contempt was set to Active.");
        } else if(canSetActive == false){
            setDeactive();
            System.out.println("Contempt was not set to Active.");
        } else {
            System.out.println("Error in setting Contempt as Active.");
        }
    }

    //Tests to see if contempt's dependent emotions are active.
    public boolean canSetActive(Disgust disgust, Anger anger){
        if(disgust.isActive == false || anger.isActive == false){
            canSetActive = false;
            return(false);
        } else {
            canSetActive = true;
            return(true);
        }
    }
}