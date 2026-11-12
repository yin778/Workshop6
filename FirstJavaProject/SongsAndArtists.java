public class SongsAndArtists {
    public static void main(String[] args) {
        String[] songs = {
            "Bohemian Rhapsody", "Imagine", "Hey Jude",
            "Like a Rolling Stone", "Smells Like Teen Spirit",
            "Billie Jean", "Hotel California", "Stairway to Heaven",
            "Sweet Child O' Mine", "Hallelujah"
        };
        String[] artists = {
            "Queen", "John Lennon", "The Beatles", "Bob Dylan",
            "Nirvana", "Michael Jackson", "Eagles", "Led Zeppelin",
            "Guns N' Roses", "Leonard Cohen"
        };

        for (int i = 0; i < songs.length; i++) {
            System.out.println((i + 1) + ". " + songs[i] + " - " + artists[i]);
        }
    }
}
