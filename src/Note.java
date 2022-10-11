public class Note {

    int[] size = new int[2];
    String message;

    Note(int myX, int myY)
    {
        size[0] = myX;
        size[1] = myY;
        message ="";
    }

    public void WriteOnNote(String myWrite)
    {
        message += myWrite;
    }

    public String ReadFromNote()
    {
        return message;
    }

}
