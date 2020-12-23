package de.adventOfCode.aoc2020;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InputController {
	
	@GetMapping("/inputform")
	public String showForm(Model model) {
		InputTemp inputTemp = new InputTemp();
		model.addAttribute("inputTemp", inputTemp);

		return "inputform";
	}
//	"/register"
	@PostMapping("/inputform")
	public String submitForm(@ModelAttribute("inputTemp") InputTemp inputTemp) {
		System.out.println(inputTemp);

		//TODO: Set comparisonResults
		inputTemp.setInputResults("Jo hier könnte dann was stehen! Zum Beispiel: " + inputTemp.getInputValue() + " :-) ");

		return "output";
	}
}
