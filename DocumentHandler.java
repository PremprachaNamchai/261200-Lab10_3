public class DocumentHandler extends AbstractHandler {
    @Override
    public void process(File file) {
        if ("doc".equalsIgnoreCase(file.getFileType())) {
            System.out.println(file + " is being processed by " + getHandlerName());
        } else {
            passToNext(file);
        }
    }

    @Override
    public String getHandlerName() {
        return "DocumentHandler";
    }
}