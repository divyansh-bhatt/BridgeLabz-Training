@FunctionalInterface
interface LightAction{
    void activate();
}
public class SmartHome {
    public static void main(String[] args) {

        LightAction motionTrigger = () ->
                System.out.println("Lights ON at 100% brightness");

        LightAction nightTimeTrigger = () ->
                System.out.println("Lights ON at 30% warm light");

        LightAction voiceCommandTrigger = () ->
                System.out.println("Lights ON in party mode 🎉");

        motionTrigger.activate();
        nightTimeTrigger.activate();
        voiceCommandTrigger.activate();
    }
}
