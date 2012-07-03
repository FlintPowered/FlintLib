package net.canarymod.plugin;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

import net.canarymod.config.ConfigurationFile;

/**
 * A Canary Mod Plugin.
 * 
 * @author Chris
 * 
 */
public abstract class Plugin {

    protected String name = null;
    private ArrayList<PriorityNode> priorities = null;
    
    /**
     * CanaryMod will call this upon enabling this plugin
     */
    public abstract void enable();

    /**
     * CanaryMod will call this upon disabling this plugin
     */
    public abstract void disable();

    /**
     * Return this plugins name.
     * 
     * @return
     */
    public String getName() {
        if (this.name != null) {
            return this.name;
        }
        else {
            return this.getClass().getSimpleName();
        }
    }
    
    void setName(String name) {
        this.name = name;
    }
    
    /**
     * Sets a priority node's value.
     * @param priorityName The node
     * @param priorityValue The value
     */
    public void setPriority(String priorityName, int priorityValue) {
        setPriority(priorityName, priorityValue, false);
    }
    
    /**
     * Sets a priority node's value.
     * @param priorityName The node
     * @param priorityValue The value
     * @param updateINF True if to update the Canary.inf
     */
    public void setPriority(String priorityName, int priorityValue, boolean updateINF) {
        if (this.priorities == null) {
            this.priorities = new ArrayList<PriorityNode>();
        }
        Iterator<PriorityNode> pIterator = this.priorities.iterator();
        while (pIterator.hasNext()) {
           PriorityNode node = pIterator.next();
           if (node.getName().equals(priorityName)) {
               pIterator.remove();
               break;
           }
        }
        this.priorities.add(new PriorityNode(priorityName, priorityValue));
        
        if (updateINF) {
            ConfigurationFile manifesto = new ConfigurationFile(getClass().getResourceAsStream("Canary.inf"));
            manifesto.setString("priority-" + priorityName, String.valueOf(priorityValue));
            try {
                manifesto.save();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    /**
     * Gets a registered priority node.
     * @param priorityName The node
     * @return The node, or null if doesn't exist.
     */
    public PriorityNode getPriorityNode(String priorityName) {
        if (this.priorities == null) {
            return null;
        }
        Iterator<PriorityNode> pIterator = this.priorities.iterator();
        while (pIterator.hasNext()) {
           PriorityNode node = pIterator.next();
           if (node.getName().equals(priorityName)) {
               return node;
           }
        }
        return null;
    }
    
    

    /**
     * Pass me the hash please
     */
    @Override
    public int hashCode() {
        int hash = 6; //number of chars in "Plugin" :P
        return hash * getName().hashCode(); //anyone got a better idea?
    }

    public boolean equals(Object obj) {
        return false;
    }
}
