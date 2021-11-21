package app;

public class listenRadio {

    private Amplifier amp = new Amplifier("Top-O-Line Amplifier");
    private Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);

    public void startRadio() {
        tuner.on();
        tuner.setFrequency(99.8);

        amp.on();
        amp.setVolume(5);
        amp.setTuner(tuner);
    }

    public void stopRadio() {
        tuner.off();

        amp.off();
    }
}