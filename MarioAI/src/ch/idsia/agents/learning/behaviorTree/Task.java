/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.idsia.agents.learning.behaviorTree;

import ch.idsia.agents.Agent;
import ch.idsia.agents.controllers.BasicMarioAIAgent;
import ch.idsia.benchmark.mario.environments.Environment;

/**
 *
 * @author Alexsh
 */
public abstract class Task {
    protected BasicMarioAIAgent _agent;
    protected boolean _status;
    public boolean getStatus(){
        return _status;
    }
    public Task(BasicMarioAIAgent _agent){
        System.out.println("Created Task: " + this.getClass().getSimpleName());
        this._agent = _agent;
    }
    public abstract boolean run();

}
