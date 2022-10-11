public class Note {

    private float[] size = new float[2];
    private float[][] spaceTakenUp = new float[2][2];
    private String colour;
    private String message;
    private boolean fliped;

    Note(float myX, float myY, String myColour)
    {
        this.size[0] = myX;
        this.size[1] = myY;
        this.colour = myColour;
        this.message ="";
        this.fliped = false;
    }

    public void WriteOnNote(String myWrite, float fontSize)
    {
        char[] myCharArr = myWrite.toCharArray();
        float xPointer, yPointer;

        for (char myChar:myCharArr) {



        }

        message += myWrite;
    }

    public void FlipNote()
    {
        fliped = !fliped;
    }

    public String ReadCurrentSize()
    {
        return message;
    }



}
