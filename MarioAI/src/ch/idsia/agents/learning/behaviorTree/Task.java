/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.idsia.agents.learning.behaviorTree;

import ch.idsia.agents.Agent;

/**
 *
 * @author Alexsh
 */
public abstract class Task {
    
    public Task(Agent _agent){}
    public abstract boolean run();

}
