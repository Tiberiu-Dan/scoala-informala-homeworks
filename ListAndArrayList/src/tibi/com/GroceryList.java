package tibi.com;

import java.util.ArrayList;

/**
 * Created by Tibi on 6/27/2017.
 */
public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        if (groceryList.contains(item))
            System.out.println("This item already exists in your list!!!");
        else {
            groceryList.add(item);
        }
    }
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0; i< groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }
    public void removeGroceryItem(String item){
        int position = findItem(item);
        if (position>=0){
            removeGroceryItem(item);
        }


    }
    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    private int findItem(String searchItem) {
//
        return groceryList.indexOf(searchItem);

    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void modifyGroceryItem(String curentItem, String newItem){
        int position = findItem(curentItem);
        if (position >=0){
            modifyGroceryItem(position,newItem);
        }


    }
    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if (position>=0){
            return true;
        }
        return false;
    }
}

