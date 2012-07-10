package Emotion.Prototype;

import Emotion.Emotion;

/**
 * @author Jeremy Koepke
 *
 * Description: Defines the PROTOTYPE emotion Disgust.
 */
public class Disgust extends Emotion{
    public EmotionType type = EmotionType.PROTOTYPE;

    //Constructs disgust emotion.
    public Disgust(){
        emotionName = "Disgust";
        emotionLevel = 0;
        isActive = false;
    }
}
