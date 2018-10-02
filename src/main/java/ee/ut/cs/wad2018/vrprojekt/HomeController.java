package ee.ut.cs.wad2018.vrprojekt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class HomeController {

    @GetMapping(path = "/")
    public String getHomePage(
            @RequestParam(value="something", required=false, defaultValue="World") String nameFromUrl, Model model
    ) {
        model.addAttribute("pageTitle", "Minu kulud ja tulud");
        return "home/kulud-tulud";
    }

    @GetMapping(path = "/stats")
    public String getStatsPage(
            @RequestParam(value="something", required=false, defaultValue="World") String nameFromUrl, Model model
    ) {
        model.addAttribute("pageTitle", "Graafikud");
        return "home/stats";
    }

}
