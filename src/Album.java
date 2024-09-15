import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    // album variables
     String albumName;
     String singerName;
     ArrayList<Song> songs;
// constructor creation of album
     public Album(String albumName , String singerName){
         this.albumName = albumName;
         this.singerName = singerName;
         this.songs = new ArrayList<>();
     }

     // searching of song
    public boolean findSing(String title){
         for(Song song: songs){
             if(song.getTitle().equals(title)){
                 return  true;
             }
         }
         return false;
    }
  // add the song to album
     public  void addSongToAlbum(String title , double duration){
         if(findSing(title)){
             System.out.println("Song is already added");
         }
         else{
             Song song = new Song(title , duration);

             songs.add(song);
             System.out.println("Song added successfully");
         }

     }


//    public void addToPlayList(int trackNo, LinkedList<Song> playList){
//
//        //How we will get the Song Object ????
//
//        int index = trackNo - 1;
//
//        //Get the song Object :
//
//        if(index>=0&&index<songs.size()){
//
//            Song song = this.songs.get(index);
//            playList.add(song);
//
//        }
//
//    }

    public void addToPlayList(String title,LinkedList<Song>playList){

        //How to do this...

        //findSong() --> true false only and not the object
        System.out.println(songs +"printing alll the songgs");
        for(Song song:this.songs){ //Iterating over the songs
            System.out.println(title + "idhrrr ayya akya tu" + song.getTitle());

            if(song.getTitle().equals(title)){
                System.out.println(title + "idhrrr ayya akya tu");
                //I found a Song Object
                //I need to add it..
                playList.add(song);

            }

        }
    }
}
