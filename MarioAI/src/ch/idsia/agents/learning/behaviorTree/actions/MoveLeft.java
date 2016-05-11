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
public class MoveLeft extends Task{

    public MoveLeft(BasicMarioAIAgent _agent) { 
        super(_agent, null);
    }

    @Override
    public boolean run() {   
        if(_agent.getReceptiveFieldCellValue(_agent.getMarioEgoRow()-1, _agent.getMarioEgoCol()) == 0){
            System.out.println("I will move LEFT " + _agent.getReceptiveFieldCellValue(_agent.getMarioEgoRow()-1, _agent.getMarioEgoCol()));
            this._agent.action[Mario.KEY_RIGHT] = false;
            this._agent.action[Mario.KEY_LEFT] = true;

            return true;
        } 
        this._agent.action[Mario.KEY_LEFT] = false;
        return false;

    }
    
}
