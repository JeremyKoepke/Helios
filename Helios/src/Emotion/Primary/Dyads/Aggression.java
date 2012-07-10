package Emotion.Primary.Dyads;

import Emotion.Emotion;
import Emotion.Prototype.Anger;
import Emotion.Prototype.Anticipation;

/**
 * @author Jeremy Koepke
 *
 * Defines the PRIMARY DYAD emotion aggression.
 */
public class Aggression extends Emotion{
    public EmotionType type = EmotionType.PRIMARY_DYAD;
    public boolean canSetActive;

    //Constructs aggression emotion.
    public Aggression(){
        emotionName = "Agression";
        emotionLevel = 0;
        isActive = false;
    }

    //Attempts to set aggression as an active emotion.
    public void setActive(Anger anger, Anticipation anticipation){
        canSetActive(anger, anticipation);

        if(canSetActive == true){
            setActive();
            System.out.println("Aggression was set to Active.");
        } else if(canSetActive == false){
            setDeactive();
            System.out.println("Aggression was not set to Active.");
        } else {
            System.out.println("Error in setting Aggression as Active.");
        }
    }

    //Tests to see if aggression's dependent emotions are active.
    public boolean canSetActive(Anger anger, Anticipation anticipation){
        if(anger.isActive == false || anticipation.isActive == false){
            canSetActive = false;
            return(false);
        } else {
            canSetActive = true;
            return(true);
        }
    }
}