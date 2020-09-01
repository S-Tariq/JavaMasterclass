package stariq.map;

import java.util.HashMap;
import java.util.Map;

public class Location {

    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>();
        this.exits.put("Q", 0);
    }

    public void addExit(String direction, int location){
        exits.put(direction, location);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        // Returns new object of hashmap that contains all the elements of exits stariq.map.
        // Prevents changes being made to the internal stariq.map.
        return new HashMap<String, Integer>(exits);
    }
}
