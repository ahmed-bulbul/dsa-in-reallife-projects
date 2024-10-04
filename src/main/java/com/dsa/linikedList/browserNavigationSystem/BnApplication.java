package com.dsa.linikedList.browserNavigationSystem;

public class BnApplication {

    public static void main(String[] args) {
        BrowserNavigation browser = new BrowserNavigation();

        // Visit pages
        browser.visit("https://example.com");
        browser.visit("https://google.com");
        browser.visit("https://stackoverflow.com");
        browser.visit("https://facebook.com");

        browser.back();
        browser.forward();
        browser.getCurrentPage();
        browser.getLastPage();
        browser.getFirstPage();
        browser.deleteByUrl("https://example.com");
        browser.getFirstPage();
    }
}
