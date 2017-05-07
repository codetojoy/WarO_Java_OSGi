package org.peidevs.waro.app;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class AppActivator implements BundleActivator {

    private static final String PREFIX = "waro.main build 7170";

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        System.out.println("TRACER: " + PREFIX + " start ");
        try {
            Main.main(null);
            System.out.println("TRACER: " + PREFIX + " OK ");
        } catch (Exception ex) {
            System.err.println("TRACER: " + PREFIX + " caught exception ");
        }
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("TRACER: " + PREFIX + " stop ");
    }
}
