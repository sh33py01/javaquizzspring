@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}