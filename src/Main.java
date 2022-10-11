public class Main {
    public static void main(String[] args) {

        Note myNote = new Note(9,9);

        myNote.WriteOnNote("This isn an new message \n");
        myNote.WriteOnNote("I can't unwritten a note so this will be added to the note\n");
        myNote.WriteOnNote("I am so glad I didn't code a finite size \n");

        System.out.println(myNote.ReadFromNote());
    }
}