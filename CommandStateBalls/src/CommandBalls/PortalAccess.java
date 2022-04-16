package CommandBalls;

public class PortalAccess implements CommandController{

    private Profile profile;

    public static final String Login = "Login";
    public static final String Logout = "Logout";

    public PortalAccess(){
        this.profile = new Profile();
    }

    @Override
    public void execute(String cmd) {
        switch (cmd) {
            case Login:
                profile.Login();
                break;
            case Logout:
                profile.Logout();
                break;
            default:
                System.out.println("Invalid action or access");
        }
    }

    @Override
    public boolean Handle(String cmd) {
        if(cmd.equals(Login) || cmd.equals(Logout)) {
            return true;
        }
        return false;
    }
}