/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.idsia.agents.learning.behaviorTree.Decorators;

import ch.idsia.agents.Agent;
import ch.idsia.agents.controllers.BasicMarioAIAgent;
import ch.idsia.agents.learning.behaviorTree.Task;

/**
 * Decorators are nodes that can have 1 child, and their
 * function is to transform the result of their child's status,
 * terminate the child, or repeat its processing
 * @author Alexsh
 */
public abstract class Decorator extends Task
{
    protected Task _childTask;

    public Decorator(BasicMarioAIAgent _agent, Task _task) {
        super(_agent);
        _childTask = _task;
    }

    @Override
    public boolean run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
