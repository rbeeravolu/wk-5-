package UnitTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


import CommandBalls.CommandController;
import CommandBalls.FilterControls;
import CommandBalls.PortalAccess;
import CommandBalls.Selection;
import CommandBalls.User;
import StateBalls.OrderDeliveryService;
import StateBalls.OrderServiceBuilder;

public class UnitTest {

    @Test
    public void atestBrand() {
        PortalAccess portalAccess = new PortalAccess();
        FilterControls filterControls = new FilterControls();
        List<CommandController> cmdControls = new ArrayList<CommandController>();
        cmdControls.add(portalAccess);
        cmdControls.add(filterControls);
        Selection a = new Selection(cmdControls);
        User u = new User(a);
        u.useCommand("BRAND");
    }

    @Test
    public void btestPrice() {
        PortalAccess portalAccess = new PortalAccess();
        FilterControls filterControls = new FilterControls();
        List<CommandController> cmdControls = new ArrayList<CommandController>();
        cmdControls.add(portalAccess);
        cmdControls.add(filterControls);
        Selection a = new Selection(cmdControls);
        User u = new User(a);
        u.useCommand("PRICE");
    }

    @Test
    public void ctestQuality() {
        PortalAccess portalAccess = new PortalAccess();
        FilterControls filterControls = new FilterControls();
        List<CommandController> cmdControls = new ArrayList<CommandController>();
        cmdControls.add(portalAccess);
        cmdControls.add(filterControls);
        Selection a = new Selection(cmdControls);
        User u = new User(a);
        u.useCommand("QUALITY");
    }

    @Test
    public void dtestClear() {
        PortalAccess portalAccess = new PortalAccess();
        FilterControls filterControls = new FilterControls();
        List<CommandController> cmdControls = new ArrayList<CommandController>();
        cmdControls.add(portalAccess);
        cmdControls.add(filterControls);
        Selection a = new Selection(cmdControls);
        User u = new User(a);
        u.useCommand("STOP");
    }

    @Test
    public void etestOrderShipment() {
        OrderServiceBuilder psb=new OrderServiceBuilder();
        OrderDeliveryService ps=psb.Name().IDSNumber().POBoxNumber().build();

        ps.createOrderService();

        ps.acknowledgedOrderService();

        ps.shippedOrderService();

        ps.transistionOrderService();

        ps.poBoxOrderService();

        ps.outforDeliveryOrderService();

        ps.deliveredOrderService();

    }
}