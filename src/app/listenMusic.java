package app;

public class listenMusic {

    private TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
    private Amplifier amp = new Amplifier("Top-O-Line Amplifier");
    private CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);

    public void startMusic () {
        lights.on();

        amp.on();
        amp.setVolume(5);
        amp.setStereoSound();

        cd.on();
        cd.play("Wait and Bleed - Slipknot");
    }

    public void stopMusic() {
        amp.off();
        amp.setCd(cd);

        cd.eject();
        cd.off();
    }
}