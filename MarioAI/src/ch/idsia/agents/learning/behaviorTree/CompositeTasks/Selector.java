/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.idsia.agents.learning.behaviorTree.CompositeTasks;

import ch.idsia.agents.Agent;
import ch.idsia.agents.controllers.BasicMarioAIAgent;
import ch.idsia.agents.learning.behaviorTree.Task;
import java.util.ArrayList;

/**
 *
 * @author Alexsh
 */
public class Selector extends CompositeTask {
    
    public Selector(BasicMarioAIAgent _agent, ArrayList<Task> _tasks) {
        super(_agent, _tasks);
    }
    
    @Override
    public boolean run(){
        
        
        return false;
    }
    
}

