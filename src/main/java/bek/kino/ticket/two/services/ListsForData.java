package bek.kino.ticket.two.services;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Getter
@Setter
public class ListsForData {

	private static List<Integer> places = new ArrayList<>();

	static {
		for (int i = 1; i < 31; i++) {
			places.add(i);
		}
	}

	public static void minusPlace(int place1) {
		int index = 0;
		for(int i = 0;i<places.size();i++){
			if(places.get(i).equals(place1)){
				index = i;
			}
		}
		places.remove(index);
	}

	public static List<Integer> getPlaces() {
		return places;
	}

}
