package demo.box;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class BoxController {

	private static ArrayList<Box> BOXES = new ArrayList<Box>();

	@GetMapping("/add")
	public Box add(@RequestParam(value = "name") String name, @RequestParam(value = "weight") int weight,
			@RequestParam(value = "colour") String colour, @RequestParam(value = "country") String country) {

		Box box = new Box(name, weight, colour, country);
		BOXES.add(box);
		return box;
	}

	@GetMapping("/getList")
	public ArrayList<Box> list() {

		// Add example data
		if (BOXES.isEmpty()) {
			BOXES.add(new Box("A name", 1, "FF0000", "sweden"));
			BOXES.add(new Box("Another name", 2, "00FF00", "china"));
		}
		return BOXES;
	}
}