package CommandBalls;

import javax.swing.JOptionPane;

public class User {
    private Selection actions;
    private String cmds[] = {PortalAccess.Login,PortalAccess.Logout,
            Selection.PRICE,Selection.BRAND,Selection.QUALITY,Selection.STOP};

    public User(Selection actions) {
        this.actions = actions;
    }

    public void useCommand(String cmd) {
        System.out.println();
        System.out.println();
        actions.execute(cmd);
    }
}
