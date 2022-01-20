public class SpamHandler extends Handler {
    @Override
    protected void succesAction(Text text) {
        text.setText("UWAGA! TO JEST SPAM " + text.getText());
    }

    @Override
    protected void failureAction(Text text) {
        text.setText(text.getText() + " To nie jest spam.");
    }

    @Override
    protected boolean canExecute(Text text) {
        if(text.getCategory().equals("SPAM"))
            return true;
        else
            return false;
    }
}
