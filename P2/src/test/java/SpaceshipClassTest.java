import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SpaceshipClassTest {

    private SpaceshipClass spaceship;


    @Before
    public void createSpaceship(){
        spaceship = new SpaceshipClass(100);

    }

    @Test
    public void testBoard(){
        spaceship.board("Diana", 20);
        List<String> l = spaceship.getCrewNames();
        assertTrue(l.contains("Diana"));
    }


//    @Test
//    public void testRemoveCrewMember(){
//
//    }

    @Test
    public void testUnboard(){
        spaceship.unboard("Diana");
        List<String> l1 = spaceship.getCrewNames();
        assertFalse(l1.contains("Diana"));
    }

//    @Test
//    public void testFlyTo(){
//        spaceship.flyTo("venus", 3);
//    }



}