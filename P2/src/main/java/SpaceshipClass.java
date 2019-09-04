import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class SpaceshipClass implements SpaceShip {

    private int foodOnBoard;
    private List<String> planets;
    private List<String> crewMembersName;
    private HashMap<String, Integer> hashMap;  //nume+mancare
    //private int foodPerDay;
    //boolean consumeFood;


    public SpaceshipClass(int foodOnBoard) {
        this.foodOnBoard = foodOnBoard;
        this.planets = new ArrayList<>();
        this.crewMembersName = new ArrayList<>();
        this.hashMap = new HashMap<>();
    }



    public void board(String crewMemberName, int foodPerDay) {
        crewMembersName.add(crewMemberName);
        hashMap.put(crewMemberName,foodPerDay);

    }

    public void unboard(String crewMemberName) {
        removeCrewMember(crewMemberName);
        this.hashMap.remove(crewMemberName);

    }


    public void removeCrewMember(String crewMemberName){
        for(int i=0; i<crewMembersName.size(); i++){
            if(crewMembersName.get(i).equals(crewMemberName)){
                crewMembersName.remove(i);
                break;
            }
        }
    }


    public List<String> getCrewNames(){
        return this.crewMembersName;
    }

    public String getPlanetsVisited() {
        return planets.toString();

    }

    public boolean flyTo(String planetName, int daysRequired) {
        int foodNeeded = foodForMembers(daysRequired);

        if(foodNeeded <= this.foodOnBoard){
            this.foodOnBoard -= foodNeeded;
            this.planets.add(planetName);
            return true;
        }
        return false;



    }


    private int foodForMembers(int numberOfDays){
        if(numberOfDays == 0) return 0;

        int foodForDay = 0;
        for(int i=0; i<=hashMap.size();i++){
            foodForDay += hashMap.get(hashMap.keySet());

        }
        return foodForDay * numberOfDays;
    }
}
