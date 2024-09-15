import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static ArrayList<Album> albums = new ArrayList<>();
    public static void main(String[] args) {

          Album album = new Album("English Songs" ,"Taylor_swift");

          album.addSongToAlbum("PillowTalk",4.2);
        album.addSongToAlbum("Love me like u do",3);
        album.addSongToAlbum("Deadpool",2.0);
        albums.add(album);

        album = new Album("Hindi Songs" ,"Arjit Singh");
        album.addSongToAlbum("Bulleya",0.2);
        album.addSongToAlbum("befikr",3.3);
        album.addSongToAlbum("saari k falls se",2.5);
        albums.add(album);

        LinkedList<Song> playList_1 = new LinkedList<>();
        System.out.println(albums + "Alubummm printting");
        albums.get(1).addToPlayList("Bulleya",playList_1);
        albums.get(1).addToPlayList("befikr",playList_1);
        albums.get(0).addToPlayList("Deadpool",playList_1);
        albums.get(0).addToPlayList("PillowTalk",playList_1);
        play(playList_1);

    }

    public static void play(LinkedList<Song> playlist){
        System.out.println(playlist + "playing thelist");
        printMenu();
        ListIterator<Song> listIterator = playlist.listIterator();
        boolean forward = true;
        if(!playlist.isEmpty()){
            System.out.println("Playing the first Song");
            System.out.println(listIterator.next().toString());
        }
        else{
            System.out.println("Sorry , playlist is Empty");
            return;
        }

        System.out.println("Enter your option");
        boolean quit = false;
        Scanner sc = new Scanner(System.in);

        while (!quit){
            int option = sc.nextInt();

            switch (option){
                case 0:
                    quit = true;
                    return;
                case 1:
                    if(forward == false){
                           listIterator.next();
                           forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Next song playing"+ listIterator.next().toString());
                        forward = true;
                    }
                    else{
                        System.out.println("u are at the last song");
                        forward = false;
                    }

                    break;
                case 2:
                    if(forward==true){
                        listIterator.previous();
                        forward=false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("previous song playing"+ listIterator.previous().toString());
                        forward = false;
                    }
                    else{
                        System.out.println("You are at the first song");
                        forward = false;

                    }
                    break;
                case 3:
                    if(forward==true){

                        if(listIterator.hasPrevious()){
                            System.out.println("Repeating the song "+listIterator.previous().toString());
                            forward = false;
                        }

                    }else{ //forward variable is false

                        if(listIterator.hasNext()){
                            System.out.println("Repeating the song "+listIterator.next().toString());
                            forward = true;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Printing all the songs");
                    printSongs(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
//                    delete the song from the playlist
            }
        }

    }

    public static void printSongs(LinkedList<Song> playList){
    }
    private static void printMenu(){
        System.out.println("Available options\n press");
        System.out.println("0 - to quit\n"+
                "1 - to play next song\n"+
                "2 - to play previous song\n"+
                "3 - to replay the current song\n"+
                "4 - list of all songs \n"+
                "5 - print all available options\n"+
                "6 - delete current song");
    }
}