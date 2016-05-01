/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.idsia.agents.learning.behaviorTree;

import ch.idsia.agents.Agent;

/**
 * Randomizes the order in which children are checked
 * @author Alexsh
 */
public class RandomSelector extends CompositeTask{
    
    public RandomSelector(Agent _agent) {
        super(_agent);
    }
    
}
