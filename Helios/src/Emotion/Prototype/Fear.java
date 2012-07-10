package Emotion.Prototype;

import Emotion.Emotion;

/**
 * @author Jeremy Koepke
 *
 * Description: Defines the PROTOTYPE emotion Fear.
 */
public class Fear extends Emotion{
    public EmotionType type = EmotionType.PROTOTYPE;

    //Constructs fear emotion.
    public Fear(){
        emotionName = "Fear";
        emotionLevel = 0;
        isActive = false;
    }
}
