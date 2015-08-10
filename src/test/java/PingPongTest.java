import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class PingPongTest {
    @Test
    public void pingPong_for1thruN_true() {
        PingPong testPingPong = new PingPong();
        ArrayList<String> testArray = new ArrayList<String>();
        testArray.add("1");
        testArray.add("2");
        assertEquals(testArray, testPingPong.pingPong(2));
    }

    @Test
    public void pingPong_ifDivisibleby15_PingPong_true() {
        PingPong testPingPong = new PingPong();
        ArrayList<String> testArray = new ArrayList<String>();
        testArray.add("1");
        testArray.add("2");
        testArray.add("ping");
        testArray.add("4");
        testArray.add("pong");
        testArray.add("ping");
        testArray.add("7");
        testArray.add("8");
        testArray.add("ping");
        testArray.add("pong");
        testArray.add("11");
        testArray.add("ping");
        testArray.add("13");
        testArray.add("14");
        testArray.add("ping pong");
        assertEquals(testArray, testPingPong.pingPong(15));
    }


    @Test
    public void pingPong_ifDivisibleby5_Pong_true() {
        PingPong testPingPong = new PingPong();
        ArrayList<String> testArray = new ArrayList<String>();
        testArray.add("1");
        testArray.add("2");
        testArray.add("ping");
        testArray.add("4");
        testArray.add("pong");
        testArray.add("ping");
        testArray.add("7");
        testArray.add("8");
        testArray.add("ping");
        testArray.add("pong");
        testArray.add("11");
        testArray.add("ping");
        testArray.add("13");
        testArray.add("14");
        testArray.add("ping pong");
        assertEquals(testArray, testPingPong.pingPong(15));
    }
    @Test
    public void pingPong_ifDivisibleby3_Ping_true() {
        PingPong testPingPong = new PingPong();
        ArrayList<String> testArray = new ArrayList<String>();
        testArray.add("1");
        testArray.add("2");
        testArray.add("ping");
        testArray.add("4");
        testArray.add("pong");
        testArray.add("ping");
        testArray.add("7");
        testArray.add("8");
        testArray.add("ping");
        testArray.add("pong");
        testArray.add("11");
        testArray.add("ping");
        testArray.add("13");
        testArray.add("14");
        testArray.add("ping pong");
        assertEquals(testArray, testPingPong.pingPong(15));
    }

    @Test
     public void pingPong_ifInteger_false(); {
        PingPong testPingPong = new PingPong();
        String notNum = "Enter a number";
        assertEquals(notNum, testPingPong.pingPong("r"));
    }
}
