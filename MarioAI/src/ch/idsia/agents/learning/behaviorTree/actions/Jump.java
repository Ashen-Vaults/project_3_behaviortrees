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
public class Jump extends Task{

    public Jump(BasicMarioAIAgent _agent) { 
        super(_agent);
    }

    @Override
    public boolean run() {
        if(this._agent.isIsMarioAbleToJump()){
            this._agent.action[Mario.KEY_SPEED] = this._agent.action[Mario.KEY_JUMP] = this._agent.isIsMarioAbleToJump() || !this._agent.isIsMarioOnGround();            
            return true;
        }
        System.out.println("I CANOT jump");
        return false;
    }
    
}
