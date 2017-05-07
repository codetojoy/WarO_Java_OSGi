package org.peidevs.waro.config;

import org.peidevs.waro.player.Player;
import org.peidevs.waro.config.impl.Config;

// import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class ConfigService {
    private Config config = new Config(); 

    public int getNumCards() { return config.numCards(); }
    public int getNumGames() { return config.numGames(); }
    public boolean isVerbose() { return config.isVerbose(); }

    @SuppressWarnings("unchecked") 
    public List<Player> getPlayers() { return config.players(); }

    /*
    private final AnnotationConfigApplicationContext context;

    public ConfigService() {
        context = new AnnotationConfigApplicationContext(Config.class);
    }

    public int getNumCards() { return context.getBean(Config.BEAN_NUM_CARDS, Integer.class); }
    public int getNumGames() { return context.getBean(Config.BEAN_NUM_GAMES, Integer.class); }
    public boolean isVerbose() { return context.getBean(Config.BEAN_IS_VERBOSE, Boolean.class); }

    @SuppressWarnings("unchecked")
    public List<Player> getPlayers() {
        return context.getBean(Config.BEAN_PLAYERS, List.class);
    }
    */
}
