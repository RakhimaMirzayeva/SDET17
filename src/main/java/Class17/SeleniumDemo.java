package Class17;


import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public static void main(String[] args) throws InterruptedException {


        ChromeDriver chrome=new ChromeDriver();
        chrome.navigate().to("https:facebook.com");//telling java to navigate
        System.out.println(chrome.getTitle());
        Thread.sleep(5000);


        chrome.navigate().to("http://amazon.com");
        Thread.sleep(3000);//telling java to open facebook wait 3 sec


        chrome.navigate().to("http://facebook.com");
        Thread.sleep(5000);
        chrome.close();//telling to close
    }

    }

