public class SortSongs {
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

        // Bubble sort songs alphabetically; swap the artist together
        for (int i = 0; i < songs.length - 1; i++) {
            for (int j = 0; j < songs.length - 1 - i; j++) {
                if (songs[j].compareToIgnoreCase(songs[j + 1]) > 0) {
                    String tempSong = songs[j];
                    songs[j] = songs[j + 1];
                    songs[j + 1] = tempSong;
                    String tempArtist = artists[j];
                    artists[j] = artists[j + 1];
                    artists[j + 1] = tempArtist;
                }
            }
        }

        for (int i = 0; i < songs.length; i++) {
            System.out.println((i + 1) + ". " + songs[i] + " - " + artists[i]);
        }
    }
}
