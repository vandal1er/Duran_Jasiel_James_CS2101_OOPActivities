public class ArtistDemo {
    public static void main(String[] args) {
        // instance of Artist
        Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Nayeon Im", "Korean", 29, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();

        Dancer dancer = new Dancer("Doctor Who", "Filipino", 44, "Dance", DanceStyle.HIPHOP);
        dancer.displayInfo();

        System.out.println();

        Painter painter = new Painter("Vincent Gogh", "Unknown", 44, "Oil Paint", Medium.OIL);
        painter.displayInfo();

        System.out.println();

        Writer writer = new Writer("Stan Lee", "Unknown", 44, "Comics", WritingStyle.FICTION);
        writer.displayInfo();

    }
}