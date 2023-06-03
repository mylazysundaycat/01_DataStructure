import com.detect.AdvancedFireDetector;
import com.detect.Detectable;
import com.detect.FireDetector;
import com.playable.MusicPlayer;
import com.playable.Playable;
import com.playable.VideoPlayer;
import com.report.NormalReporter;
import com.report.Reportable;
import com.report.VideoReporter;

public class MainJavaCP10 {
    public static void main(String[] args) {


        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.area(5);
        r.area(4,6);


        Reportable normalReporter = new NormalReporter();
        normalReporter.report();

        Reportable videoReporter = new VideoReporter();
        videoReporter.report();

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();

        Playable mp = new MusicPlayer();
        mp.play();
        mp.pause();
        mp.stop();

        Playable vp = new VideoPlayer();
        vp.play();
        vp.pause();
        vp.stop();

    }
}
