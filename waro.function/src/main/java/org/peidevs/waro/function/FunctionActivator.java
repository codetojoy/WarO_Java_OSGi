package org.peidevs.waro.function;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.google.common.collect.Lists;
import java.util.*; 

import org.peidevs.waro.player.*;

public class FunctionActivator implements BundleActivator {
    private static final String PREFIX = "waro.function build 6160";

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        System.out.println("TRACER: " + PREFIX + " start ");
        Object obj = Player.class;
        List<Integer> hand = new ArrayList<Integer>();
        hand.add(1);
        hand.add(2);
        hand.add(3);
        hand.add(4);
        Lists.partition(hand, 2);
        System.out.println("TRACER: " + PREFIX + " after partition ");
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("TRACER: " + PREFIX + " stop ");
    }
}
