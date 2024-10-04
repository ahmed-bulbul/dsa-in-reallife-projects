package com.dsa.linikedList.browserNavigationSystem;

public class BrowserNavigation {
    private Node current;

    public void visit(String url) {
        Node newNode = new Node(url);

        if(current != null){
            current.setNext(newNode);
            newNode.setPrev(current);
        }

        current = newNode;
        System.out.println("Visited url "+url);
    }

    public void back(){
        if(current !=null && current.getPrev() !=null){
            current = current.getPrev();
            System.out.println("Back to :"+current.getUrl());
        }else{
            System.out.println("No previous page");
        }
    }

    public void forward(){
        if(current !=null && current.getNext() !=null){
            current = current.getNext();
            System.out.println("Forward to: "+current.getUrl());
        }else{
            System.out.println("No next page");
        }
    }

    public void getCurrentPage(){
        if (current!=null){
            System.out.println("Current page :"+current.getUrl());
        }else{
            System.out.println("No page loaded");
        }
    }

    public void getLastPage(){
        if(current!=null){
            while (current.getNext() != null){
                current = current.getNext();
            }
            System.out.println("Last Page is "+current.getUrl());
        }
    }

    public void getFirstPage(){
        if(current !=null){
            while (current.getPrev() !=null){
                current = current.getPrev();
            }
            System.out.println("First page is "+current.getUrl());
        }
    }
}
