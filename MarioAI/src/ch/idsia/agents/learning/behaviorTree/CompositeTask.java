/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.idsia.agents.learning.behaviorTree;

import ch.idsia.agents.Agent;
import java.util.ArrayList;

/**
 *
 * @author Alexsh
 */
public class CompositeTask extends Task {
    
    protected ArrayList<Task> myTasks = new ArrayList<>();

    public CompositeTask(Agent _agent) {
        super(_agent);
    }

    @Override
    public boolean run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
