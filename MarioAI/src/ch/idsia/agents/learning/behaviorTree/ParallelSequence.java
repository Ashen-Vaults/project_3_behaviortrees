/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.idsia.agents.learning.behaviorTree;

import ch.idsia.agents.Agent;

/**
 * Runs all the children tasks in a sequence
 * in parallel (if one fails, it fails)
 * @author Alexsh
 */
public class ParallelSequence extends Sequence{
    
    public ParallelSequence(Agent _agent) {
        super(_agent);
    }
    
}
