package Emotion.Prototype;

import Emotion.Emotion;

/**
 * @author Jeremy Koepke
 *
 * Description: Defines the PROTOTYPE emotion Joy.
 */
public class Joy extends Emotion{
    public EmotionType type = EmotionType.PROTOTYPE;

    //Constructs joy emotion.
    public Joy(){
        emotionName = "Joy";
        emotionLevel = 0;
        isActive = false;
    }
}
