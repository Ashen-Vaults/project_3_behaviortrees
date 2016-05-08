/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.idsia.agents.learning.behaviorTree.conditions;

import ch.idsia.agents.Agent;
import ch.idsia.agents.controllers.BasicMarioAIAgent;
import ch.idsia.agents.learning.behaviorTree.Task;

/**
 *
 * @author Alexsh
 */
public abstract class Condition extends Task {


    public Condition(BasicMarioAIAgent _agent) {
        super(_agent);
    }

    @Override
    public boolean run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
