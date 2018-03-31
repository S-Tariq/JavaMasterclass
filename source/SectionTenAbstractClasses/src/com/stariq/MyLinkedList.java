package com.stariq;

public class MyLinkedList implements NodeList {

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null){
            // The list was empty, so this item becomes the head of the list
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = currentItem.compareTo(newItem);
            if(comparison < 0){
                // newItem is greater, move right if possible
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                } else {
                    // there is no next, insert end of list
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    //newItem.setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0){
                // newItem is less, move left if possible
                if(currentItem.previous() != null){
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    //newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                    //currentItem.setPrevious(newItem);
                } else {
                    // there is no previous, insert start of list
                    newItem.setNext(this.root).setPrevious(newItem);
                    //this.root.setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                // equal
                System.out.println(newItem.getValue() + " is present therefore not added");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

        if(root == null){
            System.out.println("List is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
