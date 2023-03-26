import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.collection.core.Chanson;
import com.collection.core.PlayList;

public class App {
    public static void main(String[] args) throws Exception {
        Runnable r = () ->{
                ArrayList<Chanson> listOfChanson = new ArrayList<Chanson>();
                listOfChanson.addAll(List.of(
                    new Chanson("Bohemian Rhapsody", "Queen", 367),
                    new Chanson("Stairway to Heaven", "Queen", 480),
                    new Chanson("Hotel California", "The Eagles", 390),
                    new Chanson("Imagine", "John Lennon", 182),
                    new Chanson("Thriller", "Michael Jackson", 357),
                    new Chanson("Smells Like Teen Spirit", "Nirvana", 301),
                    new Chanson("Sweet Child O' Mine", "Guns N' Roses", 356),
                    new Chanson("Livin' on a Prayer", "Bon Jovi", 248),
                    new Chanson("Billie Jean", "Michael Jackson", 294),
                    new Chanson("Another Brick in the Wall", "Pink Floyd", 360)
                ));
            PlayList playList = new PlayList(listOfChanson);
            // playList.addSong(new Chanson("Bobitana", "Dj Arafat", 248) );
            System.out.println(playList.getArtistSongs("Queen"));
        };
        r.run();
    }
}
