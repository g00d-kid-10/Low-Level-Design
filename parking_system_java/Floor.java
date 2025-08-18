package parking_system;

import java.util.List;
import java.util.ArrayList;

class Floor {
    private String floorId;
    private List<Spot> spots;

    public Floor(String id, int size) {
        this.floorId = id;
        this.spots = new ArrayList<>();
        for(int i = 0; i < size; i++) {
            String key = floorId + i;
            Spot spot = new Spot(key);
            spots.add(spot);
        }
    }

    public List<Spot> getSpots() {
        return spots;
    }

    @Override
    public String toString() {
        return "Floor{" + floorId + ": " + "spots=" + spots + '}';
    }
}