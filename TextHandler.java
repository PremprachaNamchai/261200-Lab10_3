public class TextHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void process(File file) {
        if ("txt".equalsIgnoreCase(file.getFileType())) {
            System.out.println(file + " is being processed by " + getHandlerName());
        } else if (nextHandler != null) {
            System.out.println(getHandlerName()
                    + " cannot process so it passes the request to "
                    + nextHandler.getHandlerName());
            nextHandler.process(file);
        } else {
            System.out.println(file.getFileType() + " is not supported");
        }
    }

    @Override
    public String getHandlerName() {
        return "TextHandler";
    }
}