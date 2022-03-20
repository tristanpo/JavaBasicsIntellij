package com.syntax.Class24;

public class Browser {
    void openBrowser(){
        System.out.println("Opening the ");
    }
    void loadPage(String websiteLink){
        System.out.println("loading the website"+websiteLink);
    }
    void testThePage(){
        System.out.println("Testing the page");
    }
    void closeBrowser(){
        System.out.println("Closing the browser");
    }
}
class GoogleChrome extends Browser{
    void openBrowser(){
        System.out.println("Opening the GoogleChrome browser ");
    }
    void loadPage(String websiteLink){
        System.out.println("loading the website"+websiteLink+" in GoogleChrome");
    }
    void testThePage(){
        System.out.println("Testing the page GoogleChrome");
    }
    void closeBrowser(){
        System.out.println("Closing the GoogleChrome browser");
    }
}
/*
shortcut to find and replace is ctrl+r on windows
 */
class FireFox extends Browser{
    void openBrowser(){
        System.out.println("Opening the FireFox browser ");
    }
    void loadPage(String websiteLink){
        System.out.println("loading the website"+websiteLink+" in FireFox");
    }
    void testThePage(){
        System.out.println("Testing the page FireFox");
    }
    void closeBrowser(){
        System.out.println("Closing the FireFox browser");
    }
}
class Safari extends Browser{
    void openBrowser(){
        System.out.println("Opening the Safari browser ");
    }
    void loadPage(String websiteLink){
        System.out.println("loading the website"+websiteLink+" in Safari");
    }
    void testThePage(){
        System.out.println("Testing the page Safari");
    }
    void closeBrowser(){
        System.out.println("Closing the Safari browser");
    }
}
class IE extends Browser{
    void openBrowser(){
        System.out.println("Opening the IE browser ");
    }
    void loadPage(String websiteLink){
        System.out.println("loading the website"+websiteLink+" in IE");
    }
    void testThePage(){
        System.out.println("Testing the page IE");
    }
    void closeBrowser(){
        System.out.println("Closing the IE browser");
    }
}