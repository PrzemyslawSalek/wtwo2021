public class ImportantHandler extends Handler {
    @Override
    protected void succesAction(Text text) {
        text.setText("UWAGA! WAŻNA WIADOMOŚĆ " + text.getText());
    }

    @Override
    protected void failureAction(Text text) {
        text.setText(text.getText() + " To nie jest ważna wiadomość");
    }

    @Override
    protected boolean canExecute(Text text) {
        if(text.getCategory().equals("IMPORTANT"))
            return true;
        else
            return false;
    }
}
