import java.util.*;
import java.util.stream.Collectors;

public class Place{
    private List<Place> places = new ArrayList<>();

    public void addPlace(Place place) {
        places.add(place);
    }

    public List<Place> getAllPlaces() {
        return places;
    }

    public List<Place> searchPlaces(String keyword) {
        return places.stream()
                .filter(p -> p.getName().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Place> filterByDistance(int maxDistance) {
        return places.stream()
                .filter(p -> p.getDistance() <= maxDistance)
                .collect(Collectors.toList());
    }

    public List<Place> sortByDistance() {
        return places.stream()
                .sorted(Comparator.comparingInt(Place::getDistance))
                .collect(Collectors.toList());
    }

    public Optional<Place> findByName(String name) {
        return places.stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .findFirst();
    }

    public int calculateDistance(String name1, String name2) {
        Optional<Place> p1 = findByName(name1);
        Optional<Place> p2 = findByName(name2);
        if (p1.isPresent() && p2.isPresent()) {
            return Math.abs(p1.get().getDistance() - p2.get().getDistance());
        }
        return -1; // Not found
    }
}
