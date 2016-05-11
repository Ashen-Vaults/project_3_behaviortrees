/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.idsia.agents.learning.behaviorTree.conditions;

import ch.idsia.agents.controllers.BasicMarioAIAgent;
import ch.idsia.benchmark.mario.engine.sprites.Mario;

/**
 *
 * @author Alexsh
 */
public class IsCoinObtainable extends Condition{
    
    public IsCoinObtainable(BasicMarioAIAgent _agent) {
        super(_agent);
    }
    
    @Override
    public boolean run(){
        //System.out.println("Looking for coins");
        if(this._agent.getReceptiveFieldCellValue(this._agent.getMarioEgoRow() + 2, this._agent.getMarioEgoCol()) == 1){
            if(Mario.large || Mario.fire)  this._agent.action[Mario.KEY_SPEED] = true;
             this._agent.action[Mario.KEY_LEFT] = true;
            return true;
        }
        return false;
    }
    
}
