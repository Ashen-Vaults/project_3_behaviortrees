/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.idsia.agents.learning.behaviorTree.conditions;

import ch.idsia.agents.controllers.BasicMarioAIAgent;

/**
 *
 * @author Alexsh
 */
public class IsNearPit extends Condition{
    
    public IsNearPit(BasicMarioAIAgent _agent) {
        super(_agent);
    }
    
    @Override
    public boolean run(){
        return this._agent.getReceptiveFieldCellValue(this._agent.getMarioEgoRow() + 2 , this._agent.getMarioEgoCol() + 1) == 0;
    }
    
}
