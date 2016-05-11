/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.idsia.agents.learning.behaviorTree.actions;

import ch.idsia.agents.Agent;
import ch.idsia.agents.controllers.BasicMarioAIAgent;
import ch.idsia.agents.learning.behaviorTree.Task;
import ch.idsia.benchmark.mario.engine.sprites.Mario;

/**
 *
 * @author Alexsh
 */
public class MoveRight extends Task{

    public MoveRight(BasicMarioAIAgent _agent) { 
        super(_agent, null);
    }

    @Override
    public boolean run() {  
        
        if(_agent.getReceptiveFieldCellValue(_agent.getMarioEgoRow(), _agent.getMarioEgoCol() + 1) == 0 || 
                _agent.getReceptiveFieldCellValue(_agent.getMarioEgoRow()+1, _agent.getMarioEgoCol()) == 0 ){
            //System.out.println("I will move right " + _agent.getReceptiveFieldCellValue(_agent.getMarioEgoRow(), _agent.getMarioEgoCol()+1));
            this._agent.action[Mario.KEY_LEFT] = false;
            this._agent.action[Mario.KEY_RIGHT] = true;
            //this._agent.action[Mario.KEY_SPEED] = false;
            return true;
        } 
        this._agent.action[Mario.KEY_RIGHT] = false;
        return false;
    }
    
}
