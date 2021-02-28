package be.thomasmore.party.controllers;

import be.thomasmore.party.model.Merk;
import be.thomasmore.party.repositories.MerkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class HomeController {

    @Autowired
    private MerkRepository merkRepository;

    @GetMapping({"/", "/home"})
    public String home(Model model) {
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        return "about";
    }


    @GetMapping({"/merkdetails", "/merkdetails/{id}"})
    public String merkDetails(Model model,
                                @PathVariable(required = false) Integer id) {
        if (id == null) return "merkdetails";

        Optional<Merk> optionalMerk = merkRepository.findById(id);
        if (optionalMerk.isPresent()) {
            long nrOfMerken = merkRepository.count();
            model.addAttribute("merk", optionalMerk.get());
            model.addAttribute("prevId", id > 1 ? id - 1 : nrOfMerken);
            model.addAttribute("nextId", id < nrOfMerken ? id + 1 : 1);
        }
        return "merkdetails";
    }

    @GetMapping("/merklist")
    public String merkList(Model model) {
        Iterable<Merk> merken = merkRepository.findAll();
        model.addAttribute("merken", merken);
        return "merklist";
    }

    @GetMapping("/error")
    public String error(Model model){
        return "error";
    }

}

