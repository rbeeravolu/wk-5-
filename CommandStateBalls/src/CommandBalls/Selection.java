package CommandBalls;

import java.util.Iterator;
import java.util.List;

public class Selection implements CommandController{

    private List<CommandController> options;

    public Selection(List<CommandController> options) {
        options.add(this);
        this.options = options;
    }

    public static final String PRICE = "PRICE";
    public static final String BRAND = "BRAND";
    public static final String QUALITY = "QUALITY";
    public static final String STOP = "STOP";

    @Override
    public void execute(String cmd) {
        Iterator<CommandController> cmdIterator = this.options.iterator();
        while (cmdIterator.hasNext()) {
            CommandController cmdController = cmdIterator.next();
            if(cmdController instanceof Selection) {
                switch (cmd) {
                    case Selection.PRICE:
                        this.price();
                        break;
                    case Selection.BRAND:
                        this.brand();
                        break;
                    case Selection.QUALITY:
                        this.quality();
                        break;
                    case Selection.STOP:
                        System.out.println("Clearing the existing execution");
                        //System.exit(0);
                }
            }else if(cmdController.Handle(cmd)) {
                cmdController.execute(cmd);
            }
        }
    }

    @Override
    public boolean Handle(String cmd) {
        if(cmd.equals(PRICE) || cmd.equals(BRAND) || cmd.equals(QUALITY) || cmd.equals(STOP)) {
            return true;
        }
        return false;
    }

    public void price() {
        System.out.println("*********** Choose Filter for Purchase ***********");
        this.execute(PortalAccess.Login);
        this.execute(FilterControls.ClearFilter);
        this.execute(FilterControls.Section);
        this.execute(FilterControls.Range);
        this.execute(PortalAccess.Logout);
        System.out.println("*********** Sorted Based on Price ***********");
    }

    public void brand() {
        System.out.println("*********** Choose Filter for Purchase ***********");
        this.execute(PortalAccess.Login);
        this.execute(FilterControls.ClearFilter);
        this.execute(FilterControls.Section);
        this.execute(FilterControls.Company);
        this.execute(PortalAccess.Logout);
        System.out.println("*********** Sorted Based on Brand ***********");
    }

    public void quality() {
        System.out.println("*********** Choose Filter for Purchase ***********");
        this.execute(PortalAccess.Login);
        this.execute(FilterControls.ClearFilter);
        this.execute(FilterControls.Section);
        this.execute(FilterControls.Material);
        this.execute(PortalAccess.Logout);
        System.out.println("*********** Sorted Based on Material ***********");
    }
}