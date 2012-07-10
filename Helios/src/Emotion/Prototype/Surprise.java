package Emotion.Prototype;

import Emotion.Emotion;

/**
 * @author Jeremy Koepke
 *
 * Description: Defines the PROTOTYPE emotion Surprise.
 */
public class Surprise extends Emotion{
    public EmotionType type = EmotionType.PROTOTYPE;

    //Constructs surprise emotion.
    public Surprise(){
        emotionName = "Surprise";
        emotionLevel = 0;
        isActive = false;
    }
}
