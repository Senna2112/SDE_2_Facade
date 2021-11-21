package app;

public class watchMovie {

    private PopcornPopper popper = new PopcornPopper("Popcorn Popper");
    private TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
    private Screen screen = new Screen("Theater Screen");
    private Amplifier amp = new Amplifier("Top-O-Line Amplifier");
    private DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
    private Projector projector = new Projector("Top-O-Line Projector", dvd);

    public void startMovie() {
        popper.on();
        popper.pop();

        lights.dim(10);

        screen.down();
        projector.on();
        projector.wideScreenMode();

        amp.on();
        amp.setSurroundSound();
        amp.setVolume(5);

        dvd.on();
        dvd.play("Harry Potter: Herres in Zwijnstein");
    }

    public void stopMovie() {
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();

        dvd.stop();
        dvd.eject();
        dvd.off();
    }

}
