package Test.com.collection;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.collection.core.Chanson;
import com.collection.core.PlayList;

public class AppTest {
    

   
    @Test
    public void demoTestMethod() {
        PlayList playList = new PlayList();
        Chanson chanson1 = new Chanson("Bobitana", "Dj Arafat", 2);
        playList.addSong(chanson1); 
        assertTrue(playList.getChanson().contains(chanson1));
    }
}
