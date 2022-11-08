package NoteBook;

public class GameBook extends NoteBook{
    String videoCard;

    public GameBook(String videoCard) {
        this.videoCard = videoCard;
    }
    @Override
    void freez(){
        System.out.println("доп кулеры ");
    }

}
