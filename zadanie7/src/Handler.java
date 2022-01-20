public abstract class Handler {
    protected Handler successor;
    protected abstract void succesAction(Text text);
    protected abstract void failureAction(Text text);
    protected abstract boolean canExecute(Text text);

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public void handle(Text text) {
        if(canExecute(text)) {
            succesAction(text);
        } else {
            failureAction(text);
        }
        if(successor != null) {
            successor.handle(text);
        }
    }
}
