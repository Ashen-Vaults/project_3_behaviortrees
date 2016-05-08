/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.idsia.agents.learning.behaviorTree.Decorators;

import ch.idsia.agents.controllers.BasicMarioAIAgent;

/**
 *
 * @author Alexsh
 */
public class UntilFail extends Decorator {
    
    public UntilFail(BasicMarioAIAgent _agent) {
        super(_agent);
    }
    
}
