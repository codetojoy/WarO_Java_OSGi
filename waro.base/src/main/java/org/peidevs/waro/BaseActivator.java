package org.peidevs.waro;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import org.peidevs.waro.config.ConfigService;

public class BaseActivator implements BundleActivator {
    private static final String PREFIX = "waro.base build 5150";

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        System.out.println("TRACER: " + PREFIX + " start ");
        try {
            // read configuration
            ConfigService configService = new ConfigService();
            int numCards = configService.getNumCards();
            int numGames = configService.getNumGames();
            System.out.println("TRACER: " + PREFIX + " start ");
            System.out.println("TRACER: " + PREFIX + " num games: " + numGames);
        } catch (Exception ex) {
            System.err.println("TRACER: " + PREFIX + " caught exception");
            System.err.println("TRACER: " + ex.getMessage());
        }
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("TRACER: " + PREFIX + " stop ");
    }
}
