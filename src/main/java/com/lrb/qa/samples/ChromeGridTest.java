package com.lrb.qa.samples;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class ChromeGridTest {

    public static void main(String[] args) throws MalformedURLException {

        //Start the selenium hub server:
        //  java -jar selenium-server-standalone-3.10.0.jar -role hub
        //
        //Logs shows result e.g.:
        //  INFO [Hub.start] - Nodes should register to http://10.0.0.10:4444/grid/register/
        //  INFO [Hub.start] - Clients should connect to http://10.0.0.10:4444/wd/hub

        //Check if hub server is running:
        //  http://10.0.0.10:4444
        //  http://10.0.0.10:4444/grid/console

        //Register node to hub server:
        //  java -Dwebdriver.chrome.driver="/Users/admin/Downloads/chromedriver" -jar selenium-server-standalone-3.10.0.jar -role node -hub http://10.0.0.10:4444/grid/register/ -port 5555

        //Logs shows result e.g:
        //  INFO [SelfRegisteringRemote.registerToHub] - Registering the node to the hub: http://10.0.0.10:4444/grid/register
        //  INFO [SelfRegisteringRemote.registerToHub] - Updating the node configuration from the hub
        //  INFO [SelfRegisteringRemote.registerToHub] - The node is registered to the hub and ready to use

        //Check if node is registered to hub:
        //  http://10.0.0.10:4444/grid/console


        //Define the desired capabilities
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setBrowserName("chrome");
        desiredCapabilities.setPlatform(Platform.MAC);

        //Chrome options definition
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.merge(desiredCapabilities);

        String hubUrl = "http://10.0.0.10:4444/wd/hub";
        WebDriver webDriver = new RemoteWebDriver(new URL(hubUrl), chromeOptions);
        webDriver.get("http://www.google.com");
        System.out.println("Page Title: " + webDriver.getTitle());
        webDriver.quit();
    }
}
