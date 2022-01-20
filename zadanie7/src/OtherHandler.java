public class OtherHandler extends Handler {
    @Override
    protected void succesAction(Text text) {
        return;
    }

    @Override
    protected void failureAction(Text text) {
        text.setText(text.getText() + " To nie jest wiadomość z kategorii inne.");
    }

    @Override
    protected boolean canExecute(Text text) {
        if(text.getCategory().equals("OTHER"))
            return true;
        else
            return false;
    }
}
