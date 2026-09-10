public class Main {
    public static void main(String[] args) {
        File myFile = new File("/", "readme", "txt");
        File myPhoto = new File("/Documents/", "photo1", "jpg");
        File myDocument = new File("/Documents/", "homework", "doc");
        File myAudio = new File("/Downloads/", "SaWaDiKa", "mp3");

        Handler handlerA = new TextHandler();
        Handler handlerB = new ImageHandler();
        Handler handlerC = new DocumentHandler();

        handlerA.setNextHandler(handlerC);
        handlerC.setNextHandler(handlerB);

        handlerA.process(myFile);
        handlerA.process(myPhoto);
        handlerA.process(myDocument);
        handlerA.process(myAudio);
    }
}
