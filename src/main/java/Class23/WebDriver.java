package Class23;

public abstract class WebDriver {
   abstract void openBrowser();
   abstract void loadURL(String url);
   abstract void performTesting();
   abstract void close();
}
class ChromeDriver extends  WebDriver{
    @Override
    void openBrowser() {
        System.out.println("Openining the Google Chrome Browser");
    }

    @Override
    void loadURL(String url) {
        System.out.println("Loading the URL "+url);
    }

    @Override
    void performTesting() {
        System.out.println("Performing Testing");
    }

    @Override
    void close() {
        System.out.println("Closing the Chrome Browser");
    }


}
class FireFoxDriver extends WebDriver{

    @Override
    void openBrowser() {
        System.out.println("Opening FireFox Browser");
    }

    @Override
    void loadURL(String url) {
        System.out.println("Loading the url in FireFox "+url);
    }

    @Override
    void performTesting() {
        System.out.println("Performing Testing in FireFox");
    }

    @Override
    void close() {
        System.out.println("Closing FireFox Browser");
    }
}