public class Main {
    public static void main(String[] args) {

        Note myNote = new Note(9f,9f, "Green");

        myNote.WriteOnNote("This isn an new message \n", 0.5f);
        myNote.WriteOnNote("I can't unwritten a note so this will be added to the note\n", 0.5f);
        myNote.WriteOnNote("I am so glad I didn't code a finite size \n", 0.5f);

        System.out.println(myNote.ReadCurrentSize());
    }
}