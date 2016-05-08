/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.idsia.agents.learning.behaviorTree.Decorators;

import ch.idsia.agents.Agent;
import ch.idsia.agents.controllers.BasicMarioAIAgent;
import ch.idsia.agents.learning.behaviorTree.Task;
import ch.idsia.agents.learning.behaviorTree.conditions.Condition;

/**
 *
 * @author Alexsh
 */
public class Inverter extends Decorator {
    
    public Inverter(BasicMarioAIAgent _agent, Task _task) {
        super(_agent, _task);
    }
    
    
    @Override
    public boolean run(){
        System.out.println("Inverting " + this._childTask.getClass().getSimpleName() + " ORIG: " + this._childTask.getStatus()  + "|\t|INVERT:" +!this._childTask.getStatus());
        return (!this._childTask.run());
    }
}
