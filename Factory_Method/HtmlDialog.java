package Factory_Method;

public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();   
    }
}
