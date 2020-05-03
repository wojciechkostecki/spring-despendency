package pl.javastart.app.beans.decorators;

public class LowerCaseMessageDecorator implements MessageDecorator {
    @Override
    public String decorate(String msg) {
        return msg.toLowerCase();
    }
}
