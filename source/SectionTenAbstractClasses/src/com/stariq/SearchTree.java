package com.stariq;

public class SearchTree implements NodeList {

    private ListItem root = null;

    public SearchTree(ListItem root){
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {

        if(this.root == null){
            // the tree was empty, so this item becomes the head of the tree
            this.root = item;
            return true;
        }

        // otherwise, compare from the head of the tree
        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = currentItem.compareTo(item);
            if(comparison < 0){
                // item is greater, move right if possible
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                } else {
                    // there is no node to the right, so add at this point
                    currentItem.setNext(item);
                    return true;
                }
            } else if (comparison > 0){
                // item is less, move left if possible
                if(currentItem.previous() != null){
                    currentItem = currentItem.previous();
                } else {
                    // there is no node to the left, so add at this point
                    currentItem.setPrevious(item);
                    return true;
                }
            } else {
                // equal, so do not add
                System.out.println(item.getValue() + " is already present");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null){
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while(currentItem != null){
            int comparison = currentItem.compareTo(item);
            if(comparison < 0){
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if (comparison > 0){
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent){
        // remove item from the tree
        if(item.next() == null){
            // no right tree, so make parent point to left tree (which may be null)
            if(parent.next() == item){
                // item is right child of its parent
                parent.setNext(item.previous());
            } else if (parent.previous() == item){
                // item is left child of its parent
                parent.setPrevious(item.previous());
            } else {
                // parent must be item, which means we were looking at the root of the tree
                this.root = item.previous();
            }
        } else if (item.previous() == null){
            // no left tree, so make parent point to right tree (which may be null)
            if(parent.next() == item){
                // item is right child of its parent
                parent.setNext(item.next());
            } else if (parent.previous() == item){
                // item is left child of its parent
                parent.setPrevious(item.next());
            } else {
                // again, we are deleting the root
                this.root = item.next();
            }
        } else {
            
        }
    }

    @Override
    public void traverse(ListItem root) {
        // recursive method
        if(root != null){
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
