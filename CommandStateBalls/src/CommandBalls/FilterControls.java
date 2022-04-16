package CommandBalls;

public class FilterControls implements CommandController{

    private Filter filter;

    public static final String Company = "COMPANY";
    public static final String Material = "MATERIAL";
    public static final String Range = "RANGE";
    public static final String ClearFilter = "ClearFilter";
    public static final String Section = "Section";

    public FilterControls() {
        this.filter = new Filter();
    }

    @Override
    public void execute(String cmd) {
        switch(cmd) {
            case Company: filter.chooseBrand();
                break;
            case Range: filter.choosePrice();
                break;
            case Material: filter.chooseQuality();
                break;
            case Section: filter.chooseType();
                break;
            case ClearFilter: filter.clearFilter();
                break;
            default: System.out.println("Haven't received any filter to apply");
                break;
        }
    }

    @Override
    public boolean Handle(String cmd) {
        if(cmd.equals(Company) || cmd.equals(Range) || cmd.equals(Material) || cmd.equals(Section) || cmd.equals(ClearFilter)) {
            return true;
        }
        return false;
    }
}
