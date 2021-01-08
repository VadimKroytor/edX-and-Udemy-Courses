package PlaylistApplication;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    public boolean addSong(String songName, double songDuration) {
        boolean retVal = false;
        if (findSong(songName) == null) {
            songs.add(new Song(songName, songDuration));
            retVal = true;
        }
        return retVal;
    }

    private Song findSong(String songName) {
        Song songToRet = null;
        for (Song s : songs) {
            if (s.getTitle().equals(songName)) {
                songToRet = s;
                break;
            }
        }
        return songToRet;
    }

    public boolean addToPlayList(String songName, LinkedList<Song> playlist) {
        boolean retVal = false;
        Song song = findSong(songName);
        if (song != null) {
            playlist.add(song);
            retVal = true;
        }
        return retVal;
    }

    public boolean addToPlayList(int trackNum, LinkedList<Song> playlist) {
        boolean retVal = false;
        int counter = 1;
        /*
        ListIterator<Song> iterator;
        iterator = playlist.listIterator();
        while (iterator.hasNext() && retVal == false) {
            if (trackNum == counter) {

                retVal = true;
            }
            else {
                counter++;
                iterator.next();
            }
        }
        */
        for (Song s : songs) {
            if (trackNum == counter) {
                playlist.add(s);
                retVal = true;
                break;
            }
            else {
                counter++;
            }
        }
        return retVal;
    }


}
